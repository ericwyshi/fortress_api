package com.hybris.fortress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class FortressConfig {

    @Bean
    public Map<String, String> getConfigParameter(){
        String configParameterFileName = "ConfigParameter.properties";
        Map<String, String> configMap = new HashMap<>();

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configParameterFileName);
            Properties properties = new Properties( );
            if (inputStream != null){
                properties.load(inputStream);
            }
            for (String name : properties.stringPropertyNames()) {
                configMap.put(name, properties.getProperty(name));
            }
        }catch (IOException e){
            System.out.println("read config file error!");
        }
        return configMap;
    }

}
