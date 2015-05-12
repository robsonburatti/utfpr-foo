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
public class Quadrado extends FormaGeometrica {

    /**
     * Método da interface IFormaGeometrica que deve ser implementado nas subclasses
     * @return 
     */
    @Override
    public double perimetro() {
        System.out.println("Executou método perimetro da subclasse Quadrado");
        return 63;
    }
    
}
