package com.tx.demo.controller;

import com.tx.demo.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skoppart on 11/1/2021
 */
@RestController
public class ProjectController {

    @Autowired
    private ProjectManagementService projectManagementService;

    @GetMapping(value = "/test")
    public String test() {
        projectManagementService.getCount();
        return "Hello World!";
    }
}
