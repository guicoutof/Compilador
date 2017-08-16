/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author AlphaLegends
 */
public class Token {
    public String tipo;
    public String palavra;

    public Token(String tipo, String palavra) {
        this.tipo = tipo;
        this.palavra = palavra;
    }

    public void exibirToken(){
        System.out.println(tipo);
        System.out.println(palavra);
    }
    
}
