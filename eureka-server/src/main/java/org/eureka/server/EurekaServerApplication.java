package org.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心启动类
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication 
{
	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
