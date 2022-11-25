
package com.tiernoparla.ejercicios.elementales;

    import java.util.*;

public class EjeciciosElementales4 {
    public static void main(String[] args){
        
        // calcular terminos de Fib
        final int HASTA = 10;
        int X1 = 1;
        int X2 = 2;
        
        int fib_hasta = calculaFibHasta(HASTA, X2, X1);
        
        System.out.println(fib_hasta);
        
        // que no pasen de 4M
        //sumar los pares
        
    } // main
    
    public static int calculaFibHasta(final int HASTA,int X2, int X1) {
        int tmp = 0;
    
        for(int i = 0; i < HASTA; i++) {
            tmp = X2 + X1;
            X1 = X2;
            X2 = tmp;
        } //for
        return tmp;
    } //calculaFibHasta
        
    
    
    
    
    
    
} //EjerciciosElementales4
