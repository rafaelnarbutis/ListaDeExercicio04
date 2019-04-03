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
public class Ex09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean check = false;
        System.out.println("Digite um numero");
        double primeiroNumero = scn.nextDouble();
        System.out.println("Digite outro numero");
        double segundoNumero = scn.nextDouble();
        scn.nextLine();
        System.out.println("Escolha a opção desejada");
        System.out.println("Adicao");
        System.out.println("Subtracao");
        System.out.println("Multiplicacao");
        System.out.println("Divisao");
        String opcao = scn.nextLine();
        if(opcao.equals("Adicao")){
        double result = primeiroNumero + segundoNumero;
            System.out.println("Resultado da adição: "+ result);
            check = true;
        }
        if(opcao.equals("Subtracao")){
        double result = primeiroNumero - segundoNumero;
            System.out.println("Resultado da subtração: "+result);
             check = true;
        }
        if(opcao.equals("Multiplicacao")){
        double result = primeiroNumero * segundoNumero;
            System.out.println("Resultado da multiplicação: "+result);
             check = true;
        }
        if(opcao.equals("Divisao")){
        double result = primeiroNumero / segundoNumero;
            System.out.println("Resultado da divisão: "+result);
             check = true;
        }
        if(check != true){
            System.out.println("Não temos essa opção");
        }
    }
    
}
