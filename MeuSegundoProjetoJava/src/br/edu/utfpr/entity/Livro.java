/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entity;

/**
 *
 * @author root
 */
public class Livro {
    
    private String nome;
    
    /**
     * Construtor padrão
     */
    public Livro() {
        // 
    }
    
    /**
     * Construtor que aguarda um paramêtro do atributo nome
     * @param nomeParametro  aguarda uma variável do tipo String para atribuir ao atributo de classe nome
     */
    public Livro(String nomeParametro) {
        nome = nomeParametro;
    }
    
    /**
     * Método que retorna o valor do atributo de classe nome
     * @return retorna o valor do atributo de classe nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Método que atribui o valor para o atributo de classe nome
     * @param nomeParametro aguarda uma variável do tipo String para atribuir ao atributo de classe nome
     */
    public void setNome(String nomeParametro) {
        this.nome = nomeParametro;
    }
    
    /**
     * Apresenta a mensagem para o usuário do valor armazenado para o atributo nome
     */
    public void apresentaMensagem() {
        System.out.println("O valor do atributo nome é: " + getNome());
    }
}










