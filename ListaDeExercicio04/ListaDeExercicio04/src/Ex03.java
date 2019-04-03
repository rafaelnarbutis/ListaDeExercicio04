/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael.fnarbutis
 */
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero decimal negativo ou positivo");
        double primeiroNumero = scn.nextDouble();
        
        if(primeiroNumero >= 0){
            
            System.out.println("Digite outro numero decimal positivo");
            double segundoNumeroP = scn.nextDouble();
            double resultP = segundoNumeroP + primeiroNumero;
            if(resultP >= 100){
                System.out.println("Isso e uma centena positiva");
            }else{
                System.out.println("Não e centena");
            }
            
        }else{
            System.out.println("Digite outro numero negativo");
            double segundoNumeroN = scn.nextDouble();
            double resultN = segundoNumeroN - primeiroNumero;
            if(resultN >= -100){
            
                System.out.println("Isso e uma centena negativa ");
            }else{
            
                System.out.println("Não e centena");
            }
        }
    }
    
    
}
