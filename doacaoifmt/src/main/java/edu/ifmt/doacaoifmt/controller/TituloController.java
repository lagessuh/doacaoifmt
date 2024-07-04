package edu.ifmt.doacaoifmt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import edu.ifmt.doacaoifmt.model.Titulo;
import edu.ifmt.doacaoifmt.repository.Titulos;


@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired
    private Titulos titulos;

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("titulo", new Titulo());
        return "CadastroTitulo";
    }
    
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Titulo titulo, RedirectAttributes redirectAttributes) {
        try {
            titulos.save(titulo);
            redirectAttributes.addFlashAttribute("message", "Doação cadastrada com sucesso!");
            redirectAttributes.addFlashAttribute("messageType", "success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Erro ao cadastrar doação. Tente novamente.");
            redirectAttributes.addFlashAttribute("messageType", "error");
        }
        return "redirect:/titulos/novo";
    }
    
		
}

