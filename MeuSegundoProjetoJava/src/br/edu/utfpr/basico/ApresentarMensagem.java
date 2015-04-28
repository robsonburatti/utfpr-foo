/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

/**
 *
 * @author root
 */
public class ApresentarMensagem {
    
    /**
     * Formas de apresentar mensagens no Java
     * @param args 
     */
    public static void main(String[] args) {
        // Apresenta a mensagem "Bem vindo a UTFPR!" normal
        System.out.println("Bem vindo na UTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com enter em cada espaço
        System.out.println("Bem\nvindo\na\nUTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com tabulação em cada espaço
        System.out.println("Bem\tvindo\ta\tUTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" entre aspas
        System.out.println("\"Bem vindo a UTFPR!\"");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" entre aspas simples
        System.out.println("\'Bem vindo a UTFPR!\'");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com um formatador e com um enter após a letra "a" da mensagem de acordo com a máscara
        System.out.printf("%s\n%s\n", "Bem vindo a", "UTFPR!");
    }
    
}
