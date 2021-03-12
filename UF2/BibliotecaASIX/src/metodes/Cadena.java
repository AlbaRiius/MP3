/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import java.util.Scanner;

/**
 * Mètodes utilitzats en els projectes de m3 sobre cadenes.
 * Per exemple: buscar una cadena dins d'una altra, concatenar cadenes...
 * @author alumne: Alba Rius
 */
public class Cadena {
    
    /**
     * Retornarà un enter indicant la posició del segon String (subcadena) dins del primer (text)
     * a partir de la posició especificada pel número, o -1 si no es troba.
     * @param primer El text on s'ha de buscar la subcadena
     * @param segon La subcadena que s'ha de buscar dins del text
     * @param pos La posició del text en la que començarà a buscar
     * @return Un enter indican la pisició de segon dins de primer a partir de pos
     */
    public static int buscaCadena(String primer, String segon, int pos){
        //Casos especials
        if(primer==null || segon==null || pos>=primer.length()) return -1;
        if(pos<0) pos=0;
        if(segon.length()==0) return pos<primer.length()?pos:primer.length();
        
        //Tractament de cas normal
        return primer.indexOf(segon, pos);
    }
        
    /**
     * Retornarà un String resultat d'insertar el segon String en el primer
     * a la posició especificada pel número (recordeu que comencen per 0).
     * si els 2 Strings són null el mètode retornarà null, 
     * si només un d'ells és null retornarà l'String no null,
     * si el número és negatiu se farà el mateix que si valguès 0,
     * si el número és superior a la llargada del primer String, se farà el
     * mateix que si valgués la llargada.   
     * @param primer Cadena en la que hem d'insertar segon
     * @param segon Cadena que insertarem a la posicio expecificada dins de primer
     * @param posicio Posicio en la que insertarem segon
     * @return un String resultat d'insertar segon dins de primer a la posició posicio
     */
    public static String insertaCadena(String primer, String segon, int posicio){
        //Tractament de casos especials 
        if(primer==null && segon==null) return null;
        if(primer==null && segon!=null) return segon;
        if(primer!=null && segon==null) return primer;
        if(posicio<0) posicio=0;
        if(posicio>primer.length()) posicio=primer.length();
        
        //Declaracio de variables
        String resultat="";
        
        //Extreure el troç inicial de primer des de el primer caràcter fins 
        //l'anterior a posicio
        for (int i = 0; i < posicio; i++) {
            resultat+=primer.charAt(i);
        }
        //Versió curta
        //resultat=primer.substring(0, posicio);
        
        //Ara concatenem tot el segon String al resultat
        resultat+=segon;
        
        //Ara només falta concatenar el troç final del primer String al resultat
        for (int i = posicio; i < primer.length(); i++) {
            resultat+=primer.charAt(i);
        }
        //Versió curta
        //resultat=primer.substring(posicio);

        //Finalment retornem la cadena que conté el resultat desitjat
        return resultat;
    }
    
    /**
     * El métode retorna una cadena buida. No rep cap paràmetre.
     * @return una cadena buida
     */
    public static String retornaCadenaBuida(){
        return "";
        
    }
    
    /**
     * Extrau un missatge per a que l'usuari sapigue que ha de fer i obliga a que introduixque un text
     * tal i com demana el missatge. Acaba quan introdueix el caracter final (carFin). L'usuari va escruibint linies
     * i el métode les va concatenant.
     * @param missatge Ordres que rebrà l'usuari abans d'introduïr el text
     * @param carFin Caràcter que determina el final de la introducció de text
     * @return El text introduït per l'usuari
     */
    public static String llegirLinies(String missatge, char carFin){
        Scanner ent = new Scanner(System.in);
        String text="";
        
        //Demanem a l'usuari la introducció del text
        System.out.println(missatge);
        do {         
            String linia=ent.nextLine().trim();
            
            //Concatenem la línia al text
            text=text+linia;
            
            //Mirem si és o no la última línia del text
            if(linia.endsWith(carFin+"")) break;
            else text+='\n';    //Si no és la última afegixo un salt de línia
        } while (true);
        
        return text;
        
    }
    
    /**
     * Mètode que retorna un vector d'enters que conté les posicions on apareix
     * la subcadena dins del text. Si no apareix retornem un vector de 0 caselles.
     * @param cadena Text on buscar la subcadena
     * @param subcadena Subcadena que buscar dins del text
     * @return Un vector d'enters amb les posicions on apareix subcadena dins de cadena
     */
    public static int[] buscaCadenaMultiple(String cadena, String subcadena){
        int cont=0, index=0, 
                i;    //l'índex del vector
        int[] resultat=null;
        
        //Compto quantes aparicions hi ha per poder declarar la dimensió del vector
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            cont++;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        //Instancio el vector en el número de caselles indicat per la variable cont
        resultat=new int[cont];
        
        //Torno a inicialitzar les variables
        index=0;
        i=0;    //inicialitzo a 0 per què omplirem el vector d'esquerra a dreta 
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            resultat[i++]=index;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        return resultat;
        
    }
    
    
    /**
     * Métode que ajunta els strings saltant-los per un enter introduït
     * i retorna els strings concatenats i la longitud d'aquests.
     * @param salts El número de salts que es fa a cadena per a concatenar els Strings
     * @param cadena Tots els Strings que s'hauran de saltejar per a juntar els que toquin
     * @return retorna els strings concatenats i la longitud d'aquests
     */
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
    

 
    
    
    
    
    
    
    
    
    
    
    
    
    
    



/*
public static int[] buscaCadenaMultiple(String text, String subcadena){
        int[] resultat;
        int cont=0, index=0, i=0;
        
        do{
            index=buscaCadena(text,subcadena,index);
            if(index==-1) break;
            cont++;
            //System.out.println(index);
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        resultat=new int[cont];
        index=0;
        do{
            index=buscaCadena(text,subcadena,index);
            if(index==-1) break;
            resultat[i++]=index;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        return resultat;
    
    
    }



*/
}
