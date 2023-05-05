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

}
