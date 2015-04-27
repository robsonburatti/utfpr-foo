/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author root
 */
public class MyDateFormat {
    
    private static SimpleDateFormat format;
    
    public static Date dateFormat(String formato, String data) {
        try {
            format = new SimpleDateFormat(formato);
            Date retorno = format.parse(data);
            return retorno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String dateFormat(String formato) {
        try {
            format = new SimpleDateFormat(formato);
            String retorno = format.format(new Date());
            return retorno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static int dateFormat(String formato, double x, int i) {
        return 1;
    }
    
    public static int dateFormat(double x, String formato, int i) {
        return 1;
    }
    
    public static int dateFormat(double x,  int i, String formato) {
        return 1;
    }
    
}
