
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Prestamo;
import Sisibib.codigo_sisbib.services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    
    @Autowired
    private PrestamoService prestamoSertvice;
    
    public Prestamo newPrestamo (@RequestBody Prestamo newprestamo){
        return this.prestamoSertvice.newPrestamo(newprestamo);
    }
    
    
    @GetMapping("/mostrar")
    public Iterable<Prestamo> getAll(){
        return prestamoSertvice.getAll();
    }
    
    @PostMapping("/modificar")
    public Prestamo updatePrestamo(@RequestBody Prestamo prestamo)  {
        return this.prestamoSertvice.modifyLibro_Autor(prestamo);
              
    }
    
    @PostMapping (value = "/{id}")
    public Boolean deletePrestamo(@PathVariable(value = "id") Long id){
        return this.prestamoSertvice.deleteAutor(id);
    }
}
