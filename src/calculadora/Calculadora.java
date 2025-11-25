package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        int resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);
    }
}
