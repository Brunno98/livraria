/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Livraria.repository;

import br.com.Livraria.model.Livro;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author brunno
 */
public interface LivroRepository extends CrudRepository<Livro,Long>{
    
}
