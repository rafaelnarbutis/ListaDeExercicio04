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
public class Ex13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double primeiraNota = scn.nextDouble();
        System.out.println("Digete a segunda nota");
        double segundaNota = scn.nextDouble();
        System.out.println("Digite a terceia nota");
        double terceiraNota = scn.nextDouble();
        
        double result = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        if(result < 4){
            System.out.println("Media:"+result+ " classificação: E");
        }else{
            if(result < 5){
                   System.out.println("Media:"+result+ " classificação: D");
            }else{
                if(result < 7){
                    System.out.println("Media:"+result+ " classificação: C");
                }else{
                    if(result < 8){
                            System.out.println("Media:"+result+ " classificação: B");
                    }else{
                        if(result < 11){
                                System.out.println("Media:"+result+ " classificação: A");
                        }
                    }
                
                }
            }
        
        }
        
    }
}
