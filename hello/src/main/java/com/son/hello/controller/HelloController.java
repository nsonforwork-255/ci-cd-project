package main.java.com.son.hello.controller;

@RestController("hello")
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
}
