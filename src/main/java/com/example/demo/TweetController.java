package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TweetController {
    @Autowired
    private TweetService tweetService;
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/add")
    public void addTweet() {
        tweetService.addTweet();
    }

    @GetMapping("/view")
    public List<Tweet> viewTweets() {
        return tweetService.getTweets();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @GetMapping("/getDepartments")
    public List<Department> getDepartment(){
        return departmentRepository.findAll();
    }
}
