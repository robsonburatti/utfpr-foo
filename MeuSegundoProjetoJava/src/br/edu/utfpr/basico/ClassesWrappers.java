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
public class ClassesWrappers {
    
    /**
     * Formas de utilização de classes Wrappers do Java
     * @param args 
     */
    public static void main(String[] args) {
        String textoNumeroInteiro = "9822"; // Variável do tipo texto recebendo um valor inteiro
         
        // Representação em Classes Wrappers recebendo valores do tipo texto quando estão sendo inicializadas
        Float floatString = new Float("500.50");
        Integer integerString = new Integer(textoNumeroInteiro);
        Double doubleString = new Double("512.22");
         
        // O argumento somente aceita do tipo char, por isso que é usado aspas simples
        Character characterWrapper = new Character('a');
         
        // Criação do tipo primitivo natural
        Float floatPrimitivo = new Float(500.50);
        Integer integerPrimitivo = new Integer(2800);
        Double doublePrimitivo = new Double(512.22);
        
        // Apresenta a mensagem do valor de uma variável do tipo Float que recebeu o valor string
        System.out.println("Float representado por string: " + floatString);
        
        // Apresenta a mensagem do valor de uma variável do tipo Float que recebeu o valor primitivo
        System.out.println("Float natural: " + floatPrimitivo);
        
        // Apresenta a mensagem do valor de uma variável do tipo inteiro que recebeu o valor de uma string
        System.out.println("Integer representado por string: " + integerString);
        
        // Apresenta a mensagem do valor de uma variável do tipo Character
        System.out.println("Char: " + characterWrapper);

        System.out.println("===================================================================");
        
        // Conversão de valores utilizando as Classes Wrappers
        Integer velocidade = new Integer(587); // Variável que tipo inteiro de uma classe wrapper
         
        // Converte a variável velocidade para tipo primitivo
        int totalInt = velocidade.intValue();
        double totalDouble = velocidade.doubleValue();
        short totalShort = velocidade.shortValue();
        byte totalByte = velocidade.byteValue();
         
        // Conversão de ponto flutuante para inteiro usando a classe wrapper
        Double pontoFlutuante = new Double(3.14); // Variável que armazena o valor de um ponto flutuante do tipo double
        int valorConvertido = pontoFlutuante.intValue(); // Variável do tipo inteiro recebendo o valor da variável de ponto flutuante
        
        // Apresenta a mensagem do valor inteiro convertido do valor do ponto flutuante
        System.out.println("O valor do inteiro do ponto flutuante é: " + valorConvertido);
        
        System.out.println("===================================================================");
        
        // Classe Wrapper Booleana
        Boolean valorBooleanoStringMinusculo = new Boolean("true");
        Boolean valorBooleanoStringMaiusculo = new Boolean("FALSE");
        Boolean valorBooleanoPrimitivo = new Boolean(true);
        String valorBooleano = "true"; // Variável do tipo texto que armazena um valor booleno
        Boolean valorBooleanoVariavelTexto = new Boolean(valorBooleano);
        
        // Apresenta a mensgem do valor da variável booleana com texto em minusculo
        System.out.println("Valor da variável booleana com texto em minusculo: " + valorBooleanoStringMinusculo);
        
        // Apresenta a mensgem do valor da variável booleana com o texto em maiusculo
        System.out.println("Valor da variável booleana com o texto em maiusculo: " + valorBooleanoStringMaiusculo);
        
        // Apresenta a mensgem do valor da variável booleana com valor primitivo
        System.out.println("Valor da variável booleana com valor primitivo: " + valorBooleanoPrimitivo);
        
        // Apresenta a mensgem do valor da variável booleana que recebeu valor de uma variável do tipo texto
        System.out.println("Valor da variável booleana que recebeu valor de uma variável do tipo texto: " + valorBooleanoVariavelTexto);
        
    }
    
}
