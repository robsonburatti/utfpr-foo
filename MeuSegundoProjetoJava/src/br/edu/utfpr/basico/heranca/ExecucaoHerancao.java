/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.heranca;

/**
 *
 * @author root
 */
public class ExecucaoHerancao {
    
    public static void main(String[] args) {
        // Instância da superclasse (classe pai) Pessoa
        Pessoa pessoa = new Pessoa("robson");
        
        // Apresenta o valor atribuido ao atributo nome da superclasse Pessoa
        System.out.println("Pessoa nome=" + pessoa.getNome());
        
        // ===== TESTES EFETUADOS ANTES DE CRIAR O CONSTRUTOR NO OBJETO CLIENTE =====
        // Instância o construtor da subclasse Cliente
//        Cliente cliente = new Cliente();
        
        // Atribui o valor ao atributo nome da subclasse Cliente que herdou da superclasse Pessoa
//        cliente.setNome("Buratti");
        
        // Apresenta o valor atribuido ao atributo nome da subclasse Cliente que herdou da superclasse Pessoa
//        System.out.println("Cliente nome=" + cliente.getNome());
        // ==========================================================================
        
        // Instância a subclase Cliente passando o parâmetro para o construtor que vai atribuir o valor ao atributo nome da superclasse Pessoa
        Cliente cliente = new Cliente("Robson");
        
        // Apresenta o valor atribuido ao atributo nome da subclasse Cliente que herdou da superclasse Pessoa
        System.out.println("Cliente nome=" + cliente.getNome());
        
        // Instância a subclasse Cliente passando dois parâmetros para o construtor um que vai atribuir o valor para o atributo nome da superclasse Pessoa e outro que vai atribui o valor para o atributo idade da subclasse Cliente
        Cliente clienteIdade = new Cliente("Buratti", 20);
        
        // Apresenta o valor atribuido aos atributos nome e ao atributo idade sendo o atributo nome herdado da superclasse Pessoa e o atributo idade da subclasse Cliente
        System.out.println("ClienteIdade nome=" + clienteIdade.getNome() + 
                " idade=" + clienteIdade.getIdade());
        
    }
    
}
