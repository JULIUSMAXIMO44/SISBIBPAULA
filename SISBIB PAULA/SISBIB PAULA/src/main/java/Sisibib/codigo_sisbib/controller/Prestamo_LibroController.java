
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Prestamo_Libro;
import Sisibib.codigo_sisbib.services.Prestamo_LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prestamo_libro")
public class Prestamo_LibroController {
    
    @Autowired
    private Prestamo_LibroService prestamo_libroService;
    
    public  Prestamo_Libro newPrestamo_Libro(@RequestBody Prestamo_Libro newprestamo_libro){
        return this.prestamo_libroService.newPrestamo_Libro(newprestamo_libro);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Prestamo_Libro> getAll(){
        return prestamo_libroService.getAll();
    }
    
    @PostMapping("/modificar")
    public Prestamo_Libro updatePrestamo_Libro(@RequestBody Prestamo_Libro prestamo_libro){
        return this.prestamo_libroService.modifyLibro_Autor(prestamo_libro);
    }
    
    public Boolean deletePrestamo_Libro(@PathVariable(value = "id")Long id){
        return this.prestamo_libroService.deleteAutor(id);
    }
}
