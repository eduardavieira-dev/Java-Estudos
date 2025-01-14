import java.util.Locale;
import java.util.Scanner;

public class Entrada_P1 {
    public static void main(String[] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String x;
    char c;
    int y;
    double d;

    System.out.println("Informe seu nome, idade, altura e genero: ");
    x = sc.next(); 
    y = sc.nextInt(); 
    d = sc.nextDouble(); 
    c = sc.next().charAt(0);

    System.out.println("Nome: " + x);
    System.out.printf("Idade: %d, %nAltura: %.2f,  %nSexo: %c", y, d, c);

    sc.close();
    }
}
