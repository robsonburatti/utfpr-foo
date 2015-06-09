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
public class Gerente extends Funcionario {

    /**
     * Implementação do método herdado da Classe Funcionario
     * @param login
     * @param senha 
     */
    @Override
    public void login(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método polimorfico
     * @return 
     */
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 500;
    }
    
}
