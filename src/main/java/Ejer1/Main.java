package Ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = leeValores();
        int media = calcularSuma(numeros) / numeros.size();
        mostrarResultado(numeros, calcularSuma(numeros), media);
    }

    public static void mostrarResultado(ArrayList<Integer> numeros, int suma, int mediaAritmetica) {
        System.out.println("Todos los valores mostrados por pantalla: " + numeros +
                "\nLa suma de todos los números es: " + suma +
                "\nSu media aritmética es: " + mediaAritmetica +
                "\nSon mayores a la media aritmética: ");
        for (Integer mayorMedia : numeros) {
            if (mayorMedia > mediaAritmetica) {
                System.out.println(mayorMedia);
            }
        }

    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int total = 0;
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            total += iterador.next();
        }
        // Esto podría estar mejor,pero suda:
        // iterador.remove();
        return total;
    }

// estos son pruebas de mierda
    public static ArrayList<Integer> leeValores() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int valor;
        do {
            System.out.print("Introduce un número (-99 para terminar): ");
            valor = scanner.nextInt();
            if (valor != -99) {
                valores.add(valor);
            }
        } while (valor != -99);
        return valores;
    }
}


