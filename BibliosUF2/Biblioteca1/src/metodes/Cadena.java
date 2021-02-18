/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 *
 * @author alumne
 */
public class Cadena {
    public static int buscaCadena(String text, String subcadena, int numero){
        //Tractament casos especials
        if (text==null || subcadena==null || numero>=text.length()) return -1;
        if (numero<0) numero=0;
        if (subcadena.length()==0)return numero<text.length()?numero:text.length();
        
        return text.indexOf(subcadena, numero);
    }
    
    //Inserta cadena del ex 4
    
    public static String retornaCadenaBuida(){
        return "";
    }
}
