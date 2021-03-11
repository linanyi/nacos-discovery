package com.ray.nacos.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ny
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryApplication.class, args);
    }

    @RestController
    public class HelloClass {
        @GetMapping("/hi")
        public String hello(@RequestParam("name") String name) {
            System.out.println("服务被调用");
            return "hi " + name;
        }
    }
}
