/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.entity.Quadrado;

/**
 *
 * @author root
 */
public class ExecucaoClasseQuadrado {
    
    /**
     * Formas de execução de uma classe em Java
     * @param args 
     */
    public static void main(String[] args) {
        // Cria a instância de classe da classe Quadrado
        Quadrado quadrado = new Quadrado();
        
        // Atribui o valor para atributo de classe "ladoA" da classe Quadrado utilizando o método de modificação do encapsulamento
        quadrado.setLadoA(2);
        
        // Atribui o valor para atributo de classe "ladoB" da classe Quadrado utilizando o método de modificação do encapsulamento
        quadrado.setLadoB(2);
        
        // Efetua a execução do método que efetua o cálculo da Area do quadrado e armazena o valor do cálculo em um atributo de classe 
        quadrado.calcularArea();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "area" da classe Quadrado
        quadrado.apresentarArea();
        
        // Efetua a execução do método que efetua o cálculo do Perimetro do quadrado e armazena o valor do cálculo em um atributo de classe 
        quadrado.calcularPerimetro();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "perimetro" da classe Quadrado
        quadrado.apresentarPerimetro();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "area" e "perimetro" da classe Quadrado
        quadrado.apresentarAreaPerimetro();
    }
    
}
