/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static nhan.util.MathUtil.computeFactorial;

/**
 *
 * @author ASUS
 */
public class MathUtilTest {
    @Test
    
    public void testSucessesfulCases(){
        assertEquals(120, computeFactorial(5));
        assertEquals(5040, computeFactorial(7));
        assertEquals(1,computeFactorial(1));
        assertEquals(1, computeFactorial(0));
        assertEquals(2, computeFactorial(2));
// t ki vong co 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
        //assertEquals(-5, this);
    }
    
}
