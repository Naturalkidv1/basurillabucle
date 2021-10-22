package ejerbucles;

import java.util.Scanner;

/**
 *
 * @author ajbazan01
 */
public class Ej02 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduzca un número que haga una rima jocosa");
        int n = 1;
        int m = entradaTeclado.nextInt();
        for (int x = 15; n <= m; n++, x = x * 2) {
            System.out.println(x);
            System.out.println(" - ");

        }

    }

}
