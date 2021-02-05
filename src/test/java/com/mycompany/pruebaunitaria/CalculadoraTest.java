/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaunitaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumarNumeros method, of class Calculadora.
     */
    @Test
    public void testSumarNumeros() {
        int a=6;
        int b=4;
        
        Calculadora obj = new Calculadora();
        
        int resultado=obj.sumarNumeros(a, b);
        assertEquals(10,resultado);
    }
    
    @Test
    public void testRestarNumeros() {
        int a=8;
        int b=6;
        
        Calculadora calc = new Calculadora();
        
        int resultado=calc.restarNumeros(a, b);
        assertEquals(2, resultado);
    }
}
