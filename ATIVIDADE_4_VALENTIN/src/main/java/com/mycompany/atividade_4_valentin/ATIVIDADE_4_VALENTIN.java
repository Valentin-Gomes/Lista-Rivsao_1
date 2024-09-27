/*
 *  Escreva um programa que leia três números reais e informe se eles constituem os lados de um triângulo.
    Em caso afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. Para que três números
    formem um triângulo deve ocorrer que a soma dos dois lados menores deve ser maior que o lado maior.
    Para resolver essa questão verifique como funcionam os operadores lógicos and e or.

 */

package com.mycompany.atividade_4_valentin;

import java.util.Scanner;


public class ATIVIDADE_4_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numUm;
        int numDois;
        int numTres;
        int soma;
        int somaUm;
        int somaDois;
        int somaTres;
        
        
        System.out.println("Digite 3 numeros para formar um triangulo: ");
        numUm = ler.nextInt();
        numDois = ler.nextInt();
        numTres = ler.nextInt();
        
        somaTres = numUm + numDois;
        somaUm = numDois + numTres;
        somaDois = numUm + numTres;
        
        
        if (somaUm > numUm){
                if(numUm == numDois && numDois == numTres){
                    System.out.println("Triangulo equilatero");
                }
                else if(numDois == numTres){
                    System.out.println("Triangulo isoceles");
                }
                else{
                    System.out.println("Triangulo escaleno");
                }       
        }
        else if (somaDois > numDois){
                if(numUm == numDois && numDois == numTres){
                    System.out.println("Triangulo equilatero");
                }
                else if(numUm == numTres){
                    System.out.println("Triangulo isoceles");
                }
                else{
                    System.out.println("Triangulo escaleno");
                }       
        }        
        else if (somaTres > numTres){
                if(numUm == numDois && numDois == numTres){
                    System.out.println("Triangulo equilatero");
                }
                else if(numUm == numDois){
                    System.out.println("Triangulo isoceles");
                }
                else{
                    System.out.println("Triangulo escaleno");
                }       
        }
        else{
            System.out.println("soma dos lados menores nao e maior que o lado maior");
        }
        
    }
}
