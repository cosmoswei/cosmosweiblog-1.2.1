package com.wei.cosmosweiblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FooterController {
    @RequestMapping("/help")
    public String footerHelp(){
        return "footer/help";
    }
    @RequestMapping("/privacy")
    public String footerpPivacy (){
        return "footer/privacy";
    }
    @RequestMapping("/specification")
    public String footerSpecification(){
        return "footer/specification";
    }
    @RequestMapping("/cookieProtocol")
    public String footerCookieProtocol(){
        return "footer/cookieProtocol";
    }
    @RequestMapping("/copyright")
    public String footerCopyright(){
        return "footer/copyright";
    }
}
