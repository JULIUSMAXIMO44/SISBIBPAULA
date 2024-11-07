
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Prestamo_Libro;
import Sisibib.codigo_sisbib.repository.Prestamo_LibroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Prestamo_LibroSertviceImpl implements Prestamo_LibroService {
    
    @Autowired
    private Prestamo_LibroRepository  prestamo_libroRepository;

    @Override
    public Prestamo_Libro newPrestamo_Libro(Prestamo_Libro newPrestamo_Libro) {
        return prestamo_libroRepository.save( newPrestamo_Libro) ;
        
    }

    @Override
    public Iterable<Prestamo_Libro> getAll() {
          return this.prestamo_libroRepository.findAll();
    }

    @Override
    public Prestamo_Libro modifyLibro_Autor(Prestamo_Libro prestamo_libro) {
        
        Optional<Prestamo_Libro> prestamo_libroEncontrado= this.prestamo_libroRepository.findById(prestamo_libro.getId_numprestamo());
        if (prestamo_libroEncontrado.get()!=null){
             prestamo_libroEncontrado.get().setId_codlibro(prestamo_libro.getId_codlibro());
        }
        return null;
        
    }

    @Override
    public Boolean deleteAutor(Long id_numprestamo) {
        return null;
    }
    
}
