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
public class ExecucaoPolimorfismo {
    
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Gerente gerente = new Gerente();
        Secretario secretario = new Secretario();
        
        diretor.setSalario(1000);
        gerente.setSalario(1000);
        secretario.setSalario(1000);
        
        System.out.println("Salário Diretor: " + diretor.getBonificacao());
        System.out.println("Salário Gerente: " + gerente.getBonificacao());
        System.out.println("Salário Secretário: " + secretario.getBonificacao());
    }
    
}
