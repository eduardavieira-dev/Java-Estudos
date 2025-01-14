import java. util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.print("Digite o valor de A:");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor de B:");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor de C:");
        c = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor de D:");
        d = sc.nextInt();
        
        diferenca = (a*b-c*d);
        
        System.out.print("Diferença = "+diferenca);

        
    }
}
