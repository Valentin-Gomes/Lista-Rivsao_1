/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5_valentin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ATIVIDADE_5_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do lutador: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o peso do lutador: ");
        double peso = scanner.nextDouble();

        String categoria = classificarCategoria(peso);

        String resultado = String.format("O lutador %s pesa %.1f kg e se enquadra na categoria %s", nome, peso, categoria);

        String nomeArquivo = "CATEGORA " + nome;
        FileWriter arquivo = new FileWriter("C:\\Users\\valen\\OneDrive\\Documentos\\NetBeansProjects\\Lista Revisão 1\\Lista-Rivsao_1\\ATIVIDADE_5_VALENTIN" + nomeArquivo + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println("Nome fornecido: " + nome);
        gravar.println("Peso fornecido: " + peso);
        gravar.println(resultado);


        System.out.println("Informações salvas em '" + nomeArquivo + "'.");
    }

    public static String classificarCategoria(double peso) {
        if (peso <= 60) {
            return "Leve";
        } else if (peso <= 75) {
            return "Ligeiro";
        } else if (peso <= 90) {
            return "Meio-Pesado";
        } else {
            return "Pesado";
        }
    }
}
