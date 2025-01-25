package com.akito.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class paymentController {
    @GetMapping("/payment")
    public String payment() {
        return "payment";
    }
   
    
}
