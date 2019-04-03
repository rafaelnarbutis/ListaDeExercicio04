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
public class Ex14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        double pLado = scn.nextDouble();
        System.out.println("Digite o segundo lado do triangulo");
        double sLado = scn.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo");
        double tLado = scn.nextDouble();
        if(pLado == sLado && sLado == tLado){
            System.out.println("É um triangulo equilatero com todos os lados iguais");
        }else{
            if(pLado != sLado && sLado != tLado && pLado != tLado){
            System.out.println("É um triangulo escaleno com todos os lados diferentes");            
            }else{
                System.out.println("É um triangulo isoceles com dois lados iguais");
            }
        
        }
    }
}
