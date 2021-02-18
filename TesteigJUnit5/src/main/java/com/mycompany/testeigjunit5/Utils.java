/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeigjunit5;

/**
 *
 * @author alumne
 */
public class Utils {
     public static String juntaSaltejats(int salts, String... cadena){
        //Declaració de variables del métode juntaSaltejats
        String resultat="";
        int longitud;

        //Tractament casos especials
        if (cadena==null) return null;
        if(salts<1 || cadena.length==0 ) return "0";
        
        
        //Concatenació de les cadenes
         for (int i = 0; i < cadena.length; i+=salts) {
             resultat+=cadena[i];
         }
         longitud=resultat.length();
         
         for (int i = 0; i < resultat.length(); i++ ) {
             if(resultat.charAt(i)==' ') longitud--;
         }
         resultat=longitud+":"+resultat;
        
        
        return resultat;
    }
}
