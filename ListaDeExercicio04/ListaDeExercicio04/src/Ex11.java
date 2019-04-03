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
public class Ex11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a idade do nadador para saber "
                + "sua categoria!!");
        int idade = scn.nextInt();
       if(idade >= 5){
           if(idade <= 7){
               System.out.println("Infantil A");
           }
           else{
               if(idade > 7){
               System.out.println("Infantil B");
               }else{
                     if(idade <= 13){
                     System.out.println("Juvenil A");
                     }else{
                           if(idade <= 17){
                           System.out.println("Juvenil B");
                           }else{
                                System.out.println("Senior");
                           }
                     }
               } 
           }
       }else{
           System.out.println("Não se encaixa na categoria");
       }
        
        
    }
    
}
