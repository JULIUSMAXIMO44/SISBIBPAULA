
package Sisibib.codigo_sisbib.services;

import Sisibib.codigo_sisbib.model.Bibliotecario_Usuario;
import Sisibib.codigo_sisbib.repository.Bibliotecario_UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Bibliotecario_UsuarioServiceImpl implements Bibliotecario_UsuarioService{
    
    @Autowired
    private Bibliotecario_UsuarioRepository bibliotecario_usuarioRepository;

   
    @Override
    public Bibliotecario_Usuario newBibliotecario_Usuario(Bibliotecario_Usuario newBibliotecario_Usuario) {
        return bibliotecario_usuarioRepository.save(newBibliotecario_Usuario);
    }

    @Override
    public Iterable<Bibliotecario_Usuario> getAll() {
        return this.bibliotecario_usuarioRepository.findAll();
    }

    @Override
    public Bibliotecario_Usuario modifyBibliotecario_Usuario(Bibliotecario_Usuario bibliotecario_usuario) {
       
        Optional<Bibliotecario_Usuario> bibliotecario_usuarioEncontrado= this.bibliotecario_usuarioRepository.findById(bibliotecario_usuario.getId_codempleado());
        if (bibliotecario_usuarioEncontrado.get()!=null){
            bibliotecario_usuarioEncontrado.get().setCodusuario(bibliotecario_usuario.getCodusuario());
            return this.newBibliotecario_Usuario(bibliotecario_usuarioEncontrado.get());
       }
                
        return null;
    }

    @Override
    public Boolean deleteBibliotecario_Usuario(Long id_codempleado) {
    this.bibliotecario_usuarioRepository.deleteById(id_codempleado);
    return true;
    }
    
}
