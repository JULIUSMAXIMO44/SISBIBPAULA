
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Bibliotecario_Usuario;
import Sisibib.codigo_sisbib.services.Bibliotecario_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bibliotecario_usuario")
public class Bibliotecario_UsuarioController {
    
    @Autowired
    private Bibliotecario_UsuarioService bibliotecario_usuarioService;
    
    @PostMapping("/nuevo")
    public Bibliotecario_Usuario newBibliotecario_Usuario(@RequestBody Bibliotecario_Usuario newbibliotecario_Usuario){
        return this.bibliotecario_usuarioService.newBibliotecario_Usuario(newbibliotecario_Usuario);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Bibliotecario_Usuario> getAll(){
        return bibliotecario_usuarioService.getAll();
    }
    
    @PostMapping("/modificar")
    public Bibliotecario_Usuario updateBibliotecario_Usuario(@RequestBody Bibliotecario_Usuario bibliotecario_usuario){
        return this.bibliotecario_usuarioService.modifyBibliotecario_Usuario(bibliotecario_usuario);
    }
    
    @PostMapping (value = "/{id}")
    public Boolean deleteBibliotecario_Usuario(@PathVariable(value = "id") long id) {
        return this.bibliotecario_usuarioService.deleteBibliotecario_Usuario(id);
    }
}
