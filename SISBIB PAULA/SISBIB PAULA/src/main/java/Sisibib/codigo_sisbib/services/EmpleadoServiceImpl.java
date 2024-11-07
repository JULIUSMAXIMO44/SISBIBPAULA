
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Empleado;
import Sisibib.codigo_sisbib.repository.EmpleadoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private  EmpleadoRepository empleadoRepository;

    @Override
    public Empleado newEmpleado(Empleado newEmpleado) {
       return empleadoRepository.save(newEmpleado) ;
    }

    @Override
    public Iterable<Empleado> getAll() {
        return this.empleadoRepository.findAll();
    }

    @Override
    public Empleado modifyEmpleado(Empleado empleado) {
        Optional<Empleado> empleadoEncontrado= this.empleadoRepository.findById(empleado.getId_empleado());
        if (empleadoEncontrado.get()!=null) {
            empleadoEncontrado.get().setNombre(empleado.getNombre());
            empleadoEncontrado.get().setApellido(empleado.getApellido());
            empleadoEncontrado.get().setTelefono(empleado.getTelefono());
            empleadoEncontrado.get().setDireccion(empleado.getDireccion());
            empleadoEncontrado.get().setEmail(empleado.getEmail());
            
                    
        }
        return null;
        
    }

    @Override
    public Boolean deleteEmpleado(Long id_empleado) {
        return null;
    }
    
}
