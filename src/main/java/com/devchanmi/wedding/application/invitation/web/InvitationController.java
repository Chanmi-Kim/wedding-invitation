package com.devchanmi.wedding.application.invitation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvitationController {
    @GetMapping(value = "/")
    public ModelAndView index(ModelAndView mnv) {
        mnv.setViewName("index");
        return mnv;
    }
}
