
package com.projeto.CRUD_SpringBoot.repository;

import com.projeto.CRUD_SpringBoot.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rodrigo
 */
@Controller
@RequestMapping("/insere")
public class ContatosInsereController {
    
    @Autowired
    private Contatos contatos;
    
    @GetMapping
    public ModelAndView inserir() {       
        Contato contato = new Contato();       
        ModelAndView modelAndView = new ModelAndView("insere");   
        modelAndView.addObject("contato", contato);  
        return modelAndView;
    }
    
    @PostMapping
    public String addContato(@ModelAttribute("Contato") Contato contato) {
        contatos.save(contato);  
        return "redirect:/contatos";
    }
    
}
