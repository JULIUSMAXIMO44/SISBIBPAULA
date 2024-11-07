
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Libro_Autor;
import Sisibib.codigo_sisbib.repository.Libro_AutorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Libro_AutorServiceImpl implements Libro_AutorService{
    
    
    @Autowired
    private Libro_AutorRepository  libro_autorRepository;
        

    @Override
    public Libro_Autor newLibro_Autor(Libro_Autor newLibro_Autor) {
          return libro_autorRepository.save(newLibro_Autor);
   
        
    }

    @Override
    public Iterable<Libro_Autor> getAll() {
         return this.libro_autorRepository.findAll();
    }

    @Override
    public Libro_Autor modifyLibro_Autor(Libro_Autor libro_autor) {
         
        Optional<Libro_Autor> libro_autorEncontrado= this.libro_autorRepository.findById(libro_autor.getId_codlibro());
        if (libro_autorEncontrado.get()!=null){
            libro_autorEncontrado.get().setId_codautor(libro_autor.getId_codautor());
            
        }
        return null;
    }

    @Override
    public Boolean deleteAutor(Long id_empleado) {
         return null;
    }
    
}
