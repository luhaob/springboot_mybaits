package com.demo.example.controller;

import com.demo.example.daomain.Happiness;
import com.demo.example.service.HappinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HappinessController {
    private static final Logger logger = LoggerFactory.getLogger(HappinessController.class);

    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery(){
      logger.info("aaaaaa");
        return null;
    }

    @RequestMapping("/insert")
    public Happiness testInsert(){
      return null;}
}
