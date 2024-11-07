
package Sisibib.codigo_sisbib.repository;

import Sisibib.codigo_sisbib.model.Prestamo_Libro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Prestamo_LibroRepository extends JpaRepository<Prestamo_Libro, Long>{
    
}
