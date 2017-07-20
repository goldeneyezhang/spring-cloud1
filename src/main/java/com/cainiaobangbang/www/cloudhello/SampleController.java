package com.cainiaobangbang.www.cloudhello;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.*;
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory; 
import org.springframework.web.bind.annotation.*;
@RestController  
@EnableAutoConfiguration 
public class SampleController {
	protected static Logger logger=LoggerFactory.getLogger(SampleController.class);
	@RequestMapping("/home")  
    String helloworld() {  
		logger.info("访问hello");
		logger.error("访问hello");
        return "Hello World!";  
    }  
      
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) {  
    	logger.info("访问helloName,Name={}",myName);  
    	 logger.warn("访问helloName,Name={}",myName);  
        return "Hello "+myName+"!!!";  
    }  
	
}
