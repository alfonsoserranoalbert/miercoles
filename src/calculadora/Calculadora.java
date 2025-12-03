package calculadora;

//Añadida la funcionalidad X. Fixes #3

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ CALCULADORA ===");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Introduce el primer número: ");
            int a = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int b = sc.nextInt();

            int resultado;

            if (opcion == 1) {
                resultado = a + b;
                System.out.println("Resultado de la suma: " + resultado);
            } else if (opcion == 2) {
                resultado = a - b;
                System.out.println("Resultado de la resta: " + resultado);
            } else {
                System.out.println("Opción no válida");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
