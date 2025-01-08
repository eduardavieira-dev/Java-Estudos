import java. util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextInt();
        

        soma = n1 + n2;

        System.out.println("Soma = "+soma);

    }
}
