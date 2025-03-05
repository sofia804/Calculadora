import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int repetir;
        do {
            int n1 = ale.nextInt(100) + 1;
            int n2 = ale.nextInt(100) + 1;

            System.out.println("CALCULADORA");
            System.out.println("Número 1: " + n1);
            System.out.println("Número 2 :" + n2);
            System.out.println("Ingrese la operación que desee realizar (+, -, *, /, ^, %)");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Elevado (^)");
            System.out.println("6. Modulo (%)");

            int opc = teclado.nextInt();

            switch (opc) {
                case 1 -> System.out.println("El resultado de la suma es: " + (n1 + n2));
                case 2 -> System.out.println("El resultado de la resta es:" + (n1 - n2));
                case 3 -> System.out.println("El resultado de la multiplicacion es:" + (n1 * n2));
                case 4 -> System.out.println("El resultado de la división es:" + ((double)n1 / n2));
                case 5 -> System.out.println("El resultado del número elevado es:" + (Math.pow(n1, n2)));
                case 6 -> System.out.println("El resultado del modulo es:" + (n1 % n2));
                default -> {
                    System.out.println("***OPCIÓN NO VÁLIDA***");
                    System.out.println("***SALIENDO DEL SISTEMA***");
                }
            }
            System.out.println("¿Desea realizar otra operación? (1 = Sí, 2 = No)");
            repetir = teclado.nextInt();


        } while (repetir == 1);
    }
}