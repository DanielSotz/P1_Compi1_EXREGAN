/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1_exregan;

/**
 *
 * @author danis
 */
public class Token {
    
    String lexema;
    String idToken;
    int linea;
    int columna;
    
    
    public Token (String lexema, String idToken, int linea, int columna){
        this.lexema = lexema;
        this.idToken = idToken;
        this.linea = linea;
        this.columna = columna;
    }
}
