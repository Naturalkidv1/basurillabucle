package ejerbucles;

import java.util.Scanner;

/**
 *
 * @author ajbazan01
 */
public class Ej05estrcdeselecc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String opciontxt;

        do { 
        System.out.println("\n Menú de opciones");
        System.out.println("-----------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("Salir. Finalizar");

        
                System.out.println("\n Elija una opción");
                opciontxt = entradaTeclado.nextLine();
                //int opcionnum = Integer.parseInt(opciontxt);
                
        switch (opciontxt) {
            case "1":
                System.out.println("Ha seleccionado calcular el área de un Cuadrado");
                break;
            case "2":
                System.out.println("Ha seleccionado calcular el área de un Triángulo");
                break;
            case "3":
                System.out.println("Ha seleccionado calcular el área de un Círculo");
                break;
            case "Salir":
                System.out.println("F I N");
                break;
            default:
              System.out.println("\n **Opción no valida**"); 
        }
            
        

}
    while (!(opciontxt.equals("Salir")));
}
}
