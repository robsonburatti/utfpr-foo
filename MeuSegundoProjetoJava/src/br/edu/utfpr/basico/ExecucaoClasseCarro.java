/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.entity.Carro;

/**
 *
 * @author root
 */
public class ExecucaoClasseCarro {
    
    /**
     * Formas de execução de uma classe e seus métodos
     * @param args 
     */
    public static void main(String[] args) {
        // Cria a instância de classe da classe Carro passando 3 parâmetro para o construtor
        Carro carroExemplo = new Carro("Ford", 2015, "Fusion");
        
        // Apresenta o valor atribuido para o atributo de classe "marca" da classe Carro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo marca: " +
                carroExemplo.getMarca());
        
        // Altera o valor do atributo de classe "marca" da classe Carro utilizando o método de modificação do encapsulamento
        carroExemplo.setMarca("Tesla");
        
        // Apresenta novamente o valor alterado do atribuido de classe "marca" da classe Carro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo alterado marca: " +
                carroExemplo.getMarca());
    }
    
}
