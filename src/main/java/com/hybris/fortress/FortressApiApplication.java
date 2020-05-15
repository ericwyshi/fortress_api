package com.hybris.fortress;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@SpringBootApplication
public class FortressApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortressApiApplication.class, args);
    }
}
