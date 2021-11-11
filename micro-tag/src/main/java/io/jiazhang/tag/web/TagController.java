package io.jiazhang.tag.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2021-11-11
 */
@RestController
public class TagController {
    @GetMapping("/hello")
    public String hello(){
        return "tag service ...";
    }
}
