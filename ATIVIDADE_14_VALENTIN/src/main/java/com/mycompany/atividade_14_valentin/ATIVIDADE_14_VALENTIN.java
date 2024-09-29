/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_14_valentin;

import java.util.Scanner;


public class ATIVIDADE_14_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double somaSalariosAtuais = 0;
        double somaSalariosReajustados = 0;

        while (true) {
            System.out.print("Digite o nome do funcionário (ou 'FIM' para encerrar): ");
            String nome = ler.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Digite o salário atual de " + nome + ": ");
            double salarioAtual = ler.nextDouble();
            ler.nextLine();

            double salarioReajustado = calcularReajuste(salarioAtual);

            System.out.println("Nome: " + nome);
            System.out.println("Salário atual: R$ " + salarioAtual);
            System.out.println("Salário reajustado: R$ " + salarioReajustado);
            System.out.println();

            somaSalariosAtuais += salarioAtual;
            somaSalariosReajustados += salarioReajustado;
        }

        System.out.println("Soma dos salários atuais: R$ " + somaSalariosAtuais);
        System.out.println("Soma dos salários reajustados: R$ " + somaSalariosReajustados);
        System.out.println("Diferença total: R$ " + (somaSalariosReajustados - somaSalariosAtuais));

    }

    public static double calcularReajuste(double salarioAtual) {
        if (salarioAtual <= 150) {
            return salarioAtual * 1.25; 
        } else if (salarioAtual <= 300) {
            return salarioAtual * 1.20; 
        } else if (salarioAtual <= 600) {
            return salarioAtual * 1.15; 
        } else {
            return salarioAtual * 1.10;
        }
    }
}
