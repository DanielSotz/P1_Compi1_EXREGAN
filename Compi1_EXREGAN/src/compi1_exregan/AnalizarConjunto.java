/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1_exregan;

import java.util.LinkedList;

/**
 *
 * @author danis
 */
public class AnalizarConjunto {
    String terminal;
    LinkedList<Integer> conjunto_s;
    String tipo_terminal;
    
    //public AnalizarConjunto (String terminal,LinkedList<Integer> conjunto_s ){
    public AnalizarConjunto (String terminal,LinkedList<Integer> conjunto_s, String tipo_terminal ){
        
        this.terminal = terminal;
        this.conjunto_s = conjunto_s;
        
        this.tipo_terminal = tipo_terminal;
    }
}
