import java.util.Locale;
import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;
        double tri, cir, tra, qua, ret;

        System.out.println("Insira o valor de A: ");
        a = sc.nextDouble(); 
        System.out.println("Insira o valor de B: ");
        b = sc.nextDouble(); 
        System.out.println("Insira o valor de C: ");
        c = sc.nextDouble();

        tri = (a * c) / 2.0;
        cir = pi * Math.pow(c, 2);
        tra = ((a + b) * c) / 2.0;
        qua = Math.pow(b, 2.0);
        ret = a * b;

       
        System.out.printf("Triangulo: %.3f%n", tri);
        System.out.printf("Circulo: %.3f%n", cir);
        System.out.printf("Trapezio: %.3f%n", tra);
        System.out.printf("Quadrado: %.3f%n", qua);
        System.out.printf("Retangulo: %.3f%n", ret);

        sc.close();  
    }
}
