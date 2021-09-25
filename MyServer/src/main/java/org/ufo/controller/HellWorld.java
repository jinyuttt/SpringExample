package org.ufo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellWorld {
    @RequestMapping("/hi")
    public String home()
    {
        return "hello jinyu";
    }
}
