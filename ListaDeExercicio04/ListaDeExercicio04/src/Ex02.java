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
public class Ex02 {
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero");
        double primeiroNumero = scn.nextDouble();
        
        if((primeiroNumero % 2) > 0){
            System.out.println("O numero e impar");
        }else{
            System.out.println("O numero e par");
        }
        
        
    }
    
}
