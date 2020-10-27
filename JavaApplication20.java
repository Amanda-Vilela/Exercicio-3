/*
 * Programa que receba 3 número e calcule a equação de segundo grau dando raízes 
 como resultado
*/
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @Amanda_Vilela
 */
public class JavaApplication20 {

    
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
        System.out.println("As raizes sÃo X1: "+X1+" e X2: "+X2);
       }
       else if (delta == 0)
       {
           X1 = ((-B) +Math.sqrt(delta))/(2*A);
           System.out.println(" As raizes sÃ£o X1: "+X1);
       }
       else if (delta<0){
       System.out.println("A equação não apresenta resultados reais");
    }
    }
}
    
}
    
    

