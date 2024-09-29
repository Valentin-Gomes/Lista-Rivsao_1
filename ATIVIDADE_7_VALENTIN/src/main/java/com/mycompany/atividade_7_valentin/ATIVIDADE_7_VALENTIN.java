/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_7_valentin;

import java.util.Scanner;


public class ATIVIDADE_7_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite um número inteiro positivo (zero ou negativo para sair): ");
            numero = ler.nextInt();

            if (numero > 0) {
                soma += numero;
                quantidade++;

                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (numero > 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;

            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
            System.out.println("Quantidade de valores informados: " + quantidade);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
    }
}
