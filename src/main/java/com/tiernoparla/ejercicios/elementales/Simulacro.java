
package com.tiernoparla.ejercicios.elementales;

    import java.util.*;

public class Simulacro {
    
    public static void main(String[] args) {
        
        int[] posicion = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] jugador = {"ordenador", "usuario"};
        char[] casilla = {'O', 'U'} ;
        
        for (int i = 0; i < posicion.length; i++) {
        System.out.print(posicion[i]);
    }
        
        System.out.println("");
        
        System.out.println("Ordenador = O  || Usuario = U");
        System.out.println("Siempre empieza por:" + jugador[1]);
        
        Scanner sca = new Scanner(System.in);
        
        System.out.println("introduce tu ficha: ");
    
        String fichas = sca.next();

        System.out.println("casilla que puesto es: " + fichas);
         
        
        
        
        
        
        
        
        
        
    } //main
} //Simulacro
