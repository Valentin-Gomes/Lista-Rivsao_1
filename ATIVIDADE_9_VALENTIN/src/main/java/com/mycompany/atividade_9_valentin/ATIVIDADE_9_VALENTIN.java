/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_9_valentin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ValentinGomes
 */
public class ATIVIDADE_9_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> valoresValidos = new ArrayList<>();
        
        System.out.print("Digite o valor de Min: ");
        int min = ler.nextInt();
        System.out.print("Digite o valor de Max: ");
        int max = ler.nextInt();

        if (min > max) {
            System.out.println("Min é maior que Max, valores serão invertidos.");
            int temp = min;
            min = max;
            max = temp;
        }

        int total = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite um valor (0 para sair): ");
            int x = ler.nextInt();

            if (x == 0) {
                break;
            }

            if (x >= min && x <= max) {
                valoresValidos.add(x);
                total += x;
                quantidade++;
            } else {
                System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
            }
        }

        System.out.println("Valores: " + valoresValidos);
        System.out.println("Total: " + total);
        System.out.println("Quantidade de valores: " + quantidade);
    }
}
