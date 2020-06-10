package com.telenor.assignment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/")
public class IndexController {

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String getIndex(){
        return "Hello Telenor";
    }


    }

