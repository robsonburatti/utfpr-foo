/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.heranca;

import java.util.Date;

/**
 *
 * @author root
 */
public class Cliente extends Pessoa {
    
    private String cpf;
    private int idade;
    private Date dataNascimento;

    /**
     * Construtor que aguarda um parâmetro do tipo texto para atribuir o valor ao atributo <b>nome</b> herdado da superclasse Pessoa
     * @param nome valor do tipo texto para armazenar o valor do atributo <b>nome</b> da superclasse Pessoa
     */
    public Cliente(String nome) {
        // Chama o construtor da superclasse Pessoa que aguarda um parâmetro do tipo texto para atribuir para o atributo nome
        super(nome);
    }

    /**
     * Construtor que aguarda um parâmetro do tipo texto para atribuir o valor ao atributo <b>nome</b> herdado da superclasse Pessoa e outro um valor numérico para atribuir ao atributo <b>idade</b> da subclasse Cliente
     * @param nome valor do tipo texto para armazenar o valor do atributo <b>nome</b> da superclasse Pessoa
     * @param idade valor do tipo numérico para armazenar o valor do atributo <b>idade</b> da subclasse Cliente
     */
    public Cliente(String nome, int idade) {
        // Chama o construtor da superclasse Pessoa que aguarda um parâmetro do tipo texto para atribuir para o atributo nome
        super(nome);
        
        // Atribui o valor do parâmetro idade para o atributo idade da subclasse Cliente
        this.idade = idade;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", idade=" + idade + ", dataNascimento=" + dataNascimento + '}';
    }
    
}
