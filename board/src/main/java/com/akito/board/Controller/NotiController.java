package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotiController {
    
    
    @GetMapping("/notification")
    public String payment() {
        return "notification";
    }
}
