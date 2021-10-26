package com.example.formulario.formularioatelie.controller;

import com.example.formulario.formularioatelie.model.entity.Cliente;
import com.example.formulario.formularioatelie.model.entity.enums.TipoContato;
import com.example.formulario.formularioatelie.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContatoController {

    private final ClienteService clienteService;

    @Autowired
    public ContatoController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/contato")
    public ModelAndView contato(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contato");
        modelAndView.addObject("contato", new Cliente());


        return  modelAndView;
    }

    @PostMapping("/novo-contato")
    public String createContato(@ModelAttribute Cliente cliente, RedirectAttributes redirect){
        clienteService.salvarCliente(cliente);
        redirect.addFlashAttribute("message", "Cadastro realizado com sucesso");

        return "redirect:/contato";
    }


}
