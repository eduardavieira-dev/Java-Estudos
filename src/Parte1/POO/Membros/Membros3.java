package Parte1.POO.Membros;

import java.util.Locale;
import java.util.Scanner;

class Calculator{
    public static final double PI = 3.14158;

    //usar o static faz com que o objeto nao precise instaciar o objeto para depois chamar a operção a partir do objeto, ou seja, vc pode colocar a classe diretamente
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius) {
        return 4.0 * PI * radius*radius*radius/3.0;
    }

}

public class Membros3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator.PI);


        sc.close();
    }

   
    
}
