/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

/**
 *
 * @author root
 */
public class ExecutaModificadoresAcesso {
    
    public static void main(String[] args) {
        // Cria a intância de classe para acessar os métodos do mesmo pacote
        ModificadoresAcesso modificadoresAcesso = new ModificadoresAcesso();
        modificadoresAcesso.metodoDefaultStatico();
        modificadoresAcesso.metodoProtegidoStatico();
        modificadoresAcesso.metodoPublicoStatico();
        modificadoresAcesso.metodoPublicNoStatic();
        
        // Acesso direto aos métodos estáticos da classe sem necessitar instânciar a classe
        ModificadoresAcesso.metodoDefaultStatico();
        ModificadoresAcesso.metodoProtegidoStatico();
        ModificadoresAcesso.metodoPublicoStatico();
    }
    
}
