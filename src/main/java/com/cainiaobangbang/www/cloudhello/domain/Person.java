package com.cainiaobangbang.www.cloudhello.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;  
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;  
    private String name;  
    private Integer age;
    private String address;
    public Person() {  
        super();  
    }  
    public Person(Long id, String name, Integer age) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.age = age;  
    }  
    public Person(Long id, String name, Integer age, String address) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.age = age;  
        this.setAddress(address);  
    }  
    public Long getId() {  
        return id;  
    }  
    public void setId(Long id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public Integer getAge() {  
        return age;  
    }  
    public void setAge(Integer age) {  
        this.age = age;  
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}  
}
