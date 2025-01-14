// package Variaveis;

import java.util.Locale;

public class Variaveis{

    public static void main(String[]args){
        int y = 25;
        double x = 10.35784;

        System.out.print("Hello World ");
        System.out.println("Olá Mundo");

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        
        System.out.println("Resultado "+ x + " metros");

        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Mary";
        int idade = 48;
        double renda = 3000.0;
        
        System.out.printf("%s tem %d anos e ganha %.2f reais", nome, idade, renda);
    }

}