import java.util.Locale;
import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double C=4.0, S=4.5, B=5.0, T=2.0, R=1.5;
        double qtd, total;
        int cod;

        System.out.print("Informe o codigo do item e em seguida a quantidade: ");
        cod = sc.nextInt();
        qtd = sc.nextDouble();

        if(cod==1){
            total = C * qtd;
            System.out.printf("Total: R$%.2f", total);
        }else if(cod==2){
            total = S * qtd;
            System.out.printf("Total: R$%.2f", total);
        }else if(cod==3){
            total = B * qtd;
            System.out.printf("Total: R$%.2f", total);
        }else if(cod==4){
            total = T * qtd;
            System.out.printf("Total: R$%.2f", total);
        }else if(cod==5){
            total = R * qtd;
            System.out.printf("Total: R$%.2f", total);
        }else{
            System.out.println("Codigo invalido");
        }

       
       

        sc.close(); 
    }
}
