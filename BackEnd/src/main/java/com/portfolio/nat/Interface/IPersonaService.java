package com.portfolio.nat.Interface;

import com.portfolio.nat.Entity.Persona;

import java.util.List;

public interface IPersonaService {

    //Traer una persona

    public List<Persona> getPersona();

    //Guardar un objeto de tipo Persona

    public void savePersona(Persona persona);

    // Eliminar un objeto buscando por ID
    public void deletePersona(Long id);

    //Buscar persona por id
    public Persona findPersona(Long id);

}
