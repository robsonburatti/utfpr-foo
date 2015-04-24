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
public class InstrucoesControle {
    
    /**
     * Formas de utilizar instruções de controle no Java
     * @param args 
     */
    public static void main(String[] args) {
        // Instruções de seleções
        System.out.println("==================== Instruções de seleções ====================");
        int notaAluno = 7; // Atribui para a variável o valor da nota do aluno
        
        // Instrução de seleção única if
        System.out.println("Instrução de seleção única \"if\"");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        }
        
        // Instrução de seleção dupla if ... else
        System.out.println("Instrução de seleção dupla \"if\" ... \"else\"");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno está reprovado!");
        }

        // Instrução de seleção dupla if ... else aninhado
        System.out.println("Instrução de seleção dupla \"if\" ... \"else\" aninhado");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        } else if (notaAluno <= 0) {
            System.out.println("O aluno está reprovado!");
        } else {
            System.out.println("O aluno está em recuperação!");
        }
        
        // Instrução de seleção condicional ?:
        System.out.println("Instrução de seleção condicional \"?:\"");
        
        // Também conhecido como if ternário
        String statusAluno = ((notaAluno >= 6) ? "aprovado" : "reprovado");
        
        System.out.println("O valor de está " + statusAluno + "!");
        
        // Instrução de seleção múltipla switch
        System.out.println("Instrução de seleção múltipla \"switch\"");
        
        switch (notaAluno) {
            case 6 : {
                System.out.println("Passou com média 6!");
                break;
            }
            
            case 7 : {
                System.out.println("Passou com média 7!");
                break;
            }
            
            case 8 : {
                System.out.println("Passou com média 8!");
                break;
            }
            
            case 9 : {
                System.out.println("Passou com média 9!");
                break;
            }
            
            case 10 : {
                System.out.println("Passou com média 10!");
                break;
            }
            
            default : {
                System.out.println("Aluno está reprovado ou em recuperação!");
                break;
            }
        }
        
        // Instruções de repetições
        System.out.println("==================== Instruções de repetições ====================");
        
        // Instrução de repetição while
        System.out.println("Instrução de repetição \"while\"");
        int valorCorrente = 0; // Atribui um valor inteiro para a variável que vai percorrer a instrução de repetição
        
        while (valorCorrente <= 10) {
            System.out.println("Valor da variável valorCorrente percorrendo o while: " + valorCorrente);
            valorCorrente++;
        }
        
        // Instrução de repetição do ... while
        System.out.println("Instrução de repetição \"do ... while\"");
        valorCorrente = 0; // Atribui valor 0 novamente para a variável que vai percorrer a instrução de repetição
        
        do {
            System.out.println("Valor da variável valorCorrente percorrendo o do ... while: " + valorCorrente);
            valorCorrente++;
        } while (valorCorrente <= 10);
        
        // Instrução de repetição for
        System.out.println("Instrução de repetição \"for\"");
        
        for (int corrente = 0; corrente <= 10; corrente++) {
            System.out.println("Valor da variável corrente percorrendo o for normal: " + corrente);
        }
        
        // Instrução de repetição foreach
        System.out.println("Instrução de repetição \"foreach\"");
        String[] listaFrutas = { "maçã", "laranja", "uva", "manga", "pera" }; // Cria um array ou vetor do tipo texto e atribui para esta lista algumas frutas
        
        for (String fruta : listaFrutas) {
            System.out.println("O valor da fruta corrente é: " + fruta);
        }
        
        // Instruções de interrupções
        System.out.println("==================== Instruções de interrupções ====================");
        
        // Instrução de interrupção break unlabeled
        System.out.println("Instrução de interrupção \"break unlabeled\"");
        
        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                break; // Para a execução da lista
            }
            
            System.out.println("Valor corrente da variável contado: " + contador);
        }
        
        // Instrução de interrupção unlabeled continue
        System.out.println("Instrução de interrupção \"unlabeled continue\"");
        
        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                continue; // Pula para o próximo da lista
            }
            
            System.out.println("Valor corrente da variável contado: " + contador);
        }
        
        // Instrução de interrupção labeled break
        System.out.println("Instrução de interrupção \"labeled break\"");
        // Declaração de um array com inicializadores com 2 linhas sendo a primeira linha com 2 colunas e a segunda com 3 colunas
        int[][] arrayInteirosInicializadores = { { 1, 2 }, { 3, 4, 5 } };
        
        // Primeiro for percorre as linhas
        retornaAqui: for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
                if (coluna == 1) {
                    break retornaAqui; // Para o for onde está declarada a label
                }
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
        
        // Instrução de interrupção labeled continue 
        System.out.println("Instrução de interrupção \"labeled continue\"");
        retornaAqui: for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
                if (coluna == 1) {
                    continue retornaAqui; // Retorna para a linha onde esta declarada a label
                }
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
    }
    
}
