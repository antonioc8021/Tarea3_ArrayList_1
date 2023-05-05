package Ejer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Persona per1 = new Persona("Antonio Costas Salazar", "72228550V", LocalDate.of(2002, 5, 24));
        List<Persona> personas=new ArrayList<>();
        personas.add(per1);
        Asociacion asoci = new Asociacion(personas);
    }
}