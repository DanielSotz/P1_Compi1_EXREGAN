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
public class Siguientes {
    String hoja;
    int id;
    //String nexts;
    LinkedList<Integer> nexts;
    String Tipo_hoja;
    
    ////public Siguientes (String hoja,int id, String nexts ){
    //public Siguientes (String hoja,int id, LinkedList<Integer> nexts ){
    public Siguientes (String hoja,int id, LinkedList<Integer> nexts, String Tipo_hoja ){
        
        this.hoja = hoja;
        this.id = id;
        this.nexts = nexts;
        
        this.Tipo_hoja = Tipo_hoja;
    }
}