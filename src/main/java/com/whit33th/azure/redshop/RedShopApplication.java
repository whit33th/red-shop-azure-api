package com.whit33th.azure.redshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedShopApplication {
    @GetMapping("/message")
    public String message(){
        return "Hello zxc";
    }

    public static void main(String[] args) {
        SpringApplication.run(RedShopApplication.class, args);
    }

}
