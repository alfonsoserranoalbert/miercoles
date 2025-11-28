package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.println("Elige operación: 1) Suma  2) Resta");
        int opcion = sc.nextInt();

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
    }
}
