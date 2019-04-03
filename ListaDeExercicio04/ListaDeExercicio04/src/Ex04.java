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
public class Ex04 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu principal");
        System.out.println();
        System.out.println(" 1 - Fim");
        System.out.println(" 2 - Cadastro");
        System.out.println(" 3 - Consulta");
        System.out.print("Digite o numero da opção desejada:");
        double opcao = scn.nextDouble();
        if(opcao == 1){
            System.out.println("Você escolehu Fim");
        }
        if(opcao == 2){
            System.out.println("Você escolheu cadastro");
        }
        if(opcao == 3){
            System.out.println("Você escolheu consulta");
        }
        if(opcao > 3)
        {
            System.out.println("Essa opcão não existe");
        }
    }
    
}
