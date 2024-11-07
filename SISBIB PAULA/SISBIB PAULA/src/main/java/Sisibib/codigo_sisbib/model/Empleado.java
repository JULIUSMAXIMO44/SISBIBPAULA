
package Sisibib.codigo_sisbib.model;

//En esta clase, integramos los datos de nuestros empleados.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class Empleado {
    @Id
    @Column
    private long id_empleado;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private long telefono;
    
    @Column
    private String direccion;
    
    @Column
    private String email;
    
    
    
            
            
    
}
