
package Sisibib.codigo_sisbib.model;

//En esta tabla llevaremos el control de todos los prestamos que se realicen.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Prestamo {
    
    @Id
    @Column
    private long id_codprestamo;
    
    @Column
    private long cantidad_libros;
    
    @Column
    private String nombre_libro;
    
     @Column
    private String fecha_prestamo;
     
    @Column
    private String fecha_devolucion;
    
     @Column
    private String cancelacion_prestamo;
    
    
    
    
    
    
    
    
    
}
