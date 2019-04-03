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

public class Ex15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para saber qual dia"
                + "da semana sera ");
        int diaS = scn.nextInt();
        if (diaS > 7) {
            System.out.println("Erro");
        } else {
            if (diaS == 1) {
                System.out.println("O numero corresponde ao domingo");
            } else {
                if (diaS == 2) {
                    System.out.println("O numero corresponde a segunda");
                } else {
                    if (diaS == 3) {
                        System.out.println("O numero corresponde a terça");
                    } else {
                        if (diaS == 4) {
                            System.out.println("O numero corresponde a quarta");
                        } else {
                            if (diaS == 5) {
                                System.out.println("O numero corresponde a quinta");
                            } else {
                                if (diaS == 6) {
                                    System.out.println("O numero corresponde a sexta");
                                } else {
                                    if (diaS == 7) {
                                        System.out.println("O numero corresponde ao sabado");
                                    }
                                }

                            }
                        }
                    }
                }
            }

        }
    }

}
