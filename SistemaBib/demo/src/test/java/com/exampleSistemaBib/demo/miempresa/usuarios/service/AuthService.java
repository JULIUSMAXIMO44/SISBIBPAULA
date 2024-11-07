package com.miempresa.usuarios.service;

import com.miempresa.usuarios.model.User;
import com.miempresa.usuarios.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Registro de un nuevo usuario
    public String registerUser(String username, String password) {
        Optional<User> existingUser = userRepository.findByUsername(username);
        if (existingUser.isPresent()) {
            return "Error: El usuario ya existe";
        }
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password));
        userRepository.save(newUser);
        return "Usuario registrado correctamente";
    }

    // Autenticación de usuario
    public String authenticateUser(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) {
            return "Error: Usuario no encontrado";
        }
        if (passwordEncoder.matches(password, user.get().getPassword())) {
            return "Autenticación satisfactoria";
        } else {
            return "Error: Contraseña incorrecta";
        }
    }
}
