/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.project1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s11199835
 */
public class testingTest {
    
    public testingTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }
    
  
    /**
     * Test of AddEm method, of class testing.
     */
    @org.junit.Test
    public void testAddEm() {
        System.out.println("AddEm");
        int a = 2;
        int b = 3;
        testing instance = new testing();
        int expResult = 5;
        int result = instance.AddEm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SubEm method, of class testing.
     */
    @org.junit.Test
    public void testSubEm() {
        System.out.println("SubEm");
        int a = 2;
        int b = 3;
        testing instance = new testing();
        int expResult = -1;
        int result = instance.SubEm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divEm method, of class testing.
     */
    @org.junit.Test
    public void testDivEm() {
        System.out.println("divEm");
        int a = 6;
        int b = 3;
        testing instance = new testing();
        float expResult = 2F;
        float result = instance.divEm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
