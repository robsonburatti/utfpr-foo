/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.entity.Livro;

/**
 *
 * @author root
 */
public class ExecucaoClasseLivro {
    
    /**
     * Formas de acessar os métodos de uma classe
     * @param args 
     */
    public static void main(String[] args) {
        // Cria a instância de classe da classe Livro utilizando um construtor que recebe 1 parâmetro do tipo String
        Livro livroJava = new Livro("C como programar");
        
        // Efetua a chamada para o método que apresenta o valor armazenado no atributo de classe "nome" da classe Livro
        livroJava.apresentaMensagem();
        
        // Altera o valor do atributo de classe "nome" da classe Livro utilizando o método de modificação do encapsulamento
        livroJava.setNome("Java como programar");
        
        // Apresenta novamente o valor alterado do atribuido de classe "nome" da classe Livro utilizando o método de acesso do encapsulamento
        livroJava.apresentaMensagem();
        
        // Outra forma de apresentar o valor do atribuido de classe "nome" da classe Livro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo é: " + livroJava.getNome());
        
        // Instância outro objeto de classe Livro utlizando o contrutor padrão
        Livro livroPython = new Livro();
        
        // Atribui o valor para atributo de classe "nome" da classe Livro utilizando o método de modificação do encapsulamento
        livroPython.setNome("Python como programar");
        
        // Efetua a chamada para o método que apresenta o valor armazenado no atributo de classe "nome" da classe Livro
        livroPython.apresentaMensagem();
        
    }
    
}
