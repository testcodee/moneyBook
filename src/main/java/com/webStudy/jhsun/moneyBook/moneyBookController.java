package com.webStudy.jhsun.moneyBook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class moneyBookController {
    @GetMapping("/")
    public String showMainPage(Model model){

        return "";
    }
}
