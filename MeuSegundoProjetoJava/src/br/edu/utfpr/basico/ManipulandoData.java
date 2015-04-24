/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.basico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author root
 */
public class ManipulandoData {
    
    /**
     * Formas de manipuar datas em Java
     * @param args 
     */
    public static void main(String[] args) {
        try {
            Date dataDate = new Date(); // Cria uma variável do tipo Date que armazena os valores contidos em uma determinada data e atribui a ela a data atual
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); // Cria um formatador de datas de acordo com a mascara que é passada
            Date minhaDataDate = format.parse("13-06-2017"); // Cria variável do tipo data com um valor definido
             
            // Apresenta a variável data sem formatação
            System.out.println("Data e hora atual sem formatação: " + dataDate.toString());
            
            // Apresenta a variável data com formatação
            System.out.println("Data e hora atual com formatação: " + format.format(dataDate));
            
            // Apresenta a data criada com a formatação
            System.out.println("Minha data e hora atual com formatação: " + format.format(minhaDataDate));

            System.out.println("================================================================");

            Calendar dataCalendar = Calendar.getInstance(); // Cria uma variável do tipo Calendar que armazena os valores contidos em uma determinada data e atribui a ela a data atual

            // Apresenta a variável data sem formatação
            System.out.println("Data e hora atual: " + dataCalendar.getTime());

            Date dataAtual = new Date(); // Cria uma variável do tipo Date armazenando a data atual
            Calendar calendar = Calendar.getInstance(); // Cria uma variaável do tipo Calendar que armazena a data atual

            // Atribui para a variável calendar o valor contido na variável dataAtual
            calendar.setTime(dataAtual);

            DateFormat formatador = DateFormat.getDateInstance(DateFormat.MEDIUM); // Cria um formatador de datas de acordo com o tipo da formatação que é passada
            /*
            Dateformat.SHORT // 03/04/10
            Dateformat.MEDIUM // 03/04/2010
            Dateformat.LONG //3 de Abril de 2010
            Dateformat.FULL //Sábado, 3 de Abril de 2010
            */

            // Apresenta a variável calendar formatada
            System.out.println("Data atual formatada: " + formatador.format(calendar.getTime()) );
            
            // Atribui para a variável calendar o valor definido
            calendar.setTime(formatador.parse("28/04/2015"));
            
            // Apresenta o novo valor da variável calendar formatada
            System.out.println("Novo valor da variável com a data formatada: " + formatador.format(calendar.getTime()) );
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
