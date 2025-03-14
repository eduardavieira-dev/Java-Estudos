package Parte1.POO.TrianguloClasse;

import java.util.Locale;
import java.util.Scanner;

 
class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double area(){
        
        double p = (a + b + c)/ 2.0;
        return Math.sqrt(p * (p - a)*(p - b)*(p - c));
       
    }
    
}

public class Triangulo {
    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as dimensões do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as dimensões do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
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
