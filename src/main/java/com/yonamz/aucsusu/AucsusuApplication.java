package com.yonamz.aucsusu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AucsusuApplication {

    public static void main(String[] args) {
        SpringApplication.run(AucsusuApplication.class, args);
    }

}
