package org.bedu.java.backend.session7ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaludoController {

    @GetMapping("/hola")
    public ModelAndView hola(){
        ModelAndView mav = new ModelAndView("/hola");
        mav.addObject("mensaje", "Hola desde Thymeleaf");

        return mav;
    }

    @GetMapping("/holaReto01")
    public ModelAndView holaParam(@RequestParam(name = "mensaje") String mensaje){
        ModelAndView mav = new ModelAndView("/hola");
        mav.addObject("mensaje", mensaje);

        return mav;
    }
}
