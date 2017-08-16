/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlphaLegends
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Lexico lexico = new Lexico();
    
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();

    try {
      FileReader fp = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(fp);
 
      String linha = lerArq.readLine(); 
      
      while (linha != null) {
        System.out.printf("%s\n", linha);
                
        lexico.analisar(linha);
        linha = lerArq.readLine();
        
      }
      lexico.exibirArray();
      
      
      fp.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());  
    }

    } 

}
