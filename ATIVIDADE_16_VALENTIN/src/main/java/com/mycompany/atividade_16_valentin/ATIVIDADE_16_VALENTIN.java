/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_16_valentin;

import java.util.Scanner;

/**
 *
 * @author ValentinGomes
 */
public class ATIVIDADE_16_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o número de funcionários da empresa: ");
        int numeroFuncionarios = ler.nextInt();

        if (numeroFuncionarios <= 0) {
            System.out.println("O número de funcionários deve ser maior que zero.");
            return;  // Encerra o programa se o número for inválido
        }

        double[] salarios = new double[numeroFuncionarios];

        double somaSalarios = 0;
        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = ler.nextDouble();
            somaSalarios += salarios[i]; 
        }

        double mediaSalarial = somaSalarios / numeroFuncionarios;

        int acimaDaMedia = 0;
        for (int i = 0; i < numeroFuncionarios; i++) {
            if (salarios[i] > mediaSalarial) {
                acimaDaMedia++;
            }
        }
        
        System.out.println("\nA média salarial é: R$ " + mediaSalarial);
        System.out.println("Número de funcionários que ganham acima da média: " + acimaDaMedia);
    }
}
