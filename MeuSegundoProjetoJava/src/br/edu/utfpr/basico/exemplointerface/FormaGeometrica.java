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
public abstract class FormaGeometrica implements IFormaGeometrica, IFormas {

    /**
     * Método da interface IFormaGeometrica
     * @return 
     */
    @Override
    public double area() {
        System.out.println("Executou método area da superclasse FormaGeometrica");
        return 13;
    }

    /**
     * Método da interface IFormaGeometrica
     * Comentado para ser implementado nas subclases (Quadrado, Circulo, Triangulo) tornando a superclasse (FormaGeometrica) uma classe abstrata
     * @return 
     */
//    @Override
//    public double perimetro() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * Método da interface IFormas
     * @return 
     */
    @Override
    public String tipo() {
        System.out.println("Executou método tipo da superclasse FormaGeometrica");
        return "tipo";
    }

    /**
     * Método da interface IFormas
     * @return 
     */
    @Override
    public int quantidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
