
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Autor;



public interface AutorService {
    Autor newAutor (Autor newAutor);
    Iterable<Autor> getAll();
    Autor modifyAutor (Autor autor);
    Boolean deleteAutor (Long id_codautor);
    
}
