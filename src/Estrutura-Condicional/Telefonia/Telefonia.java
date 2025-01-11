import java.util.Scanner;

public class Telefonia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de minutos: ");
    
        int minutos = sc.nextInt();
    
        double conta = 50.0;
    
        if(minutos>100){
            conta+=(minutos-100)*2.0;
        }
    
        System.out.printf("Valor da conta: R$%.2f", conta);
        sc.close();

    }
    
}
