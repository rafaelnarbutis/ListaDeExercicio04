/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o dia da semana para saber o numero correspondente ");
        String diaS = scn.nextLine();
       if(diaS.equals("Segunda")){
           System.out.println("O dia corresponde ao numero: 2");
       }else{
           if(diaS.equals("Terça")){
             System.out.println("O dia corresponde ao numero: 3");  
           }else{
                if(diaS.equals("Quarta")){
                System.out.println("O dia corresponde ao numero: 4");
                }else{
                    if(diaS.equals("Quinta")){
                    System.out.println("O dia corresponde ao numero: 5");
                    }else{
                           if(diaS.equals("Sexta")){
                           System.out.println("O dia corresponde ao numero: 6");
                           }else{
                               if(diaS.equals("Sabado")){
                               System.out.println("O dia corresponde ao numero: 7");
                               }else{
                                   if(diaS.equals("Domingo")){
                                   System.out.println("O dia corresponde ao numero: 1");
                                   }else{
                                       System.out.println("O dia digitado não corresponde a um numero");
                                   }
                               }
                           }
                    }
                
                }
           
           }
       }
    }

}
