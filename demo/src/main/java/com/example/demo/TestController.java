package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/**")
@RestController
public class TestController {
	@Value("${first.name}")
	private String firstName;
	
	@Value("${last.name}")
	private String lastName;
	
	
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget(firstName+lastName, 10, 7);
    }
}
