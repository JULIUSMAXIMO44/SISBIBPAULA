
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Libro_Autor;


public interface Libro_AutorService {
    Libro_Autor newLibro_Autor (Libro_Autor newLibro_Autor);
    Iterable<Libro_Autor> getAll();
    Libro_Autor modifyLibro_Autor (Libro_Autor libro_autor);
    Boolean deleteAutor (Long id_empleado);
    
}
