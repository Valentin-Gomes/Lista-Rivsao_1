/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_6_valentin;

import java.util.Scanner;


public class ATIVIDADE_6_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            x = ler.nextInt();

            if (x > 0) {
                System.out.println(x + " é positivo.");
            } else if (x < 0) {
                System.out.println(x + " é negativo.");
            }

        } while (x != 0);


        System.out.println("Programa encerrado.");
    }
}
