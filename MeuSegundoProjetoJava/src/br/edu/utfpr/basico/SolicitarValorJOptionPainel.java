/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class SolicitarValorJOptionPainel {
    
    /**
     * Formas de solicitar entrada de dados do usuário utilizando a classe JOptionPainel
     * @param args 
     */
    public static void main(String[] args) {
        String nome = ""; // Armazena o nome informado pelo usuário
        String mensagem = ""; // Armazena a montagem da mensagem que será apresentada para o usuário
        
        // Solicita ao usuário que informa um valor do tipo texto
        // Todo valor retornado do método "showInputDialog" é do tipo texto caso queria solicitar número deve ser convertido para o tipo númerico desejado
        nome = JOptionPane.showInputDialog("Informe seu nome");
        
        // Montangem da mensagem de apresentação ao usuário
        mensagem = "Seu nome é " + nome;
        
        // Apresentação da mensagem ao usuário
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
