/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entity;

/**
 *
 * @author root
 */
public class Quadrado {
    
    private double ladoA; // Atributo para armazenar o lado A
    private double ladoB; // Atributo para armazenar o lado B
    private double area; // Atributo para armazenar a area
    private double perimetro; // Atributo para armazenar o perimetro
    
    /**
     * Construtor padrão sem parâmetros
     */
    public Quadrado() {
        //
    }

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    /**
     * Método para calcular a area
     */
    public void calcularArea() {
        double areaLocal = 0;
        
        areaLocal = getLadoA() * getLadoB();
        
        setArea(areaLocal);
    }

    /**
     * Método para calcular o perimetro
     */
    public void calcularPerimetro() {
        double perimetroLocal = 0;
        
        perimetroLocal = (2 * getLadoA()) + (2 * getLadoB());
        
        setPerimetro(perimetroLocal);
    }
    
    /**
     * Método para apresentar a area
     */
    public void apresentarArea() {
        System.out.println("O valor da area é: " + getArea());
    }
    
    /**
     * Método para apresentar o perimetro
     */
    public void apresentarPerimetro() {
        System.out.println("O valor do perimetro é: " + getPerimetro());
    }
    
    /**
     * Método para apresentar a area e o perimetro
     */
    public void apresentarAreaPerimetro() {
        System.out.println("A area é " + getArea() + " e o perimetro é " + getPerimetro());
    }
    
    
}



