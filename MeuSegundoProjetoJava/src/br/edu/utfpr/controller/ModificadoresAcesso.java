/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import javafx.scene.paint.Color;

/**
 *
 * @author root
 */
public class ModificadoresAcesso {
    
    /*
    *Public*
    O modificador public deixará visível a classe ou membro para todas as outras classes, subclasses e pacotes do projeto Java.

    *Private*
    O modificador private deixará visível o atributo apenas para a classe em que este atributo se encontra.

    *Protected*
    O modificador protected deixará visível o atributo para todas as outras classes e subclasses que pertencem ao mesmo pacote. A principal diferença é que apenas as classes do mesmo pacote tem acesso ao membro. O pacote da subclasse não tem acesso ao membro.

    *Sem Modificador (Padrão)*
    Por padrão, a linguagem Java permite acesso aos membros apenas ao pacote em que ele se encontra.

    De forma ilustrativa, abaixo está uma tabela demonstrando todas estas características.
    
    Tabela dos modificadores de acesso
                                            private	default     protected	public
    mesma classe                                sim	sim             sim	sim
    mesmo pacote                                não	sim             sim	sim
    pacotes diferentes (subclasses)             não	não             sim	sim
    pacotes diferentes (sem subclasses)         não	não             não	sim
    */
    
    public long longo;        // Atributo longo public
    private int inteiro;      // Atributo inteiro private
    protected float decimal;  // Atributo float protected
    boolean ativado;          // Atributo booleano package-private (default) ou padrão
    
    private static int contador; // Imprime o contador com 5 valores (saída: 1, 2, 3, 4, 5)
//    private int contador;        // Imprime o contador com 1 valor (saída: 1, 1, 1, 1, 1)

    public ModificadoresAcesso() {
        contador++;
        System.out.println("contador=" + contador);
    }
    
    public static void main(String[] args) {
        ModificadoresAcesso modificadoresAcesso1 = new ModificadoresAcesso();
        ModificadoresAcesso modificadoresAcesso2 = new ModificadoresAcesso();
        ModificadoresAcesso modificadoresAcesso3 = new ModificadoresAcesso();
        ModificadoresAcesso modificadoresAcesso4 = new ModificadoresAcesso();
        ModificadoresAcesso modificadoresAcesso5 = new ModificadoresAcesso();
        
        metodoPrivadoStatico();
    }
    
    public static void metodoPublicoStatico() {
        System.out.println("Chamou o método público estático!");
    }
    
    private static void metodoPrivadoStatico() {
        System.out.println("Chamou o método privado estático!");
    }
    
    protected static void metodoProtegidoStatico() {
        System.out.println("Chamou o método protegido estático!");
    }
    
    static void metodoDefaultStatico() {
        System.out.println("Chama o método padrão estático!");
    }
    
    public void metodoPublicNoStatic() {
        System.out.println("Chamou o método público não estático!");
        this.metodoPrivateNoStatic();
    }
    
    private void metodoPrivateNoStatic() {
        System.out.println("Chamou o método private não estático!");
    }
}
