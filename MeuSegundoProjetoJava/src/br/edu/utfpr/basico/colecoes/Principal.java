/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.colecoes;

import br.edu.utfpr.entity.Livro;
import br.edu.utfpr.entity.Quadrado;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class Principal {
    
    private static List<Livro> listaLivro;
    private static List listaGenerica;
    
    public static void main(String[] args) {
        //execucao();
        metodoGenerico();
    }

    private static void execucao() {
        List<Livro> lista = new ArrayList<Livro>();
        // Forma incorreta de utilizar listas deve sempre colocar a tipagem da lista
//        List lista = new ArrayList();
        
        Livro livroJava = new Livro();
        
        livroJava.setNome("Java");
        
        Livro livroC = new Livro();
        
        livroC.setNome("Proagamação C");
                
        lista.add(livroJava);
        lista.add(livroC);
        
        for (Livro livro : lista) {
            System.out.println("O Livro corrente é: " + livro.getNome());
        }
        
        Quadrado quadrado = new Quadrado();
        
        quadrado.setArea(13);
        
        // Forma incorreta de adicionar 2 ou mais tipos de obejtos na mesma lista
//        lista.add(quadrado);
        
        // Forma incorreta de percorrer uma lista de objetos diferentes na mesma lista
//        for (Object object : lista) {
//            System.out.println("O Livro corrente é: " + object.getNome());
//        }
        
        
    }

    private static void metodoGenerico() {
        listaLivro = new ArrayList<Livro>();
        
        Livro livro = new Livro();
        
        livro.setNome("Java");
        
        addListaLivro(livro);
        
        listaGenerica = new ArrayList();
        
        addListaGenerica(livro);
        
    }

    private static void addListaLivro(Livro livro) {
        if ((listaLivro == null) || (listaLivro.isEmpty())) {
            listaLivro = new ArrayList<Livro>();
        }
        
        listaLivro.add(livro);
        
        // Compara se o objeto é de determinado tipo de objeto
        if (livro instanceof Livro) {
            //
        }
                
    }

    private static void addListaGenerica(Object objeto) {
        if ((listaGenerica == null) || (listaGenerica.isEmpty())) {
            
            if (objeto instanceof Livro) {
                listaGenerica = new ArrayList<Livro>();
            } else if (objeto instanceof Quadrado) {
                listaGenerica = new ArrayList<Quadrado>();
            } else {
                return;
            }
        }
        
        addListaGenerica(objeto);
    }
    
}
