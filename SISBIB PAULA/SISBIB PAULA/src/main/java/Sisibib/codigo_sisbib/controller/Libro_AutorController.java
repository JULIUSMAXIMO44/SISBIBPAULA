
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Libro_Autor;
import Sisibib.codigo_sisbib.services.Libro_AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/libro_autor")
public class Libro_AutorController {
    
    @Autowired
    private Libro_AutorService  libro_autorService;
    
    public Libro_Autor newLibro_Autor(@RequestBody Libro_Autor newlibro_autor) {
        return this.libro_autorService.newLibro_Autor(newlibro_autor);
    }
    

    @GetMapping("/mostrar")
    public Iterable<Libro_Autor> getAll(){
        return libro_autorService.getAll();
    }
    
    @PostMapping("/modificar")
    public Libro_Autor updateLibro_Autor(@RequestBody Libro_Autor libro_autor){
        return this.libro_autorService.modifyLibro_Autor(libro_autor);
    }
    
    @PostMapping (value = "/{id}")
    public Boolean deleteLibro_Autor(@PathVariable(value = "id") Long id){
        return this.libro_autorService.deleteAutor(id);
    }
}    
  
