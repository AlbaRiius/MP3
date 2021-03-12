/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Escacs {


    /**
     * Métode que fa que l'usuari introduixque una descripció d'una casella del tablero d'escacs segons el reconeixedor d'imatges
     * i rebrà el nom de la casella utilitzant la notació algebràica dels escacs.
     * Segons el reconeixedor d'imatges (l'entrada) la notació és un primer número en la fila i un segon en la columna. Els dos estan entre 1 i 8.
     * La notació algebràica d'escacs (la sortida) esta composta per una lletra que és la columna i un número (entre 1 i 8) que és la fila.
     * He hagut de fer que el métode retornes alguna cosa perquè sinó el bucle de l'exercici no em parava mai i hagues hagut de posar el métode elementFinal()
     * aqui a la biblioteca i no considero que pugui ser útil per a fer més problemes sobre escacs.
     * @return 0 quan entra el cas de parada (0 0) i 1 quan l'usuari entra una notació
     */
    public static int tractarElement() {

        //Inicialitzar variables
        Scanner ent = new Scanner(System.in);
        String introduccio = ent.nextLine();
        char fila1, columna1, fila2, columna2;
        fila1 = introduccio.charAt(0);
        columna1 = introduccio.charAt(2);
        char[] lletres = new char[]{'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

        if (fila1 == '0' && columna1 == '0') {
            return 0;
        }

        fila2 = columna1;
        columna2 = lletres[fila1 - 49];

        System.out.format("%s%s%n", columna2, fila2);
        return 1;

    }
}
