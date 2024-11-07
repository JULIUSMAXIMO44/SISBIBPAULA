
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Prestamo;


public interface PrestamoService {
    Prestamo newPrestamo (Prestamo newPrestamo);
    Iterable< Prestamo> getAll();
    Prestamo modifyLibro_Autor ( Prestamo  prestamo);
    Boolean deleteAutor (Long id_codprestamo);
    
}
