package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/ZZOng"} )
    public String goMain(){
        return "ZZOng";
    }
    
}
