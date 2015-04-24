/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

/**
 *
 * @author root
 */
public class OperadoresIncrementeDecremento {
    
    /**
     * Formas de operadores de incremento e decremento no Java
     * @param args 
     */
    public static void main(String[] args) {
        int i = 10; // Inicializa uma variável com valor 10
        int j = 3; // Inicializa uma variável com valor 3
        int k = 0; // Inicializa uma variável com valor 0
        
        k = ++j + i; // Resultará em k = 4+10 = 14
        
        // Apresenta o valor armazenado na variável j
        System.out.println("O valor de j é: " + j);
        
        // Apresenta o valor armazenado na variável k
        System.out.println("O valor de k é: " + k);
        
        k = j++ + i; // Resultará em k = 3+10 = 13
        
        // Apresenta o valor armazenado na variável j
        System.out.println("O valor de j é: " + j);
        
        // Apresenta o valor armazenado na variável k
        System.out.println("O valor de k é: " + k);
        
        k++; // Atribui para a variável k o valor dela + 1
        
        // Apresenta o valor armazenado na variável k
        System.out.println("O valor de k é: " + k);
    }
    
}
