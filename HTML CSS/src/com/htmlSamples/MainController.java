package com.htmlSamples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.io.File;

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

}
