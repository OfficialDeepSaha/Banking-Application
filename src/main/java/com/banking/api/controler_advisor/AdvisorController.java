package com.banking.api.controler_advisor;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.banking.api.models.User;

@ControllerAdvice
public class AdvisorController {

    @ModelAttribute("registerUser")
    public User getUserDefaults(){
        return new User();
    }
}
