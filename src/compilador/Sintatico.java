/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;

/**
 *
 * @author AlphaLegends
 */
public class Sintatico {
    public ArrayList< Token > tokens;

    public Sintatico() {

    }
    
    public void analisar(ArrayList<Token> tokens){
        this.tokens = tokens;
        for(int i=0;i<this.tokens.size()-1;i++){
            if(tokens.get(i).tipo.equals("comando")){
                //if(tokens.get(i+1).palavra.equals(""))
            }
            else if(tokens.get(i).tipo.equals("operacao")){
                    if(tokens.get(i+1).tipo.equals("digito")){}
                    else if(tokens.get(i).tipo.equals("numero")){}
                    else if(tokens.get(i).tipo.equals("variavel")){}
                    else if(tokens.get(i).tipo.equals("letra")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }

            }
            else if(tokens.get(i).tipo.equals("comparacao")){
                    if(tokens.get(i+1).tipo.equals("digito")){}
                    else if(tokens.get(i).tipo.equals("numero")){}
                    else if(tokens.get(i).tipo.equals("variavel")){}
                    else if(tokens.get(i).tipo.equals("letra")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            else if(tokens.get(i).tipo.equals("atribuicao")){
                    if(tokens.get(i+1).tipo.equals("digito")){}
                    else if(tokens.get(i).tipo.equals("numero")){}
                    else if(tokens.get(i).tipo.equals("variavel")){}
                    else if(tokens.get(i).tipo.equals("letra")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            else if(tokens.get(i).tipo.equals("variavel")){
                    if(tokens.get(i+1).tipo.equals("operacao")){}
                    else if(tokens.get(i).tipo.equals("comparacao")){}
                    else if(tokens.get(i).tipo.equals("atribuicao")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            else if(tokens.get(i).tipo.equals("letra")){
                    if(tokens.get(i+1).tipo.equals("operacao")){}
                    else if(tokens.get(i).tipo.equals("comparacao")){}
                    else if(tokens.get(i).tipo.equals("atribuicao")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            else if(tokens.get(i).tipo.equals("numero")){
                    if(tokens.get(i+1).tipo.equals("operacao")){}
                    else if(tokens.get(i).tipo.equals("comparacao")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            else if(tokens.get(i).tipo.equals("digito")){
                    if(tokens.get(i+1).tipo.equals("operacao")){}
                    else if(tokens.get(i).tipo.equals("comparacao")){}
                    else {
                        System.out.println("Erro sintatico");
                        return;
                    }
 
            }
            
            
            
            
        }
        
        
        
        
        
    }
    
    
    
    
}
