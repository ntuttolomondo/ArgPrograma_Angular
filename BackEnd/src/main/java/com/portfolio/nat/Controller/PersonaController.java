package com.portfolio.nat.Controller;

import com.portfolio.nat.Entity.Persona;
import com.portfolio.nat.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/personas/traer") //ok
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}") //ok
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctmente";
    }
//
    @PutMapping("/personas/editar/{id}")
        public Persona editPersona(@PathVariable Long id,
                @RequestParam("nombre") String nuevoNombre,
                @RequestParam("apellido") String nuevoApellido,
                @RequestParam("img") String nuevoImg) {
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        ipersonaService.savePersona(persona);
        return persona;
    }

}
