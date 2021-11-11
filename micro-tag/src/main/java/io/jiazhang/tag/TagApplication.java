package io.jiazhang.tag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2021-11-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TagApplication {
    public static void main(String[] args) {
        SpringApplication.run(TagApplication.class,args);
    }
}
