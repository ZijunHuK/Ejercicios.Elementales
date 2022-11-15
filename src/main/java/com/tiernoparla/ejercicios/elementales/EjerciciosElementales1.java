
package com.tiernoparla.ejercicios.elementales;

import java.util.Scanner;
    import java.lang.Math;

public class EjerciciosElementales1 {
    
    public static boolean prob(double prob){
        return Math.random() < prob;
    }
    
    public static void main(String[] args) {
        
        int count = 0;
        for(int i = 0; i < 9999; i++){
            if(prob(0.5)){count++;}
        }
        System.out.println(count);
        /*
        final int num = 32;
        final int n = 16;
        int counter = 0;
        int tmp = num;
        
        while(tmp != 1)
            
            if(tmp % n == 0){
                counter++;
                tmp /= n;
            } else {
                break;
            }
        */
        
        /*
        int ano = 2022;
        if(ano % 4 != 0){
            System.out.println("El año " + ano + "no es bisiesto");
        } 
        else if (ano % 100 != 0) {
            System.out.println("El año"+ ano + "si es bisiesto");
        } 
        else if (ano % 400 != 0) {
            System.out.println("El año" + ano + "no es bisiesto");
        } 
        else {
            System.out.println("El año" + ano + "si es bisiesto");
        }
        */
        
        /*
        int anos = 7;
        double money = 100;
        double interes = 5;
        
        for(int i = 1; i<= anos; i++) {
            money = money + money
        }
        */
        /*
        int dinero = 100;
        int b = dinero + dinero*5/100;
        int c = b + b*5/100;
        System.out.println(c);
        */
        
        /*
        int a = 12345;
        int b = a/10; //1234
        int c = b/10; //123
        int d = c/10; //12
        int e = d/10; //1
        
        int f = a%10;
        System.out.println(f);
        */
        
        /*
        String name = "salimos a la cuatro";
        name = name.trim();
        String[] palabras = name.split("\\s+");
        System.out.println("palabras.length");
        */
        
        /*
        String name = "safsdfasdf";
        int counter = 0;
        
        
        for(char c: name.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter++;
            }
        }
        */
        
        /*
        //contar vocales en una string
        String name = "abcde";
        int contar = 0;
        
        for(int i = 0; i < name.length(); i++) {
            char char_de_ahora = name.charAt(i);
            if(char_de_ahora == 'a' || char_de_ahora == 'e' || char_de_ahora == 
                    'i' || char_de_ahora == 'o' || char_de_ahora == 'u'){
                contar++;
            } 
        }
        */
        
        /*
        //Métofo que diga el caracter de en medio de una string.
        String str = "abcd";
        String output;
        
        //if long % 2 == 0 --> sacar 2 letras de enmedio
        if ((str.length() % 2) == 0) {
            output = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        } //if
        //else --> sacar la única del medio
        output = String.valueOf(str.charAt(str.length() / 2));
        
        System.out.println(output);
        */
        
        /*
        String name = "abcde";
        System.out.println("la letra del medio es: "
                + name.charAt(name.length()/2));
        */
        
        
        /*
        //Hacer medias
        double[] nums = {1,2,3,4};
        double media;
        double suma = 0;
        for (int i = 0; i < nums.length; i++){
            suma += nums[i];
        } //for
        media = suma / nums.length;
        for (int i=0; i<nums.length; i++) {
            
        } //for
        System.out.println("La media es:" + media);
        */
        
        
        /*
        //Datos N números, cual es el menor/mayor de todos
        double[] nums = {2.2, 3.3, 4.445, -5645, -5, 0};
        double min = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            else {
                // nada
                min = min;
            } //if else
        } //for
        
        System.out.println(min);
        */
        
        /*
        double a = -55.4321;
        double b = -43.2131;
        double min;
        
        if(a > b){
            min = b;
        } //if
        else {
            min = a;
        } //else
        System.out.println("el minimo es: " + min);
        */
        
        /*
        // sacar las 4 cifras de un num de 4 cifras
        // Y si el número de cifras no lo se???
        int N = 123456;
        
        int tmp = N;
        int cifra;
        int reverso = 0;
        
        while(tmp > 0){
            cifra = tmp % 10;
            reverso = reverso*10 + cifra;
            tmp = tmp/10;
        } //while
        System.out.println(reverso);
        */
        
        /*
        int N = 31572;
        int tam = 5;
        int tmp = N;
        
        //int cifra;
        int[] cifras = new int[tam];
        
        for(int i = 0; i < tam; i++){
            cifras[i] = tmp % 10;
            //System.out.println(cifras[1]);
            tmp = tmp/10;
        } //for
        
        //recuperar el número
        
        double x = 0;
        for(int i = 0; i < tam; i++){
            x = x + cifras[i]*Math.pow(10,tam-(i+1));
        } //for
        
        //double x = cifras[0]*Math.pow(10,tam-1) + cifras[1]*Math.pow(10,tam-2) + cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.
        System.out.println((int)x == N);
        */
        
        
        /*
        System.out.println(N%10); //primera cifra
        System.out.println((N/10)%10); //segunda cifra
        System.out.println(((N/10)/10)%10); // tercera cifra
        System.out.println((((N/10)/10)/10)%10); // cuarta cifra
        */
        
        /*
        //calcular termino N de fibonacci con arrays en vez de x1, x2 y Fib
        int[] Fib = {1,1,0};
        int N = 6;
        for(int i=3; i<=N; i++){
            Fib[2] = Fib[1] + Fib[0];
            Fib[0] = Fib[1];
            Fib[1] = Fib[2];
        } //for
        System.out.println(Fib[2]);
        */
        
        // 1º declaro array de tamaño 3 de int {x1, x2, Fib}
        // 2º inicializo el array con {x1 = 1, x2 = 1, Fib = 0}
        // 3º hago el for -->pero donde estaba Fib ahora está ARR[2], donde estaba x1, está ARR[0], etc
        
        /*
        //calcular y guardar todos los terminos de fibonacci hasta el N
        //tengo N
        int N = 8;
        //defino un array de tamaño N
        int[] Fib = new int[N];
        // guardo los 2 primeros terminos
        Fib[0] = 1;
        Fib[1] = 1;
        // loop para calcular y guardar los siguientes hasta N <--
        for(int i = 2; i <= N; i++){
            Fib[i] = Fib[i-1] + Fib[i-2];
        } //for
        
        Fib[2] = Fib[2-1] + Fib[2-2];
        Fib[3] = Fib[2-1] + Fib[3-2];
        
        for(int i = 0; i < Fib.length; i++){
            System.out.println(Fib[i]);
        } //for
        */    
            
            
        /*
        String[] palabras = {"hola", "adios"};
        
        String[] palabras2 = new String[23];
        
        System.out.println(palabras2[0]);
        
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        
        palabras[0] = "algo aquí";
        
        System.out.println(palabras[0]);
        
        for(int i = 0; i < palabras.length; i++){
            System.out.println(i);
        } //for
        */
        
        
        
        /*
        // termino N de la sucesión de Fibonacci
        int N = 15;
        int x1 = 1;
        int x2 = 1;
        
        int Fib = 0;
        
        for(int i = 3; i <= N; i++){
            Fib = x2 + x1;
            x1 = x2;
            x2 = Fib;
        } //for
        
        System.out.println(Fib);
        */
        
        
        /*
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Dame un número entero: ");
        N = sc.nextInt();
        System.out.println("El número que me has dado es: " + N);
        */
        
        /*
        int N = 45;
        int D = 12;
        
        int R = N;
        int Q = 0;
        
        while(R > D){
            System.out.println(R);
            R = R -D;
            System.out.println(R);
            Q++;
            
        } //while
        System.out.println(N == D*Q+R);
        */
        
        
        /*
        int n=1;
        while(n < 11){
            if(n%2==0){
                System.out.println(n);
            } //if
            n++;
        } //while
        */
        
        
        /*
        int a = 5;
        int b = 6;
        if (a>b) {
            System.out.println("era true");
        }//if
        */
        
        
        /*
        // printear nums pares del 1 al 10  
        for(int i = 2; i < 11; i = i+2){
            System.out.println(i);
        } //for
        */
        
        
        
                
        
    } //main
} //ejercicioElementales