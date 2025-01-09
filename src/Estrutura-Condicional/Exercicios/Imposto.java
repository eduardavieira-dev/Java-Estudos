import java.util.Locale;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto = 0.0;
        
        
        System.out.print("Informe o valor da sua renda:");
        salario = sc.nextDouble();
        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario <= 4500.00) {
            // 8% sobre a parte que ultrapassar R$ 2000 até R$ 3000
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            // 8% sobre a parte que ultrapassar R$ 2000 até R$ 3000
            // 18% sobre a parte que ultrapassar R$ 3000 até R$ 4500
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        }

        sc.close(); 
    }
}
