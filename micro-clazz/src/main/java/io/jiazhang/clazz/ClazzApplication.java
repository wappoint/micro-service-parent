package io.jiazhang.clazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2021-11-11
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClazzApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClazzApplication.class,args);
    }
}
