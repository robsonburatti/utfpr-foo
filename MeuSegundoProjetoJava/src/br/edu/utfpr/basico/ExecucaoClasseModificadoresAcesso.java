/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.controller.ModificadoresAcesso;

/**
 *
 * @author root
 */
public class ExecucaoClasseModificadoresAcesso {
    
    /**
     * Formas de executar métodos com modificadores de acesso diferentes no Java
     * @param args 
     */
    public static void main(String[] args) {
        // Cria a intância da classe para acessar os métodos
        ModificadoresAcesso modificadoresAcesso = new ModificadoresAcesso();
        modificadoresAcesso.metodoPublicoStatico();
        modificadoresAcesso.metodoPublicNoStatic();
        
        // Acessa direto os métodos estáticos da classe
        ModificadoresAcesso.metodoPublicoStatico();
    }
    
}
