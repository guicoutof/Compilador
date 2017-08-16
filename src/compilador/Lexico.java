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
public class Lexico {

        public ArrayList< Token > tokens = new ArrayList<Token>();   
        public Token token = null;

    public Lexico() {
    }


    public void exibirArray(){
        for(int i=0;i<tokens.size();i++){
            tokens.get(i).exibirToken();
        }
    }
    
    public void analisar(String split){

        String[] linha = split.split(" ");
        linha = split.split("");
        for(int i=0;i<linha.length;i++){
   
         if( null != comando(linha[i]))tokens.add(comando(linha[i]));
         else if( null != operacao(linha[i]))tokens.add(operacao(linha[i]));
         else if( null != comparacao(linha[i]))tokens.add(comparacao(linha[i]));
         else if( null != atribuicao(linha[i]))tokens.add(atribuicao(linha[i]));
         else if( null != variavel(linha[i]))tokens.add(variavel(linha[i]));
         else if( null != letra(linha[i]))tokens.add(letra(linha[i]));
         else if( null != numero(linha[i]))tokens.add(numero(linha[i]));
         else if( null != sinal(linha[i]))tokens.add(sinal(linha[i]));
         else if( null != digito(linha[i]))tokens.add(digito(linha[i]));
         
         
        }     
    }    
    
    public Token comando(String palavra){
        if(palavra.equals("se"))return new Token("operacao",palavra);
        if(palavra.equals("ler"))return new Token("operacao",palavra);
        if(palavra.equals("escrever"))return new Token("operacao",palavra);
        if(palavra.equals("else"))return new Token("operacao",palavra);
        if(palavra.equals("enquanto"))return new Token("operacao",palavra);
        return null;
    }
    
    public Token operacao(String palavra){
        if(palavra.equals("+"))return new Token("operacao",palavra);
        if(palavra.equals("-"))return new Token("operacao",palavra);
        if(palavra.equals("*"))return new Token("operacao",palavra);
        if(palavra.equals("/"))return new Token("operacao",palavra);
        return null;
    }
       
    
    public Token comparacao(String palavra){
        if(palavra.equals(">"))return new Token("comparacao",palavra);
        if(palavra.equals("<"))return new Token("comparacao",palavra);
        if(palavra.equals(">="))return new Token("comparacao",palavra);
        if(palavra.equals("<="))return new Token("comparacao",palavra);
        if(palavra.equals("=="))return new Token("comparacao",palavra);
        if(palavra.equals("!="))return new Token("comparacao",palavra);
        return null;
    }
    
    public Token atribuicao(String palavra){
        if(palavra.equals("="))return new Token("atribuicao",palavra);
        return null;
    }
    
    public Token variavel(String palavra){
        if(palavra.length()>1){
        if( (palavra.charAt(0) < 64) || (palavra.charAt(0)<133))return new Token("variavel",palavra);
        if( (palavra.charAt(0) < 96) || (palavra.charAt(0)<173))return new Token("variavel",palavra);
        }
        return null;
    }
    
    public Token letra(String palavra){
        if(palavra.length()==1){
        if( (palavra.charAt(0) > 64) && (palavra.charAt(0)<133))return new Token("letra",palavra);
        if( (palavra.charAt(0) > 96) && (palavra.charAt(0)<173))return new Token("letra",palavra);
        }
        return null;
    }
    
    public Token numero(String palavra){
        for(int i=0;i<palavra.length();i++){
            if(palavra.charAt(i) != '0') return null;
            if(palavra.charAt(i) != '1') return null;
            if(palavra.charAt(i) != '2') return null;
            if(palavra.charAt(i) != '3') return null;
            if(palavra.charAt(i) != '4') return null;
            if(palavra.charAt(i) != '5') return null;
            if(palavra.charAt(i) != '6') return null;
            if(palavra.charAt(i) != '7') return null;
            if(palavra.charAt(i) != '8') return null;
            if(palavra.charAt(i) != '9') return null;  
        }
        return new Token("numero",palavra);
    }
    
        public Token sinal(String palavra){
            if(palavra.equals("+")) return new Token("sinal",palavra);
            if(palavra.equals("-")) return new Token("sinal",palavra);
            return null;
        }
    
    public Token digito(String palavra){
        if(palavra.equals("0")) return new Token("digito",palavra);
        if(palavra.equals("1")) return new Token("digito",palavra);
        if(palavra.equals("2")) return new Token("digito",palavra);
        if(palavra.equals("3")) return new Token("digito",palavra);
        if(palavra.equals("4")) return new Token("digito",palavra);
        if(palavra.equals("5")) return new Token("digito",palavra);
        if(palavra.equals("6")) return new Token("digito",palavra);
        if(palavra.equals("7")) return new Token("digito",palavra);
        if(palavra.equals("8")) return new Token("digito",palavra);
        if(palavra.equals("9")) return new Token("digito",palavra);
        return null;
    }    
        
        
        
        
}
