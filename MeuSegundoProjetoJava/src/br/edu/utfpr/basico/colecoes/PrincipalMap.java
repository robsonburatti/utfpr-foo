/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.colecoes;

import br.edu.utfpr.entity.Livro;
import java.util.HashMap;

/**
 *
 * @author root
 */
public class PrincipalMap {
    
    public static void main(String[] args) {
        mapInteirosString();
        mapStringString();
        mapDoubleObjeto();
        mapBuscaStringString();
        mapManipulandoDados();
        
    }

    private static void mapInteirosString() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "preto");
        map.put(2, "branco");
        map.put(3, "azul");
        
        System.out.println("A terceira cor é: " + map.get(3));
    }

    private static void mapStringString() {
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("cor1", "preto");
        map.put("cor2", "branco");
        map.put("cor3", "azul");
        
        System.out.println("A segunda cor é: " + map.get("cor2"));
    }

    private static void mapDoubleObjeto() {
        HashMap<Double, Livro> map = new HashMap<Double, Livro>();
        
        Livro livroJava = new Livro("Java");
        Livro livroC = new Livro("C");
        Livro livroPython = new Livro("Python");
        
        map.put(1.1, livroJava);
        map.put(2.5, livroC);
        map.put(3.6, livroPython);
        
        System.out.println("O Livro escolhido foi o livro: " + map.get(1.1).getNome());
        
    }

    private static void mapBuscaStringString() {
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("cor1", "preto");
        map.put("cor2", "branco");
        map.put("cor3", "azul");
        
        String chave = "cor1";
        
        if (map.containsKey(chave)) {
            System.out.println("Existe esta chave e o valor dela é: " + map.get(chave));
        } else {
            System.out.println("Não existe nenhum valor com esta chave!");
        }
        
        String valor = "preto";
        
        if (map.containsValue(valor)) {
            System.out.println("Existe este valor no hashmap!");
        } else {
            System.out.println("Não existe este valor no hashmap!");
        }
        
        System.out.println("A segunda cor é: " + map.get("cor2"));
    }

    private static void mapManipulandoDados() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "preto");
        map.put(2, "branco");
        map.put(3, "azul");
        
        System.out.println("A terceira cor é: " + map.get(3));
        
        map.remove(3);
        
        System.out.println("Segunda chamada para imprimir terceira cor é: " + map.get(3));
        
        System.out.println("Valor da chave 2: " + map.get(2));
        
        map.put(2, "vermelho");
        
        System.out.println("Valor da chave 2: " + map.get(2));
    }
    
}
