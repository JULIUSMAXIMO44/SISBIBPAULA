
package Sisibib.codigo_sisbib.model;

//En esta clase se inserta el codigo del bibliotecario y la identificacion del usuario.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Bibliotecario_Usuario {
    
    @Id
    @Column
    private long id_codempleado;
    
     @Column
    private long codusuario;
            
            
            
    
}
