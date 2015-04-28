/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.util.MyDateFormat;

/**
 *
 * @author root
 */
public class SobreposicaoMetodos {
    /**
     * Formas de sobreposição de métodos em Java
     * @param args 
     */
    public static void main(String[] args) {
        int valorInteiro = 10; // Atribui o valor 10 para uma variável do tipo inteiro
        String valorTexto = "20"; // Atribui o valor 10 como texto para uma variável to tipo texto
        double valorResultadoDouble = 0; // Variável que armazena o resultado do processamento do retorno dos métodos polimorficos em um tipo de ponto flutuante
        
        // Atribui para a variável do tipo ponto flutuante o valor calculado pelo método polimorfico que recebe um valor do tipo inteiro
        valorResultadoDouble = metodoSobreposto(valorInteiro);
        
        // Apresenta a mensagem do valor do resultado do processamento do método polimorfico que recebe por parâmetro um valor do tipo inteiro
        System.out.println("Valor da variável \"valorResultadoDouble\" após retorno do método que recebe um valor inteiros: " + valorResultadoDouble);
        
        // Atribui para a variável do tipo ponto flutuante o valor calculado pelo método polimorfico que recebe um valor do tipo texto
        valorResultadoDouble = metodoSobreposto(valorTexto);
        
        // Apresenta a mensagem do valor do resultado do processamento do método polimorfico que recebe por parâmetro um valor do tipo texto
        System.out.println("Valor da variável \"valorResultadoDouble\" após retorno do método que recebe um valor texto: " + valorResultadoDouble);
        
        // Atribui para a variável do tipo ponto flutuante o valor calculado pelo método polimorfico que recebe dois valores um do tipo inteiro e outro do tipo texto
        valorResultadoDouble = metodoSobreposto(valorInteiro, valorTexto);
        
        // Apresenta a mensagem do valor do resultado do processamento do método polimorfico que recebe por parâmetro dois valores um do tipo inteiro e outro do tipo texto
        System.out.println("Valor da variável \"valorResultadoDouble\" após retorno do método que recebe um valor inteiro e um texto: " + valorResultadoDouble);
        
        System.out.println("Data atual: " + MyDateFormat.dateFormat("dd-MM-yyyy"));
        
    }

    /**
     * Método sobreposto que recebe um valor inteiro
     * @param valorInteiro valor do tipo inteiro
     * @return Retornar um valor do tipo ponto flutuante
     */
    private static double metodoSobreposto(int valorInteiro) {
        double retorno = 0; // Variável que armazena o valor de retorno do método
        
        // Atribui para a variável de retorno o valor recebido pelo parâmetro somando mais o valor de 3.14
        retorno = 3.14 + valorInteiro;
        
        // Efetua o retorno do método
        return retorno;
    }

    /**
     * Método sobreposto que recebe um valor do tipo texto
     * @param valorTexto valor do tipo texto
     * @return Retorna um valor do tipo ponto flutuante
     */
    private static double metodoSobreposto(String valorTexto) {
        double retorno = 0; // Variável que armazena o valor de retorno do método
        
        // Atribui para a variável de retorno o valor recebido pelo parâmetro convertendo este valor para o tipo double e somando mais o valor de 3.14
        retorno = 3.14 + Double.parseDouble(valorTexto);
        
        // Efetua o retorno do método
        return retorno;
    }
    
    /**
     * Método sobreposto que recebe um valor do tipo inteiro e um valor do tipo texto
     * @param valorInteiro valor do tipo inteiro
     * @param valorTexto valor dot tipo texto
     * @return Retorna um valor do tipo ponto flutuante
     */
    private static double metodoSobreposto(int valorInteiro, String valorTexto) {
        double retorno = 0; // Variável que armazena o valor de retorno do método
        
        // Atribui para a variável de retorno o valor recebido pelo parâmetro convertendo este valor para o tipo double e somando mais o valor de 3.14
        retorno = 3.14 + valorInteiro + Double.parseDouble(valorTexto);
        
        // Efetua o retorno do método
        return retorno;
    }
    
}
