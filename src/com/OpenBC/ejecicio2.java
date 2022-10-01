package com.OpenBC;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ejecicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir precio");
        double a = leer.nextDouble();
        System.out.println("El precio con IVA es:");
        DecimalFormat b = new DecimalFormat("#.##");
        System.out.println(Double.valueOf(b.format(precio(a))));;
    }
    public static double precio(double a){
        a = a + (a*21/100);
        return a;

    }
}



