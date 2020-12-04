package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity // This tells Hibernate to make a table out of this class
public class picURL {

    @Column(nullable = false)
	private String name;

    private String url;
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getid() {
        return url;
    }

    public void setid(int id) {
        this.id = id;
    }
    

}
