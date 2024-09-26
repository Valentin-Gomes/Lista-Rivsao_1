/*
 *  Escreva um programa que leia dois números inteiros e apresente na tela sua soma apenas se ambos forem
    positivos. Use o mesmo formato do exercício anterior e, caso algum dos números fornecidos seja negativo
    o programa deve escrever na tela que os "Dados de Entrada são Inválidos".
 */

package com.mycompany.atividade_2_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_2_VALENTIN {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int numUm;
        int numDois;
        int soma = 0;
        
        System.out.println("Digite dois numeros para somar: ");
        numUm = ler.nextInt();
        numDois = ler.nextInt();
        
        soma = numUm + numDois;
        if(numUm >= 0 && numDois >=0){
            System.out.println("A soma de " + numUm + " com " + numDois + " = " + soma);
        }
        else{
            System.out.println("Dados de entrada sao invalidos!");
        }
    }
}
