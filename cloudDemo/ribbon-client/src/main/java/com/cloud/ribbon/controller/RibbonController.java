package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hello")
    public String hi(@RequestParam(required = false,defaultValue = "tz") String name) {

        return ribbonService.hi(name);
    }

}
