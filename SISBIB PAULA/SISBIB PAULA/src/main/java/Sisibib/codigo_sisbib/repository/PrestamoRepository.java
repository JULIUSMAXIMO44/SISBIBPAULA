
package Sisibib.codigo_sisbib.repository;

import Sisibib.codigo_sisbib.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{
    
}
