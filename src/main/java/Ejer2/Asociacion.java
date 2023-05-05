package Ejer2;

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

    public Persona buscarPersona(String DNI){
        for (Persona persona : personas){
            if (persona.getDni().equals(DNI)){
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
