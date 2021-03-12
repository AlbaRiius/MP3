/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;
import static metodes.Escacs.tractarElement;

/**
 *
 * @author alumne
 */
public class Practica3 {
    
    //Declaració de variables globals
    static char fila1, columna1;
    
    
    
    public static void main(String[] args) {
        //Utilitzo l'esquema de recorregut ja que el programa ha de tractar tots els elements, des del primer fins a l'últim,
        //sense possibilitat de parar en algun cas especial. No tracto el primer element diferent ja que en tots els casos he
        //de fer el mateix excepte en el cas de parada.
        
        do{
        tractarElement();
        } while(tractarElement()!=0);

        
    }

    //Al posar el mètode a la biblioteca he hagut de fer alguns canvis, per demostrar que sabia fer l'esquema de recorregut deixo la resposta comentada:

//       do{
//        tractarElement();
//        } while(!elementFinal());    
    
//    private static void tractarElement() {
//        //Inicialitzar variablesç
//        Scanner ent = new Scanner(System.in);
//        String introduccio=ent.nextLine();
//        fila1=introduccio.charAt(0);
//        columna1=introduccio.charAt(2);
//        char fila2, columna2;
//        char[] lletres=new char []{'h','g','f','e','d','c','b','a'};
//        
//        
//        if(elementFinal()) return;
//        
//        fila2=columna1;
//        columna2=lletres[fila1-49];
//        
//        System.out.format("%s%s%n",columna2, fila2);
//        
//        
//    }
//
//    private static boolean elementFinal() {
//        return fila1 == '0' && columna1 == '0';
//    }


}
