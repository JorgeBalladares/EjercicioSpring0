package com.example.EjercicioSpringboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
class UsuarioController {


    @GetMapping("/user/{name}")
    @ResponseBody
    public String getNombre(@PathVariable String name) {
        return "Hola: "+name;

    }

    @PostMapping("/useradd")
    public Persona funcionP (@RequestBody Persona p) {
        return p;
    }

}
