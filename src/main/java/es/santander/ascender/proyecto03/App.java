package es.santander.ascender.proyecto03;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 25;
        int b = 4;
        Calculadora calculadora =  new Calculadora();
        long resultadosuma =calculadora.sumar(a, b);
        long resultadoresta =calculadora.restar(a, b);
        long resultadodividir =calculadora.dividir(a, b);
        long resultadomultiplicar =calculadora.multiplicar(a, b);
        System.out.println("resultadosuma " + resultadosuma);
        System.out.println("resultadoresta "+resultadoresta);
        System.out.println("resultadodividir "+resultadodividir);
        System.out.println("resultadomultiplicar "+resultadomultiplicar);
        
    }
}
