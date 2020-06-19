package chenjiajin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping("/login-success")
    public String loginSuccess() {
        return "登录成功";
    }

    @RequestMapping("/r/r1")
    public String ceshi1() {
        return "访问资源 1 ";
    }

    @RequestMapping("/r/r2")
    public String ceshi2() {
        return "访问资源 2 ";
    }

}
