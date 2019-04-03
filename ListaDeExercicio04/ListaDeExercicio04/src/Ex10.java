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
public class Ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o valor do produto comprado!!");
        double valorProd = scn.nextDouble();
        System.out.println("Digite o valor da compra");
        double valorCompra = scn.nextDouble();
        if(valorCompra < 20){
        double result = (0.45 * valorProd)+ valorCompra;
            System.out.println("Valor da compra: "+result);
        }else{
        double result = (0.30 * valorProd)+valorCompra;
        System.out.println("Valor da compra: "+result);
        }
        
        
    }
}
