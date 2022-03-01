package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public String helloMe(){
        return "HelloMe";
    }
}
