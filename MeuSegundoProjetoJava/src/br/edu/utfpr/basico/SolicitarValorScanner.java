/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class SolicitarValorScanner {
    
    /**
     * Formas de solicitar entrada de dados do usuário utilizando a classe Scanner
     * @param args 
     */
    public static void main(String[] args) {
        int primeiroNumero = 0; // Armazena o valor do primeiro número digitado
        int segundoNumero = 0; // Armazena o valor do segundo número digitado
        int soma = 0; // Armazena o valor da soma dos números digitados
        
        // Cria a classe para receber os valores informados pelo usuário
        Scanner entrada = new Scanner( System.in );
        
        // Apresenta a mensagem solicitando ao usuário que informe o primeiro número
        System.out.println("Informe o Primeiro número: ");
        // Recebe o valor informado
        primeiroNumero = entrada.nextInt();
        
        // Apresenta a mensagem solicitando ao usuário que informe o segundo número
        System.out.println("Informe o Segundo número: ");
        // Recebe o valor informado
        segundoNumero = entrada.nextInt();
        
        // Efetua o cálculo da soma dos valores
        soma = primeiroNumero + segundoNumero;
        
        // Apresenta o valor da Soma
        System.out.printf("O valor da soma é: %d\n", soma);
    }
    
}
