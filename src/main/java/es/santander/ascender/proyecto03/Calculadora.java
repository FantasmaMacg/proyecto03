package es.santander.ascender.proyecto03;

public class Calculadora {
   
    public long sumar(long sumando1 ,long sumando2){
        return  sumando1+sumando2;
    }
    public long restar(long subtraendo ,long minuendo){
        return subtraendo-minuendo;
    }
    public long dividir(long dividendo ,long divisor){
        return dividendo/divisor;
    }
    public long multiplicar(long factor1 ,long factor2){
        return factor1*factor2;
    }
    public void presentarTablaMultiplica(int numero)
    {
        for(int i = 0; i <= 10 ; i++) {
            System.out.println(i * numero);
            
        }
    }
    public int[] calcularTablaMultiplicar(int numero) {
        int[] resultados = new int[11];
        for (int i = 0; i <= 10; i++) {
            resultados[i] = i * numero;
        }
        return resultados;
    }
}
