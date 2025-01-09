import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número para saber se ele é par ou ímpar: ");
        num = sc.nextInt();

        if(num%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

        sc.close(); 
    }
}
