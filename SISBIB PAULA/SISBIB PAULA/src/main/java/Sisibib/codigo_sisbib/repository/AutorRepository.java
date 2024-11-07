
package Sisibib.codigo_sisbib.repository;

import Sisibib.codigo_sisbib.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
    
}
