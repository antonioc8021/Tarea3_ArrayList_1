package Ejer2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Persona per1 = new Persona("Antonio Costas Salazar", "72228550V", LocalDate.of(2002, 05, 24));
        ArrayList <Persona> personas=new ArrayList<>();
        personas.add(per1);
        Asociacion asoci = new Asociacion(personas);
    }
}