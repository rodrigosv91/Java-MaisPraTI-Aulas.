
package com.projeto.CRUD_SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.CRUD_SpringBoot.model.Contato;
import com.projeto.CRUD_SpringBoot.repository.Contatos;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Rodrigo
 */
@Controller
public class ContatosController {
    
    @Autowired
    private Contatos contatos;
     
    //Página inicial como /contatos
    @GetMapping(value={"/index","/contatos", "/", ""})
    public ModelAndView listar() {      
        List<Contato> lista = contatos.findAll(); 
        ModelAndView modelAndView = new ModelAndView("index");   // templates/ contatos.html
        modelAndView.addObject("contatos", lista);  //seta proprieda "contatos" (a ser recuperada em html)
        modelAndView.addObject("page", "contatos"); //seta pagina a ser carregada em index
        modelAndView.addObject("title", "Contatos");
        return modelAndView;
    }
    //carrega pagina /inserir contato
    @GetMapping("/inserir")
    public ModelAndView mostrarInserirContato() {       
        Contato contato = new Contato();       
        ModelAndView modelAndView = new ModelAndView("index");   
        modelAndView.addObject("contato", contato);  
        modelAndView.addObject("page", "inserir"); 
        modelAndView.addObject("title", "Inserir");
        return modelAndView;
    }
    //insere contato e carrega pagina /contatos 
    @PostMapping("/inserir")
    public ModelAndView inserirContato(@Valid @ModelAttribute("Contato") Contato contato, BindingResult result) {
                 
        if (result.hasErrors()) {  
            ModelAndView modelAndView = new ModelAndView("index");  
            modelAndView.addObject("contato", contato); 
            modelAndView.addObject("page", "inserir");   
            modelAndView.addObject("title", "Inserir");
            modelAndView.addObject("errors",result.getErrorCount()>0);
            return modelAndView;
        } 
        contatos.save(contato);  
        return listar();
    }     
    //edita contato e carrega pagina /contatos 
    @PostMapping("/editar")
    public ModelAndView editarContato(@Valid @ModelAttribute("Contato") Contato contato, BindingResult result) {
                   
        if (result.hasErrors()) { 
            ModelAndView modelAndView = new ModelAndView("index");  
            modelAndView.addObject("contato", contato); 
            modelAndView.addObject("page", "editar_contato");   
            modelAndView.addObject("title", "Editar Contato");
            modelAndView.addObject("errors",result.getErrorCount()>0);
            return modelAndView;
        } 
        contatos.save(contato);  
        return listar();
    } 

    //deleta contato e carrega pagina /contatos
    @GetMapping("/deletar/{id}")
    public String addContato(@PathVariable(name = "id") Long id) {
        if(contatos.existsById(id)){
            contatos.deleteById(id);  
        }
        return "redirect:/contatos";
    }
    //procura contato por id e carrega pagina /editar_contato
    @GetMapping("/editar/{id}")
    public ModelAndView mostrarEditarContato(@PathVariable(name = "id") Long id) { 
                
        if (contatos.existsById(id)){
            ModelAndView modelAndView; 
            Optional<Contato> contato = contatos.findById(id); 
            modelAndView = new ModelAndView("index");   
            modelAndView.addObject("contato", contato);  
            modelAndView.addObject("page", "editar_contato");
            modelAndView.addObject("title", "Editar Contato"); 
            return modelAndView;
        } else {             
            return listar();
        }
    } 
}
