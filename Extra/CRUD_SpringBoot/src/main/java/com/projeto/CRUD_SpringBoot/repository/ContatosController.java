
package com.projeto.CRUD_SpringBoot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.CRUD_SpringBoot.model.Contato;

/**
 *
 * @author Rodrigo
 */
@Controller
@RequestMapping("/contatos")
public class ContatosController {
    
    @Autowired
    private Contatos contatos;

    @GetMapping
    public ModelAndView listar() {
        
        List<Contato> lista = contatos.findAll(); 
        
        //contatos.save(new Contato("Jon2","Jom2"));
        //contatos.deleteAllInBatch();       
        //lista.add(new Contato("Jon","Pom"));

        ModelAndView modelAndView = new ModelAndView("contatos");   // templates/ contatos.html
        modelAndView.addObject("contatos", lista);  //seta proprieda "contatos" (a ser recuperada em html)

        return modelAndView;
    }
}
