
package Sisibib.codigo_sisbib.model;

//Aqu{i llevaremos el control de los prestamos de cada libro.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Prestamo_Libro {
    
    @Id
    @Column
    private long id_numprestamo;
    
    
    
    @Column
    private long id_codlibro;
    
}
