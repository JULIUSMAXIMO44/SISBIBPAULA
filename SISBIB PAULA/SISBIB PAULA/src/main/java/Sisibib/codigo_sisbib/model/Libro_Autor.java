
package Sisibib.codigo_sisbib.model;

//Enesta taabla, se colocaran los datos de los libros, segun el autor.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class Libro_Autor {
    
    @Id
    @Column
    private long id_codlibro;
    
    @Column
    private long id_codautor;
    
    
}
