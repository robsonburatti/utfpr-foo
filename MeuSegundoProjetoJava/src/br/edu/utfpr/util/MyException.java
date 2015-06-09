/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class MyException extends Exception {
    
    public void messageSystem() {
        System.out.println("Mensagem de tratamento de erro usando System");
    }
    
    public void messageJOptionPane() {
        JOptionPane.showMessageDialog(null, "Mensagem de tratamento de erro usando JOptionPane!");
    }
    
}
