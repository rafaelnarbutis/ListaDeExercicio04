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
public class Ex06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um ano");
        double ano = scn.nextDouble();
        if((ano % 100) == 0){
           if((ano % 400) == 0){
               System.out.println("É um seculo bissexto");
           }
        }
        if((ano % 4)== 0){
         System.out.println("É um ano bissexto");
        }else{
            System.out.println("Ano digitado não e bissexto");
        }
        
       
        
        
    }
    
}
