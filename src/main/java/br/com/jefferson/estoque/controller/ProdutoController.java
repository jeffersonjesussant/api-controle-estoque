
package br.com.jefferson.estoque.controller;

import br.com.jefferson.estoque.model.Produto;
import br.com.jefferson.estoque.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    private final ProdutoRepository repository;
    
    public ProdutoController(ProdutoRepository repository){
        this.repository = repository;
        
    }
    
    @GetMapping
    public List<Produto> listar(){
        return repository.findAll();
    }
    
    @PostMapping
    public Produto criar(@RequestBody @Valid Produto produto){
        return repository.save(produto);
    }
}
