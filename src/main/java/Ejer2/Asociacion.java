package Ejer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Asociacion {
    List<Persona> personas;


    // Constructor por defecto:
    public Asociacion() {
        this.personas = new ArrayList<>();
    }

    public Asociacion(List<Persona> personas) {
        this.personas = personas;
    }

    // métodos para añadir, buscar personas a la lista de personas:
    public void anadirPersona(Persona nuevaPersona) {
        this.personas.add(nuevaPersona);
        System.out.println("Persona añadida correctamente");
    }

    public Persona buscarPersona(String DNI) {
        for (Persona persona : personas) {
            if (persona.getDni().equals(DNI)) {
                int edad = LocalDate.now().getYear() - persona.getFechaNacimiento().getYear();
                if ((edad >= 5) && (edad <= 10)) {
                    persona.setCuota(1);
                }
                if ((edad >= 11) && (edad <= 17)) {
                    persona.setCuota(2.5);
                }
                if (edad >= 18) {
                    persona.setCuota(3.5);
                }
                return persona;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ASOCIACION: " +
                "\npersonas: " + personas;
    }

}
