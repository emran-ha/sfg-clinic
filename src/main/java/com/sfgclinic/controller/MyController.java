package com.sfgclinic.controller;

import com.sfgclinic.datasource.DataSource;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private DataSource dataSource;
    public MyController(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public String hello() {
        System.out.println(dataSource.getName()+ " controller");
        return "greetings.hello();";
    }


}
