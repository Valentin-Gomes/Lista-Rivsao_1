/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11_valentin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ValentinGomes
 */
public class ATIVIDADE_11_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int N;

        do {
            System.out.print("Informe o número de elementos (0 a 50): ");
            N = ler.nextInt();
        } while (N < 0 || N > 50);

        int[] V = new int[N];

        System.out.println("Vetor gerado:");
        for (int i = 0; i < N; i++) {
            V[i] = random.nextInt(101);
            System.out.print(V[i] + " ");
        }
        System.out.println();

        int X;
        do {
            System.out.print("Digite um número para pesquisar no vetor (número negativo para sair): ");
            X = ler.nextInt();

            if (X >= 0) {
                boolean encontrado = false;
                
                for (int i = 0; i < N; i++) {
                    if (V[i] == X) {
                        System.out.println("O número " + X + " foi encontrado na posição " + i);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("O número " + X + " não foi encontrado no vetor.");
                }
            }

        } while (X >= 0);
    }
}
