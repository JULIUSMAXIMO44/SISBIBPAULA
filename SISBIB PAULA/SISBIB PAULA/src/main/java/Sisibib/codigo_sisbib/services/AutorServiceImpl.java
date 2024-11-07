
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Autor;
import Sisibib.codigo_sisbib.repository.AutorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AutorServiceImpl implements AutorService{
    
    @Autowired
    private AutorRepository autorRepository; 

    @Override
    public Autor newAutor(Autor newAutor) {
        return autorRepository.save(newAutor);
       
    }

    @Override
    public Iterable<Autor> getAll() {
       return this.autorRepository.findAll();
    }

    @Override
    public Autor modifyAutor(Autor autor) {
        
        Optional<Autor> autorEncontrado= this.autorRepository.findById(autor.getId_codautor());
        if(autorEncontrado.get()!=null){
            autorEncontrado.get().setNombre(autor.getNombre());
            autorEncontrado.get().setApellido(autor.getApellido()); 
            return this.newAutor(autorEncontrado.get());
        }
        
       return null;
    }

    @Override
    public Boolean deleteAutor(Long id_codautor) {
        this.autorRepository.deleteById(id_codautor);
        return true;
        
        
        
    }
    
}
