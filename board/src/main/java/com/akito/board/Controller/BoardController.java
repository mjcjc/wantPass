package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping
public class BoardController {
    //TODO: 게시판 post시키는 거 하기
    
    @GetMapping("/board")
    public String board() {
        return "board";
    }
    @PostMapping("board")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
    
}
