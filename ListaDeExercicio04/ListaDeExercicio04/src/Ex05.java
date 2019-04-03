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
public class Ex05 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual sera o resultado desse calculo: 2+3x10");
        System.out.println("A - 50");
        System.out.println("B - 30");
        System.out.println("C - 32");
        System.out.println("D - 52");
        System.out.println("E - nenhuma das alternativas ");
        System.out.println("");
        System.out.println("Digite a letra da resposta");
        String respost = scn.nextLine();
        if(respost.equals("C")){
            System.out.println("Resposta certa");
        }else{
            System.out.println("Resposta errada");
        }
        
     
    
}
}
