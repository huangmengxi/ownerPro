package com.xn.firstBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ImportResource({"file:config/disconf.xml"})
@ComponentScan("com.xn.firstBoot.*")
public class Application
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }
}
