package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/ZZOng"} )
    public String goMain(){
        return "ZZOng";
    }
    
}
