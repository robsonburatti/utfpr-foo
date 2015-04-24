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
public class UtilizandoArrayMultidimencional {
    
    /**
     * Formas de utilizar arrys multidimencionais com linhas e colunas usado também em matrizes
     * @param args 
     */
    public static void main(String[] args) {
        // Declara o array sendo nomeArray[linha][coluna]
        int[][] arrayInteiros;
        
        // Este array vai possuir 2 linhas
        arrayInteiros = new int[2][];
        
        // Define que na linha 0 vai conter 5 colunas
        arrayInteiros[0] = new int[5];
        // Define que na linha 1 vai conter 3 colunas
        arrayInteiros[1] = new int[3];
        
        // Outra forma de declarar um array com inicializadores com 2 linhas sendo a primeira linha com 2 colunas e a segunda com 3 colunas
        int[][] arrayInteirosInicializadores = { { 1, 2 }, { 3, 4, 5 } };
        
        // Outra forma de declaração de array com valores estáticos com 3 linhas e 4 colunas
        int[][] arrayValoresEstaticos = new int[3][4];
        
        // Apresentando os dados de um array 
        // Primeiro for percorre as linhas
        for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
    }
    
}
