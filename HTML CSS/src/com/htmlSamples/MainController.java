package com.htmlSamples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showMainMenu() {
        return "main-menu";
    }

    @RequestMapping("/first-page")
    public String showFirstPage() {
        return "first-page";
    }

    @RequestMapping("/second-page")
    public String showSecondPage() {
        return "second-page";
    }

    @RequestMapping("/third-page")
    public String showThirdPage() {
        return "third-page";
    }

    @RequestMapping("/fourth-page")
    public String showFourthPage(){
        return "fourth-page";
    }

}
