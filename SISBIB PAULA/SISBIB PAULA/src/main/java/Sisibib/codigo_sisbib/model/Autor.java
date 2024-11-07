
package Sisibib.codigo_sisbib.model;

//En esta clase, incluiremos los datos del Autor.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Autor {
    @Id
    @Column
    private long id_codautor;
    
    @Column
    private String nombre;
            
    @Column
    private String apellido;
}
