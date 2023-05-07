package Ejer2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

// de verdad que es algo útil
public class Persona {
    private int cuota;
    private String nombre, dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos para asegurarse de que sean correctos o no
    // Aquí te mira si contiene letras mayúsculas y minúsculas como mínimo 3 sin máximo, en caso de ser menor salta error
    public boolean validarNombre() {
        return nombre.matches("[a-zA-Z0-9]{3,}");
    }

    // validar fecha, en caso de saltar la excepción retornará falso
    public boolean validarFecha() {
        try {
            LocalDate.parse(fechaNacimiento.toString());
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    // validar DNI:
    public boolean validarDNI() {
        // Comprobar que el DNI tiene nueve caracteres
        if (dni.length() != 9) {
            return false;
        }

        // Comprobar que los ocho primeros caracteres son números
        if (!dni.substring(0, 8).matches("[0-9]{8}")) {
            return false;
        }

        // Calcular la letra del DNI y comprobar que es correcta
        int numeroDNI = Integer.parseInt(dni.substring(0, 8));
        int resto = numeroDNI % 23;
        char letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(resto);
        return dni.charAt(8) == letraDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nPersona: " +
                "\nnombre: " + nombre +
                "\ndni: " + dni +
                "\nfechaNacimiento: " + fechaNacimiento;
    }
}