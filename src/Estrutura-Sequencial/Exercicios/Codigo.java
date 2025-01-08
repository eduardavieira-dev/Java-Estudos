import java. util.Scanner;
import java.util.Locale;
public class Codigo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, num1, cod2, num2;
        double valor1, valor2, soma1, soma2, total;

        System.out.print("1-Qual o codigo da peça? ");
        cod1 = sc.nextInt();        
        
        System.out.print("1-Qual o numero de peças? ");
        num1 = sc.nextInt();
        
        System.out.print("1-Qual o valor unitario? ");
        valor1 = sc.nextDouble();

        soma1 = num1*valor1;

        System.out.print("2-Qual o codigo da peça? ");
        cod2 = sc.nextInt();        
        
        System.out.print("2-Qual o numero de peças? ");
        num2 = sc.nextInt();
        
        System.out.print("2-Qual o valor unitario? ");
        valor2 = sc.nextDouble();

        soma2 = num2*valor2;

        total= soma1+soma2;
 
        
        System.out.printf("Valor a pagar = R$%.2f",total);

    }
}
