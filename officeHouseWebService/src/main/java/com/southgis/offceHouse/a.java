package com.southgis.offceHouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class a {

    @Autowired
    private polImpl pol;

    @PostMapping("/a")
    public String a(){
        return pol.a();
    }
}
