package com.portfolio.nat.Entity;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.bridge.IMessage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter//Lombok hace los getters y setters automáticamente
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //va a ser Autogenerado
    private Long id;

    @NotNull
    @Size(min = 1, max =50, message = "No cumple con la longitud mínima")
    private String nombre;

    @NotNull
    @Size(min =1, max= 50, message = "No cumple con la longitud mínima")
    private String apellido;

    @Size(min =1, max= 50, message = "No cumple con la longitud mínima")
    private String img;


    public Persona() {
    }
}
