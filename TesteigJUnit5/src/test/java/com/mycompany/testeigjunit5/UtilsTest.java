/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeigjunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumne
 */
public class UtilsTest {
    
    public UtilsTest() {
    }

    @Test
    public void testJuntaSaltejats() {
        System.out.println("juntaSaltejats");
        int salts = 0;
        String[] cadena = null;
        String expResult = "";
        String result = Utils.juntaSaltejats(salts, cadena);
        assertEquals("0", Utils.juntaSaltejats(-25));
        assertEquals("0", Utils.juntaSaltejats(3));
        assertEquals("0", Utils.juntaSaltejats(0,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("29:La teua resposta no és la correcta.", Utils.juntaSaltejats(1,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("21:La resposta és correcta.", Utils.juntaSaltejats(2,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("13:La no correcta.", Utils.juntaSaltejats(3,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("4:La és ", Utils.juntaSaltejats(4,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("4:La la ", Utils.juntaSaltejats(5,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("11:La correcta.", Utils.juntaSaltejats(6,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("2:La ", Utils.juntaSaltejats(7,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("2:La ", Utils.juntaSaltejats(8,"La ","teua ","resposta ","no ","és ","la ","correcta."));
    }
    
}
