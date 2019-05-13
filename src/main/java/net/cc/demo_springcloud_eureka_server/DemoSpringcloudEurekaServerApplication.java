package net.cc.demo_springcloud_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoSpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudEurekaServerApplication.class, args);
    }
}