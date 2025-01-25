package com.akito.board.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.akito.board.dto.UserDTO;



@Controller

public class registerController {
    @GetMapping("/register")
    public String goRegister() {
        return "register";
    }
    @PostMapping("/register")
    public String postMethodName(@ModelAttribute UserDTO userDTO) {
        
        return "register";
    }
    
}
