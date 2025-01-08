// package Matematica;

import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        
        double a, b, c;
        double delta;
        double x1, x2;

        //teste com a = 1, b = -5, c = 6

        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
         a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
         b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
         c = sc.nextDouble();

         delta = Math.pow(b, 2) - 4 * a * c;

         if (delta < 0) {
          
            System.out.println("Não existem soluções reais para delta negativo");
            
            
        } else {
            
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As soluções são reais.");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }

        // Fechando o scanner
        sc.close();
        
    }
}
