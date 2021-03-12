/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import static metodes.Data.dataCorrecta;
import static metodes.Data.diaSeguent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class DataTest {
    ?
    
    
    @Test
    public void testDiaSeguent(){
        assertArrayEquals(new int[]{04,03,2021}, diaSeguent(03,03,2021));
    }
}
