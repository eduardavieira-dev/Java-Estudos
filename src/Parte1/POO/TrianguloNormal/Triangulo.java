package Parte1.POO.TrianguloNormal;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as dimensões do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as dimensões do triangulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        double p = (xA + xB + xC)/2.0;
        double areaX = Math.sqrt(p *(p - xA) * (p - xB) * (p -xC));
        
        p = (yA + yB + yC)/2.0;
        double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p -yC));
        
        System.out.printf("Area do triagulo X: %.4f%n", areaX);
        System.out.printf("Area do triagulo Y: %.4f%n", areaY);
        
        
        if(areaX > areaY){
            System.out.println("Maior area: X");
            
        }else{
            System.out.println("Maior area: Y");
        }
        
        sc.close();

    }
    
}
