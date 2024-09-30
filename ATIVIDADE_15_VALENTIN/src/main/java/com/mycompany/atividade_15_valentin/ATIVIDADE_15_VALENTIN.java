/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_15_valentin;

import java.util.Scanner;

/**
 *
 * @author ValentinGomes
 */
public class ATIVIDADE_15_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = ler.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = ler.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem " + idade + " anos no ano de " + anoAtual);
    }
}
