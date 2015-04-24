/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import br.edu.utfpr.entity.Livro;
import br.edu.utfpr.entity.Quadrado;

/**
 *
 * @author root
 */
public class ExecucaoVariaveisReferencia {
    
    /**
     * Formas de executar métodos e variáveis por tipos primitivos e por referência
     * @param args 
     */
    public static void main(String[] args) {
        /********** Execução de tipos primitivos e tipos por referência *********/
        
        // Instância a classe Livro
        Livro l = new Livro();
        
        // Apresenta o valor do atributo de clase "nome" porém como não tem valor ainda retornará nulo
        // Exemplo de referência nula
        System.out.println("valor nome é: " + l.getNome());
        
        // Os tipos primitivos são boolean, byte, char, short, int, long, float, e double
        // Estes tipos de variáveis podem armazenar exatamente um valor de seu tipo declarado por vez
        // Quando outro valor é atribuído para essa variável, seu valor será substituido
        // As variáveis dos tipos byte, char, short, int, long, float e double são inicializadas como 0
        // As variáveis do tipo boolean são inicializadas como false
        // LEMBRETE: As variáveis locais NÃO são inicializadas por padrão
        int valor = 5;
        System.out.println("Antes do método valor=" + valor);
        valor = retornaInteiro(10);
        System.out.println("Depois do método valor=" + valor);
        
        
        // Os tipos por referência são utilizadas por objetos
        // Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória do computador
        // As variáveis de instâncias de tipo por referência são inicializadas por padrão com valro null - uma palavra reservada que representa "referência a nada"
        Quadrado quadrado = new Quadrado();
        retornoObjeto(quadrado);
        System.out.println("Objeto ladoA=" + quadrado.getLadoA());
    }
    
    private static int retornaInteiro(int valor) {
        return valor + 1;
    }
    
    private static void retornoObjeto(Quadrado q) {
        q.setLadoA(13.0);
    }
    
}
