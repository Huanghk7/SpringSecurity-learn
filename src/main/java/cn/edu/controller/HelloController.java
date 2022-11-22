package cn.edu.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanghk
 * @date 2022/11/14 14:12
 * @project SpringSecurity
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('system:dept:list')")
    public String hello() {
        return "hello";
    }
}
