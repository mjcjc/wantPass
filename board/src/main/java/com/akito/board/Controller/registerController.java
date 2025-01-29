package com.akito.board.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akito.board.dto.UserDTO;
import com.akito.board.service.userService;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class registerController {
    private final userService uService;

    @GetMapping("/register")
    public String goRegister() {
        return "register";
    }
    @PostMapping("/register")
    public  String save(@ModelAttribute UserDTO userDTO)
    {
        uService.save(userDTO);
        return "ZZOng";
    }
}
