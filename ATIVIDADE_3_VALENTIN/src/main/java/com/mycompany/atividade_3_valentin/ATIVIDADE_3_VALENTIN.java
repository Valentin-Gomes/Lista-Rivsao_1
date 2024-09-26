/*
 *  Escreva um programa que leia dois números inteiros e apresente na tela sua soma apenas se ambos tiverem
    o mesmo sinal (positivo ou negativo). Use o mesmo formato do exercício anterior e, caso os números
    fornecidos tenham sinais trocados o programa deve escrever na tela que os "Dados de Entrada são
    Inválidos". Utilize: JOptionPane.showMessageDialog e JOptionPane.showInputDialog.

 */

package com.mycompany.atividade_3_valentin;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_3_VALENTIN {

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
        else if(numUm < 0 && numDois < 0){
            System.out.println("A soma de " + numUm + " com " + numDois + " = " + soma);
        }
        else{
            JOptionPane.showMessageDialog(null,"Dados de entrada sao invalidos!" );
           // System.out.println("Dados de entrada sao invalidos!");
        }
    }
}
