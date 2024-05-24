package com.example.carwashstub.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/logs")
    public String Logs() {
        logger.info("Info level");
        return "Сервис на доработке";
    }

}
