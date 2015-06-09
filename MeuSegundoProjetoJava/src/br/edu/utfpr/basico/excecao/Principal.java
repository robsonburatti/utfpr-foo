/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.excecao;

import br.edu.utfpr.util.MyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Principal {
    
    public static void main(String[] args) {
        
            //        double retorno = 0;
//
//        try {
//            retorno = divisor2(4, 0);
//        } catch (Exception ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        try {
//            retorno = divisor2(4, 0);
//        } catch(Exception e) {
//            System.err.println("Ocorreu erro.");
//        }
//        
//        System.out.println("Retorno=" + retorno);
//        try {   
////            metodo1();
//            divisor2(1,1);
//        } catch (Exception e) {
//            System.err.println("Tratou o erro antes.");
//            // Apresenta qual o pacote seguido da clase 
//            // seguido da linha que ocorreu o erro
//            // e também de quais hierarquias de métodos
//            // ocorreu o erro
//            e.printStackTrace();
//            
//            System.out.println("O erro é: " + e.getMessage());
//            System.err.println("Tratou o erro depois.");
//        } finally {
//            System.out.println("Passou no finaly.");
//        }
        
        try {
            divisor2(1, 1);
            divisor2();
        } catch (MyException e) {
            e.messageSystem();
        } catch (Exception ex) {
            System.out.println("Tratamento com a Classe Exception!");
        }
    }
    
    public static double divisor(double valor1, double valor2) {
        double resultado = 0;
        
        try {
            resultado = 4/0;
            System.out.println("Resultado=" + resultado);
            return resultado;
        } catch(Exception e) {
            System.err.println("Ocorreu erro.");
        }
        
        System.out.println("depois do try");
        return 0;
    }
    
    public static double divisor2(double valor1, double valor2) throws Exception {
        return (4/0);
    }
    
    public static double divisor2() throws MyException {
        return (4/0);
    }
    
    public static void metodo1() throws Exception {
        System.out.println("Antes método1");
        metodo2();
        System.out.println("Depois método1");
    }

    private static void metodo2() throws Exception {
        System.out.println("Antes método2");
        try {
            metodo3();
        } catch(Exception e) {
            System.err.println("Tratou mensagem no método2");
        }
        System.out.println("Depois método2");
    }

    private static void metodo3() throws Exception {
        System.out.println("Antes método3");
        throw new Exception(); // Força para ocorrer um erro no sistema
//        System.out.println("Depois método3");
    }
    
}
