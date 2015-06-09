/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.exemplointerface;

/**
 *
 * @author root
 */
public class ExecucaoInterface {
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        
        System.out.println("Executou método area:");
        quadrado.area();
        System.out.println("Executou método perimetro:");
        quadrado.perimetro();
        System.out.println("Executou método tipo:");
        quadrado.tipo();
        
    }
    
}
