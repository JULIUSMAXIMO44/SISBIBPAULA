
package Sisibib.codigo_sisbib.services;


import Sisibib.codigo_sisbib.model.Bibliotecario_Usuario;





public interface Bibliotecario_UsuarioService {
    Bibliotecario_Usuario newBibliotecario_Usuario ( Bibliotecario_Usuario newBibliotecario_Usuario);
    Iterable<Bibliotecario_Usuario> getAll();
    Bibliotecario_Usuario modifyBibliotecario_Usuario (Bibliotecario_Usuario bibliotecario_usuario);
    Boolean deleteBibliotecario_Usuario (Long id_codempleado);
}
