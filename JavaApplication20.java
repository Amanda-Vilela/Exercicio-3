/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       double A, B, C, X1, X2, delta;
       
       System.out.println("Digite o valor de A = ");
       A = entrada.nextDouble(); 
       
       System.out.println("Digite o valor de B = ");
       B = entrada.nextDouble(); 
       
       System.out.println("Digite o valor de C = ");
       C = entrada.nextDouble(); 
       
       if (A!=0){
       delta = (double) (Math.pow(B,2)-(4*A*C));
       
       if(delta>0)
       {
        X1 = ((-B) +Math.sqrt(delta))/(2*A);
        X2 = ((-B) -Math.sqrt(delta))/(2*A);
        System.out.println("As raizes s√o X1: "+X1+" e X2: "+X2);
       }
       else if (delta == 0)
       {
           X1 = ((-B) +Math.sqrt(delta))/(2*A);
           System.out.println(" As raizes s√£o X1: "+X1);
       }
       else if (delta<0){
       System.out.println("A equaÁ„o n„o apresenta resultados reais");
    }
    }
}
    
}
    
    

