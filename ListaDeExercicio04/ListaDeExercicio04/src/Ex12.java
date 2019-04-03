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
public class Ex12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        double anoNascimento = scn.nextDouble();
        System.out.println("Digite o ano que esta");
        double anoAtual = scn.nextDouble();
        double result = anoAtual - anoNascimento;
        if(result > 0){
            System.out.println("Sua idade é: "+result);
        }else{
            System.out.println("Ano de nascimento não valido");
        }
        
    }
    
}
