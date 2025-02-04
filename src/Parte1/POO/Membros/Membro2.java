package Parte1.POO.Membros;

import java.util.Locale;
import java.util.Scanner;

class Calculator{
    public final double PI = 3.14158;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public double volume(double radius) {
        return 4.0 * PI * radius*radius*radius/3.0;
    }

}

public class Membro2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //instanciando objetos
        Calculator calc = new Calculator();


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", calc.PI);


        sc.close();
    }

   
    
}
