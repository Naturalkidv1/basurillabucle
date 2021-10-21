/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerbucles;

/**
 *
 * @author ajbazan01
 */
public class Ej1 {

    
    public static void main(String[] args) {
        int x = 2;
        
        // este bucle se repite mientras x sea menor o igual que 100
        // cuando x sea 101 se para el bucle
        while (x<=100) {
            System.out.println(x);
            System.out.println(" - ");
            x = x + 1; // x++, ++x; x+=1;
        }
        System.out.println("x vale " + x);
        
    }
    
}
