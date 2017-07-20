package com.cainiaobangbang.www.cloudhello;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
@RestController  
@EnableAutoConfiguration 
public class SampleController {
	@RequestMapping("/")  
    String home() {  
        return "Hello World!";  
    }  
      
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) {  
        return "Hello "+myName+"!!!";  
    }  
	
}
