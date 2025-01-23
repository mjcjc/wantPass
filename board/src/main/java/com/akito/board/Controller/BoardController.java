package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping
public class BoardController {
    
    
    @GetMapping("/board")
    public String board() {
        return "board";
    }
    
    
}
