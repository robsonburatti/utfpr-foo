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
public class CastingVariavel {
    
    /**
     * Formas de efetuar casting de valores de tipos diferentes de variáveis
     * @param args 
     */
    public static void main(String[] args) {
        String textoNumerico = "123"; // Armazena em uma variável do tipo texto um valor numérico
        int numeroConvertido = 0; // Aramzena o valor numérico convertido
        String texto = ""; // Armazena um texto
        double numeroPontoFlutuante = 0; // Armazena um número do tipo ponto flutuante
        int numeroInteroComoPontoFlutuante = 0; // Armazena um número inteiro convertido de um ponto flutuante
        
        // Transforma o texto numérico para o tipo de variável númerico
        numeroConvertido = Integer.parseInt(textoNumerico);
        
        // Apresenta o valor da variável numeroConvertido
        System.out.println("Valor do número convertido: " + numeroConvertido);
        
        // Transforma o valor numério para o tipo de váriável texto
        texto = String.valueOf(numeroConvertido);
        
        // Apresenta o valor da variável texto
        System.out.println("Valor do texto convertido: " + texto);
        
        // Atribui para a variável numeroPontoFlutuante o valor de 3.14
        numeroPontoFlutuante = 3.14;
        
        // Transforma o valor da variável numeroPontoFlutuante em um número inteiro ficando somente com o valor de 3
        numeroInteroComoPontoFlutuante = (int) numeroPontoFlutuante;
        
        // Apresenta o valor da variável do número inteiro como ponto flutuante
        System.out.println("Valor do número inteiro convertido de um ponto flutuante convertido: " + numeroInteroComoPontoFlutuante);
        
    }
    
}
