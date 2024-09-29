/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_8_valentin;

import java.util.Scanner;


public class ATIVIDADE_8_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o valor de Min: ");
        int min = ler.nextInt();
        System.out.print("Informe o valor de Max: ");
        int max = ler.nextInt();

        if (min > max) {
            System.out.println("O valor de Min é maior que Max. Valores serão invertidos.");
            int temp = min;
            min = max;
            max = temp;
        }

        int soma = 0;
        int quantidade = 0;

        int x;

        do {
            System.out.print("Digite um valor entre o intervalo: (0 para sair): ");
            x = ler.nextInt();

            if (x == 0) {
                break;
            }

            if (x >= min && x <= max) {
                soma += x;
                quantidade++;
            } else {
                System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
            }

        } while (x != 0);

        System.out.println("Quantidade de valores no intervalo [" + min + ", " + max + "]: " + quantidade);
        System.out.println("Soma dos valores no intervalo: " + soma);
    }
}
