package com.miempresa.usuarios.controller;

import com.miempresa.usuarios.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        return authService.registerUser(username, password);
    }

    // Endpoint para iniciar sesión
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return authService.authenticateUser(username, password);
    }
}
