package com.hybris.fortress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.HttpMethodConstraint;

@SpringBootApplication
@RestController
public class FortressApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortressApiApplication.class, args);
    }

    @RequestMapping( value = "/sayhi", method = RequestMethod.GET)
    public String  sayHi(){
        return "sayhi";
    }

}
