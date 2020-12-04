package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

@SpringBootTest
class DemoApplicationTests {

	private picURLRepository userRepository;

	@Test
	void contextLoads() {
	}



	public ModelAndView addNewUser (String loginname, String pword) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
        
        ModelAndView returnPage = new ModelAndView();

        try {
            if(userRepository.findByName(loginname).getName() != null){
                returnPage.setViewName("registration"); 
            }
        } catch (Exception e) {
            User n = new User();
            picURL url = new picURL();
            url.setName(loginname);
            n.setName(loginname);
           // username = loginname;
            n.setPassword(pword);
           // userRepository.save(n);
           // picURLRepository.save(url);
		    returnPage.setViewName("editProfile");
        }
        return returnPage;
    }

	@Test
	void testAddNewUser(){
		ModelAndView returnPage = new ModelAndView();
		returnPage.setViewName("editProfile");
		
		assertEquals(returnPage.getView(), addNewUser("blah1", "blah2").getView());
	}

	public String login(){
        return "login";
	}
	
	@Test
	void testLogin(){
		assertEquals("login", login());
	}

}
