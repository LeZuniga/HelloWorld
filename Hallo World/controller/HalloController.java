package com.halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {

	@GetMapping
	public String hello() {
		return "Hello World!!!";
		
	}
	@GetMapping("/bsm")  //para indicar outro endereço
    public String bsm() {
        return "Comunicação <br /> "
                + "Persistência <br /> "
                + "Orientação ao Detalhe <br />"
                + "Trabalho em Equipe";
    }

    @GetMapping("/objetivos")  //para indicar outro endereço
    public String objetivos() {
        return "Meus objetivos de aprendizagem essa semana são: "
                + "<br /> Ver todos os vídeos     "
                + "<br /> Organizar o GitHub     "
                + "<br /> Praticar e realizar os exercícios";
            }

}
