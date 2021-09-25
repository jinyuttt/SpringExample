package org.ufo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootUfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootUfoApplication.class, args);
    }
}
