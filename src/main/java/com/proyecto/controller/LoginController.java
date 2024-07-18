package com.proyecto.controller;

import com.proyecto.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/usuario")
public class LoginController {
    @Autowired
    private LoginService loginService;
    
    @GetMapping("/crearCuenta")
    public String inicio(Model model){
        return "/usuario/crearCuenta";
    }
}
