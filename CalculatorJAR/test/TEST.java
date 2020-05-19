/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calculatorjar.CalculatorJAR;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leona
 */
public class TEST {
    
    public TEST() {
    }
    
    /**
     *
     * @return 
     */
    @Test
    public void  testsuma1(){
        double resultado = CalculatorJAR.suma(10, 23);
        double esperado = 33;
        assertEquals(esperado,resultado,0.5);
        
    }
    
    @Test
    public void  testsuma2(){
        double resultado2 = CalculatorJAR.suma(1177.0, 56.1);
        double esperado = 1233.1;
        assertEquals(esperado,resultado2,0.5);
        
    }
    @Test
    public void  testresta(){
        double resultado = CalculatorJAR.resta(10, 23);
        double esperado = -13.0;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  testresta2(){
        double resultado = CalculatorJAR.resta(55, 23);
        double esperado = 32;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  division(){
        double resultado = CalculatorJAR.division(75, 15);
        double esperado = 5;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  division2(){
        double resultado = CalculatorJAR.division(75.75, 15);
        double esperado = 5;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  multiplicacion(){
        double resultado = CalculatorJAR.multiplicacion(47, 5);
        double esperado = 235;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  multiplicacion2(){
        double resultado = CalculatorJAR.multiplicacion(7.2, 5.7);
        double esperado = 41.04;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  raiz(){
        double resultado = CalculatorJAR.raiz(4);
        double esperado = 2;
        assertEquals(esperado,resultado,0.5);
        
    }
    @Test
    public void  raiz2(){
        double resultado = CalculatorJAR.raiz(7.2);
        double esperado = 2.6832;
        assertEquals(esperado,resultado,0.5);
        
    }
}
