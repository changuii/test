package dev.test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    

    @GetMapping("/test")
    public String test(){
        return "hello";
    }


    @GetMapping("/testtest")
    public String testtet() {return "test";}
}
