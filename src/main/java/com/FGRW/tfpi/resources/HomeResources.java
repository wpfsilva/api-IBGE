package com.FGRW.tfpi.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResources {
	@GetMapping("/")
    public String paginaInicial() {
        return "index";
    }
}
