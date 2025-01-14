import java. util.Scanner;
import java.util.Locale;
public class HorasTrabalho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;
        double horas, valor, salario;

        System.out.print("Qual o número do funcionario? ");
        numero = sc.nextInt();        
        
        System.out.print("Quantas horas foram trabalhadas? ");
        horas = sc.nextDouble();
        
        
        System.out.print("Quanto voce recebe por hora? ");
        valor = sc.nextDouble();

        salario = horas*valor;
        
        System.out.println("Numero = "+numero);
        System.out.printf("Salario = R$%.2f",salario);

    }
}
