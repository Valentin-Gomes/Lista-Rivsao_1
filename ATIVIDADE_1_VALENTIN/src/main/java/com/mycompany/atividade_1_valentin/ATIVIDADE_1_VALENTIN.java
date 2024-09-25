/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_1_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_1_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numUm;
        int numDois;
        int soma = 0;
        
        System.out.println("Digite dois numeros para somar: ");
        numUm = ler.nextInt();
        numDois = ler.nextInt();
        
        soma = numUm + numDois;
        
        System.out.println("A soma de " + numUm + " com " + numDois + " = " + soma);
        
    }
}
