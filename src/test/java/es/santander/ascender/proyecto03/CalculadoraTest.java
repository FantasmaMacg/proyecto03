package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora sut = new Calculadora();
    @Test
    public void testSumar(){
      
        assertTrue(sut.sumar(4, 3) == 7);
    }
    @Test
    public void testRestar(){
        
        assertTrue(sut.restar(4, 3) == 1);
    }
    @Test
    public void testDividir(){
        try{
        long resultadodividir = sut.dividir(20,0);
        assertEquals(056565,resultadodividir); 
        assertTrue(sut.dividir(4, 10) == 2);
        fail("no");
        }catch(Exception e){
            System.out.println(e);

        }
    }
    @Test
    public void testMultiplicar(){
        
        assertTrue(sut.multiplicar(4, 3) == 12);
    }
    @Test
    public void testTotal(){
        
        assertTrue(sut.dividir(2, 1)==2);
        assertTrue(sut.multiplicar(2, 4)== 8);
        assertTrue(sut.restar(8, 4)==4);
        assertTrue(sut.sumar(9, 2)==11);
        long resultadoresta = sut.restar(14,4);
        long resultadodividir = sut.dividir(20,5);
        long resultadosuma = sut.sumar(10,4);
        long resultadomultiplicar = sut.multiplicar(10,4);
        assertEquals(10 ,resultadoresta);
        assertEquals(4 ,resultadodividir);
        assertEquals(14 ,resultadosuma);
        assertEquals(40 ,resultadomultiplicar);
    }

    @Test
    public void testMegaTotal(){
     testSumar();  
     testRestar();          
     testMultiplicar();         
     testDividir(); 
     testTotal();
    }
    @Test
    public void testPresentarTabla(){
        
        sut.presentarTablaMultiplica(5);
    }

}