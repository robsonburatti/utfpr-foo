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
public abstract class Funcionario extends Pessoa {
    
    private long numeroConta;
    private double salario;

    /**
     * @return the numeroConta
     */
    public long getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * Declaração do método abstrato
     * @param login
     * @param senha 
     */
    public abstract void login(String login, String senha);
    
    /**
     * Declaração de método que calcula a bonificação que em alguns Objetos filhos será usado como polimorfismo
     * @return 
     */
    public double getBonificacao() {
        return (this.getSalario() * 0.10);
    }
}
