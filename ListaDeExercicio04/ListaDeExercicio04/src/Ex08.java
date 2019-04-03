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
public class Ex08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero1 = scn.nextDouble();
        System.out.println("Digite outro numero");
        double numero2 = scn.nextDouble();
        if(numero1 == numero2){
            System.out.println("Os numeros digitados são iguais");
        }else{
            System.out.println("Os numeros digitados não são iguais");
        }
        if(numero1 != numero2){
        System.out.println("Os numeros são diferentes");
        }else{
            System.out.println(" Os numeors digitados não são diferentes");
        }
       if(numero1 > numero2){
           System.out.println("O primeiro numero e maior que o numero 2");
       }else{
           System.out.println("O primeiro numero não é maior que o numero 2");
       }
       if(numero2 > numero1){
           System.out.println("O segundo numero e maior que o numero 1");
       }else{
             System.out.println("O segundo numero não e maior que o numero 1");
       }
       if(numero1 < 0){
           System.out.println("O primeiro numero e negativo");
       }else{
           System.out.println("O primeiro numero não e negativo");
       }
       if(numero2 < 0){
           System.out.println("O segundo numerr e negativo");
       }else{
           System.out.println("O segundo numero não e negativo");
       
       }if((numero1 % numero2) != 0){
        System.out.println("A divisão do primeiro pelo segundo tem resto");
       }else{
        System.out.println("A divisão do primeiro pelo segundo não tem resto");
       }
    }
    
}
