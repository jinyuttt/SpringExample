package org.ufo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    private Logger log= LoggerFactory.getLogger(getClass());
    @RequestMapping("/defaultfallback")
    public Object fallacak(){
        log.info("熔断处理！！！");
        return "服务异常下线！！！";
    }
}