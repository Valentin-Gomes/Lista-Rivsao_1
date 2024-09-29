/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_12_valentin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATIVIDADE_12_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int N;

        do {
            System.out.print("Informe o número de elementos (0 a 50): ");
            N = ler.nextInt();
        } while (N < 0 || N > 50);

        ArrayList<Integer> V = new ArrayList<>();

        System.out.println("Vetor gerado:");
        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(101);
            V.add(randomNumber);
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        int X;
        do {
            System.out.print("Digite um número para pesquisar e remover do vetor (número negativo para sair): ");
            X = ler.nextInt();

            if (X >= 0) {
                boolean removido = false;
                
                while (V.contains(X)) {
                    V.remove(Integer.valueOf(X));
                    removido = true;
                }

                if (removido) {
                    System.out.println("O número " + X + " foi removido. Vetor atualizado:");
                    for (int val : V) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("O número " + X + " não foi encontrado no vetor.");
                }
            }

        } while (X >= 0);
    }
}
