/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientada0ej5;
import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class Orientada0ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumatoria=0;
        int a;
        int cont;
        
        Scanner valor = new Scanner(System.in);
        
        for (cont=0; cont<10; cont++){
            
            System.out.println("ingrese un valor a sumar");
            a=valor.nextInt();
            sumatoria=sumatoria+a;
        }
        float prom=sumatoria/10;
        System.out.println("la sumatoria es de: "+sumatoria);
        System.out.println("el promedio es de: "+prom);
    }
    
}
