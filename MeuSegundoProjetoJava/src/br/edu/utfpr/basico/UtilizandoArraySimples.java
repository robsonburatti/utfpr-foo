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
public class UtilizandoArraySimples {
    
    /**
     * Formas de utilizar arrays simples em Java encontrados em alguns livros como vetor
     * @param args 
     */
    public static void main(String[] args) {
        // Declara a variável de array 
        int[] arrayInteiros;
        int soma = 0;
        int divisao = 0;
        int[] outroArrayInteiros;
        final int TAMANHO_DO_ARRAY = 10;
        int posicao = 0;
        
        // cria o array e atribui à variável de array de inteiros com o tamanho ou a quantidade de posições
        arrayInteiros = new int[12];
        
        // Atribui para cada posição do array de inteiros um valor;
        arrayInteiros[0] = -45;
        arrayInteiros[1] = 6;
        arrayInteiros[2] = 0;
        arrayInteiros[3] = 72;
        arrayInteiros[4] = 1543;
        arrayInteiros[5] = -89;
        arrayInteiros[6] = 0;
        arrayInteiros[7] = 62;
        arrayInteiros[8] = -3;
        arrayInteiros[9] = 1;
        arrayInteiros[10] = 6453;
        arrayInteiros[11] = 78;
        
        // Efetua o calculo da soma das 3 primeiras posições do array de inteiros
        soma = arrayInteiros[0] + arrayInteiros[1] + arrayInteiros[2];
        
        // Efetua o calculo da divisão da sétima posição do array de inteiros por dois
        divisao = arrayInteiros[7] / 2;
        
        // Apresenta o resultado da soma das 3 primeiras posições do array de inteiros
        System.out.println("Resultado da soma: " + soma);
        
        // Apresenta o resultado da divisão da sétima posição do array de inteiros por dois
        System.out.println("Resultado da divisão: " + divisao);
        
        // Outra forma de criar um array com um inicializador
        String[] arrayTexto = { "posição 0", "posição 1", "posição 2" };
        
        // Apresenta todas as posições do array de inteiros
        for (int posicaoCorrenteArray = 0; posicaoCorrenteArray < arrayInteiros.length; posicaoCorrenteArray++) {
            System.out.println("Forma de apresentação simples sendo o valor na posição " + posicaoCorrenteArray + " recebe o valor = " + arrayInteiros[posicaoCorrenteArray]);
        }
        
        System.out.println("----------------------------------------------------------------");
        
        // Outra forma aprimorada de apresentar todas as posiçõesdo array de inteiros
        for (int valorCorrente : arrayInteiros) {
            System.out.println("Forma de apresentação aprimorada sendo o valor na posição " + posicao + " recebe o valor = " + valorCorrente);
            posicao++;
        }
        
        // Outra forma de boas práticas de programação é usar uma constante para definir o tamanho do array
        outroArrayInteiros = new int[TAMANHO_DO_ARRAY];
    }
    
}
