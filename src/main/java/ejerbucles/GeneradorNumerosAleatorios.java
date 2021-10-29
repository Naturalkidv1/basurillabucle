package ejerbucles;

import java.util.Random;

public class GeneradorNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Random numAleatorio = new Random();

        // n aleatorio, rango todos los enteros
        int n = numAleatorio.nextInt();

        //
        for (int i = 0; i < 5; i++) {
            System.out.println(numAleatorio.nextInt());
        }

        //decimal entre 0.0 y 1.0, el 1.0 nunca sale
        double d = numAleatorio.nextDouble();

        // true o false aleatorio
        boolean b = numAleatorio.nextBoolean();

        // numeros int entre 0 y 10, el 10 nunca sale
        int n1 = numAleatorio.nextInt(10);

        // entre 1 y 20, 20 incluido
        int n2 = numAleatorio.nextInt(20) + 1;

        // entre 0 y 20, incluidos
        int n3 = numAleatorio.nextInt(21);

        // numeros entre 25 y 75
        int n4 = numAleatorio.nextInt(75 - 25 + 1) + 25;
        //                                 51         
        
        
    }

}
