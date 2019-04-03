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
public class Ex07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero para ser dividido");
        double prmeiroNumero = scn.nextDouble();
        System.out.println("Didite um numero para ser o divisor");
        double divisor = scn.nextDouble();
        if(divisor != 0){
        double result = prmeiroNumero / divisor;
            System.out.println("Resultado: "+result);
        }else{
            System.out.println("Não pode ser dividido por 0");
        
        }
        
    }
    
}
