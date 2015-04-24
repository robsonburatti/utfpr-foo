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
public class UtilizarOperadoresIgualdadeERelacionamento {
    
    /**
     * Formas de utilizar operadores de igualdade e relacionamento no Java ( == != > < >= <= )
     * @param args 
     */
    public static void main(String[] args) {
        int primeiroNumero = 0; // Armazena o valor do primeiro número digitado
        int segundoNumero = 0; // Armazena o valor do segundo número digitado
        
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
        
        // Efetua o teste se o primeiro número é igual ao segundo número
        if (primeiroNumero == segundoNumero) {
            System.out.printf("%d == %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é diferente do segundo número
        if (primeiroNumero != segundoNumero) {
            System.out.printf("%d != %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é menor que o segundo número
        if (primeiroNumero < segundoNumero) {
            System.out.printf("%d < %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é maior que o segundo número
        if (primeiroNumero > segundoNumero) {
            System.out.printf("%d > %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é menor ou igual ao segundo número
        if (primeiroNumero <= segundoNumero) {
            System.out.printf("%d <= %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é maior ou igual ao segundo número
        if (primeiroNumero >= segundoNumero) {
            System.out.printf("%d >= %d\n", primeiroNumero, segundoNumero);
        }
    }
    
}
