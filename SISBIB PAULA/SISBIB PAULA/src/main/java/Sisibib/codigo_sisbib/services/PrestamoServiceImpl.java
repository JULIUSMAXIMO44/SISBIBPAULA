
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Prestamo;
import Sisibib.codigo_sisbib.repository.PrestamoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServiceImpl implements PrestamoService{
    
    @Autowired
    private PrestamoRepository prestamoRepository; 

    @Override
    public Prestamo newPrestamo(Prestamo newPrestamo) {
       return prestamoRepository.save(newPrestamo);
    }

    @Override
    public Iterable<Prestamo> getAll() {
       return this.prestamoRepository.findAll();
       
    }

    @Override
    public Prestamo modifyLibro_Autor(Prestamo prestamo) {
       
        Optional<Prestamo> prestamoEncontrado= this.prestamoRepository.findById(prestamo.getId_codprestamo());
        if ( prestamoEncontrado.get()!=null) {
              prestamoEncontrado.get().setCantidad_libros(prestamo.getCantidad_libros());
              prestamoEncontrado.get().setNombre_libro(prestamo.getNombre_libro());
              prestamoEncontrado.get().setFecha_prestamo(prestamo.getFecha_prestamo());
              prestamoEncontrado.get().setFecha_devolucion(prestamo.getFecha_devolucion());
              prestamoEncontrado.get().setCancelacion_prestamo(prestamo.getCancelacion_prestamo());
        }
        return null;
    }

    @Override
    public Boolean deleteAutor(Long id_codprestamo) {
       return null;
    }
    
}
