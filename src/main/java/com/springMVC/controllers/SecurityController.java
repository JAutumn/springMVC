package com.springMVC.controllers;

import com.springMVC.core.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/security")
public class SecurityController {
    private final Logger logger = LoggerFactory.getLogger(SecurityController.class);
    
    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping("/loginfail")
    public String loginFail(Model uiModel, Locale locale) {
        logger.info("Lofin failed detected");
        uiModel.addAttribute("message", new Message("error", messageSource.getMessage("message_login_fail", new Object[]{}, locale)));
        return "contacts/list";
    }
}
