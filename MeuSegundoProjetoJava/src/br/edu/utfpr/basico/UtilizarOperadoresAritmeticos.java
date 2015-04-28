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
public class UtilizarOperadoresAritmeticos {
    
    /**
     * Formas de utilizar os operadores aritmeticos no Java ( + - * / )
     * @param args 
     */
    public static void main(String[] args) {
        int primeiroNumero = 10; // Armazena o valor 10 para o primeiro número
        int segundoNumero = 2; // Armazena o valor 10 para o segundo número
        int resultado = 0; // Armazena do resultado da operação
        
        // Forma de adição
        resultado = primeiroNumero + segundoNumero;
        
        //Apresenta o resultado da adição
        System.out.printf("Resultado da adição = %d\n", resultado);
        
        
        // Forma de subtração
        resultado = primeiroNumero - segundoNumero;
        
        //Apresenta o resultado da subtração
        System.out.printf("Resultado da subtração = %d\n", resultado);
        
        
        // Forma de multiplicação
        resultado = primeiroNumero * segundoNumero;
        
        //Apresenta o resultado da multiplicação
        System.out.printf("Resultado da multiplicação = %d\n", resultado);
        
        
        // Forma de divisão
        resultado = primeiroNumero / segundoNumero;
        
        //Apresenta o resultado da divisão
        System.out.printf("Resultado da divisão = %d\n", resultado);
        
        
        // Forma de resto
        resultado = primeiroNumero % segundoNumero;
        
        //Apresenta o resultado do resto da divisão
        System.out.printf("Resultado do resto da divisão = %d\n", resultado);
        
    }
    
}
