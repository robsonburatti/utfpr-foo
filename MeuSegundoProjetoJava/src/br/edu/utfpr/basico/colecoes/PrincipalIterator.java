/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico.colecoes;

import br.edu.utfpr.entity.Livro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class PrincipalIterator {
    
    public static void main(String[] args) {
        carregaLista();
    }

    private static void carregaLista() {
        // Cria a lista de Livro e intância a mesma
        List<Livro> listaLivro = new ArrayList<Livro>();
        
        // Cria um objeto do tipo Livro
        Livro livroC = new Livro();
        livroC.setNome("Programação C");
        
        // Cria um objeto do tipo Livro
        Livro livroJava = new Livro();
        livroJava.setNome("Programação Java");
        
        // Adiciona os objetos do tipo Livro na lista de livros
        listaLivro.add(livroC);
        listaLivro.add(livroJava);
        
        // Cria e instância o Iterator da lista de livros
        Iterator<Livro> iterator = listaLivro.iterator();
        
        // Percorre a lista de livros utilizando o Iterator
        while (iterator.hasNext()) { // Método .hasNext() retorna um valor boobleano se existe mais um próximo objeto do tipo Livro na lista
            Livro livroCorrente = iterator.next(); // Método .next() retorna o objeto do tipo Livro corrente a cada vez que é executado o método pe pulado para o próximo objeto da lista
            iterator.next(); // Pulou para o próximo objeto do tipo Livro da lista
//            iterator.next(); // Pulou para o próximo objeto do tipo Livro da lista e causou erro porque não existe um terceiro objeto nesta lista
            System.out.println("O nome do livro é: " + livroCorrente.getNome()); // Trabalhando com o objeto do tipo Livro corrente
        }
    }
    
}