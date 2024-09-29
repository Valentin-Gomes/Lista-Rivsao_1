/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_10_valentin;

import java.util.ArrayList;
import java.util.Scanner;


public class ATIVIDADE_10_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N;

        do {
            System.out.print("Informe o número de valores a serem lidos (0 a 50): ");
            N = ler.nextInt();
        } while (N < 0 || N > 50);

        double[] A = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Informe o valor: ");
            A[i] = ler.nextDouble();
        }

        ArrayList<Double> NEG = new ArrayList<>();
        ArrayList<Double> POS = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                NEG.add(A[i]);
            } else {
                POS.add(A[i]);
            }
        }

        System.out.println("\nvalores negativos: " + NEG);
        System.out.println("Quantidade de valores negativos: " + NEG.size());

        System.out.println("\nvalores positivos e zero: " + POS);
        System.out.println("Quantidade de valores positivos e zero: " + POS.size());
    }
}
