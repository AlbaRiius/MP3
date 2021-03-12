/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 * Mètodes utilitzats en els projectes de m3 sobre vectors.
 * Per exemple: incrementar les caselles d'un vector, omplir vectors amb paràmetres...
 * @author alumne: Alba Rius
 */
public class Vector {
    
      /**
       * Rep un número variable de paràmetres formals de tipo real (float) i 
       * els transforma en vector. Si no es passa cap parametre retorna null.
       * @param valors Els paràmetres que s'han de posar al vector
       * @return Un vector amb els paràmetres
       */
      public static float[] ompleVectorFloats(float... valors){
        //Casos especials
        if(valors==null || valors.length==0) 
            return null; //Casos en que hem rebut null o no hem rebut paràmetre 
                         //o hem rebut un vector buit  

        //Versió llarga                 
//        float[] resultat=new float[valors.length];
//        for (int i = 0; i < resultat.length; i++) {
//            resultat[i]=valors[i];
//        }
                         
//        return resultat;
        
        //Versió curta
        return valors;
    
    }
    
    /**
     * Borra d'un vector totes aquelles caselles que contenen números
     * que no són múltiples del número passat com a paràmetre, deixant a  les primeres
     * posicions del vector aquells que sí ho siguin. Les posicions no ocupades del 
     * vector contenen un -1.
     * @param v vector que conté enters i al final tindrà només els múltiples de num
     * @param num número que ha de ser múltiple dels paràmetres de v
     */
    public static void eliminaNoMultiples(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return;
        
        int i=0, iM=0;
    
        while(i<v.length){
            if(v[i]%num==0){
                v[iM]=v[i];
                if(i!=iM) v[i]=-1;
                iM++;
            }else v[i]=-1;
            i++;
        }
    
    }
    
    /** 
     * Crea un vector que té a les caselles els números de v múltiples de num.
     * Les posicions no ocupades del vector contenen un -1.  
     * @param v vector que conté enters i al final tindrà només els múltiples de num
     * @param num número que ha de ser múltiple dels paràmetres de v
     * @return Un vector emplenat amb els enters de v múltiples de num
     */
    public static int[] eliminaNoMultiplesV2(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return v;
        
        //Declaració de variables
        int i=0, iM=0;
        int[] res=new int[v.length]; //vector del mateix tipo i llargada que v
    
        while(i<v.length){
            if(v[i]%num==0){
                res[iM]=v[i];
                if(i!=iM) res[i]=-1;
                iM++;
            }else res[i]=-1;
            i++;
        }
        
        return res;
    
    }
    //Retorna un vector idèntic al rebut com a paràmetre però en les caselles
    //incrementades en la quantitat indicada pel paràmetre enter. Atenció, el 
    //vector paràmetre NO se modificarà!! Si el vector paràmetre és null 
    //retornarem null
    
    /**
     * Incrementa les caselles d'un vector en la quantitat indicada pel paràmetre enter, si el parametre
     * booleà és cert els canvis es realitzaran sobre el vector passat com a paràmetre, i el mètode retornarà 
     * null, si és fals no modifica el vector rebut per paràmetre sinó que crea un altre d'igual longitud on 
     * fa l'operació de suma i retornarà este altre vector en les modificacions. 
     * Si el vector paràmetre és null retorna null.
     * @param vector Vector que conté els enters a incrementar
     * @param quantitat Quantitat que s'ha de sumar a les caselles del vector
     * @param canvis Indica si hem de mosificar el vector (true) o crear-ne un de nou(false)
     * @return Un vector d'enters en la quantitat indicada pel paràmetre augmentada a les caselles
     */
    public static int[] operaVector(int[] vector, int quantitat, boolean canvis) {
        //Declaració de variables del mètode operaVector
        int[] resultat;

        if (vector != null) {
            if (canvis) {
                for (int i = 0; i < vector.length; i++) {
                    vector[i] += quantitat;
                }
                return null;
            } else {

                //Creo un vector de la mateixa llargada que el rebut per paràmetre
                resultat = new int[vector.length];
                for (int i = 0; i < resultat.length; i++) {
                    resultat[i] = vector[i] + quantitat;
                }

                return resultat;
            }
        }
        return null;

    }
    
   
}
