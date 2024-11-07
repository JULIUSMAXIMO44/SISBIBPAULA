
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Autor;
import Sisibib.codigo_sisbib.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController {
    
    @Autowired
    private AutorService autorService;
    
    @PostMapping("/nuevo")
    public Autor newAutor(@RequestBody Autor newAutor){
      return this.autorService.newAutor(newAutor);
        
        
    }
    
    @GetMapping("/mostrar")
    public Iterable<Autor> getAll(){
        return autorService.getAll();
    }
    
    @PostMapping("/modificar")
    public Autor updateAutor(@RequestBody Autor autor){
        return this.autorService.modifyAutor(autor);
    }
    
    @PostMapping (value = "/{id}")
    public Boolean deleteAutor(@PathVariable(value="id")Long id){
        return this.autorService.deleteAutor(id);
        
    }
    
    
    }
