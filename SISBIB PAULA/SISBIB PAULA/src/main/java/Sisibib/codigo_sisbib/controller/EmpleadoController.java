
package Sisibib.codigo_sisbib.controller;

import Sisibib.codigo_sisbib.model.Empleado;
import Sisibib.codigo_sisbib.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @PostMapping("/nuevo")
    public Empleado newEmpleado(@RequestBody Empleado newempleado){
        return this.empleadoService.newEmpleado( newempleado);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Empleado> getAll(){
        return empleadoService.getAll();
    }
    
    @PostMapping("/modificar")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.modifyEmpleado(empleado);
    }
    
    @PostMapping(value = "/{id}")
    public Boolean deleteEmpleado(@PathVariable(value = "id") Long id){
        return this.empleadoService.deleteEmpleado(id);
    }
}
