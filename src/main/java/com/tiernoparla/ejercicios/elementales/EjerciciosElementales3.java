
package com.tiernoparla.ejercicios.elementales;

import java.util.Random;

public class EjerciciosElementales3 {
    
    public static void main(String[] args) {
        
        // coger nums hasta cierto numero
        final int COTA = 10;
        final int TRES = 3;
        final int CINCO = 5;
        
        int suma = sumarMultiplos(COTA, TRES, CINCO);
        
        
        System.out.println(suma);
        
    } //main

    public static int sumarMultiplos(final int COTA, final int NUM1,
            final int NUM2) {
        // sumarlos
        
        int suma = 0;
        
        for (int i = 1; i < COTA; i++) {
            if (esMultiploDe(i, NUM1) || esMultiploDe(i, NUM2)){
                suma += i;
            }
        }
        return suma;
    } //SUMAR

    public static boolean esMultiploDe(int num, final int NUMERO) {
        // coger multiplos de 3 o 5
            return num % NUMERO == 0;
        }
    
    
    
} // EjerciciosElementales3
