package ejerbucles;

import java.util.Scanner;

public class BucleConFor {

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("-------------------------");
            System.out.println("CALCULADORA FACTORIAL");
            System.out.println("-------------------------");
            System.out.println("1. Ejecutar el programa");
            System.out.println("2. Finalizar");

            Scanner entradaTeclado = new Scanner(System.in);

            System.out.println("Introduzca la opción deseada.");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Introduzca un número para hacer su factorial");
                    int n = entradaTeclado.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial = factorial * i; }
                    System.out.println("!" + n + " es " + factorial);
                    break;

                case 2:
                    
                    System.out.println("Programa finalizado");
                    break;
                    
                default: 
                    System.out.println("Opción incorrecta, por favor introduzca una opción válida.");
                break;    
            }
            

        } while (opcion != 2);
    }
}
