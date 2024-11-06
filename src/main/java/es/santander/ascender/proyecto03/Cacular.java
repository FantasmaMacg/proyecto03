package es.santander.ascender.proyecto03;

import java.util.Scanner;


public class Cacular 
{
    public static void main( String[] args )
    {
        Calculadora calculadora =  new Calculadora();
        
        Scanner scanneruno = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("marque numero o tabla a saber");
        
        int a = scanner.nextInt();
        System.out.println("marque numero");
        int b = scanner.nextInt();
        System.out.println("escriba inicial de operación");
        String llamar = scanneruno.next();
        
        
        long resultadosuma =calculadora.sumar(a, b);
        long resultadoresta =calculadora.restar(a, b);
        long resultadodividir =calculadora.dividir(a, b);
        long resultadomultiplicar =calculadora.multiplicar(a, b);
      
        if (llamar.equals("t")){
        calculadora.presentarTablaMultiplica(a);
        }
        if (llamar.equals("m")){
            System.out.println("resultado multiplicar "+resultadomultiplicar);
            scanner.close();
        }
        if (llamar.equals("d")){
            System.out.println("resultado dividir "+resultadodividir);
            scanner.close();
        }
        if (llamar.equals("r")){
            System.out.println("resultado resta "+resultadoresta);
            
        }
        if (llamar.equals("s")){
            System.out.println("resultado suma "+ resultadosuma);
           
        }   
        else{
            System.out.println("no hay operación valida");
        }
        scanner.close();   
        scanneruno.close();
    }
    
}
