
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Prestamo_Libro;


public interface Prestamo_LibroService {
    Prestamo_Libro  newPrestamo_Libro ( Prestamo_Libro  newPrestamo_Libro);
    Iterable<Prestamo_Libro> getAll();
    Prestamo_Libro  modifyLibro_Autor (Prestamo_Libro prestamo_libro);
    Boolean deleteAutor (Long id_numprestamo);
    
    
}
