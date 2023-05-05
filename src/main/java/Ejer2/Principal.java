package Ejer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Persona per1 = new Persona("Antonio Costas Salazar", "72228550V", LocalDate.of(2002, 5, 24));
        Persona per2 = new Persona("Miguel Costas Salazar", "72888880K", LocalDate.of(2002, 5, 24));
        List<Persona> personas = new ArrayList<>();
        personas.add(per1);
        Asociacion asociacion1 = new Asociacion(personas);
        Asociacion asociacion2 = new Asociacion();
        asociacion2.anadirPersona(per1);
        asociacion1.anadirPersona(per2);
    }
}