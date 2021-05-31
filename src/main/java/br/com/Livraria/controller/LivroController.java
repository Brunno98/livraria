/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Livraria.controller;

import br.com.Livraria.model.Livro;
import br.com.Livraria.repository.LivroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author brunno
 */
@Controller
public class LivroController {
    
    @Autowired
    private LivroRepository livroRepository;
    
    @GetMapping("/gerenciar-livros")
    public String listarLivros(Model model) {
        model.addAttribute("listaLivros", livroRepository.findAll());
        return "gerenciar_livros";
    }
    
    @GetMapping("/novo-livro")
    public String novoLivro(Model model) {
        model.addAttribute("livro", new Livro());
        return "editar_livro";
    }
    
    @PostMapping("/salvar-livro")
    public String salvarLivro(Livro livro, BindingResult results) {
        if (results.hasErrors()) {
            return "editar_livro";
        }
        livroRepository.save(livro);
        return "redirect:/gerenciar-livros";
    }
    
    @GetMapping("/editar-livro/{id}")
    public String editarLivro(@PathVariable("id") long idLivro, Model model) {
        Optional<Livro> livro = livroRepository.findById(idLivro);
        model.addAttribute("livro", livro.get());
        return "editar_livro";
    }
    
    @GetMapping("/excluir-livro/{id}")
    public String deletarLivro(@PathVariable("id") long idLivro) {
        livroRepository.deleteById(idLivro);
        return "redirect:/gerenciar-livros";
    }
}
