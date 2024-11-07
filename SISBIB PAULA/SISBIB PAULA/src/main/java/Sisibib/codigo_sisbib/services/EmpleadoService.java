
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Empleado;


public interface EmpleadoService {
    Empleado newEmpleado (Empleado newEmpleado);
    Iterable<Empleado> getAll();
    Empleado modifyEmpleado (Empleado empleado);
    Boolean deleteEmpleado (Long id_empleado);
    
}
