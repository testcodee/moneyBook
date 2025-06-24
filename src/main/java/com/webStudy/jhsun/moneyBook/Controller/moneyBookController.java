package com.webStudy.jhsun.moneyBook.Controller;

import com.webStudy.jhsun.moneyBook.Service.moneyBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class moneyBookController {

    private final moneyBookService moneyBookService;
    public moneyBookController(moneyBookService moneyBookService) {
        this.moneyBookService = moneyBookService;
    }

    @GetMapping("/")
    public String showMainPage(Model model){

        return "";
    }
}
