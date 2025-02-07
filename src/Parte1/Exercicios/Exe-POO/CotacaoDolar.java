import java.util.Scanner;

class CurrencyConverter{
    public double price;
    public double qnt;
    
    
    public double amount(){
        double IOF = price * qnt * 0.06;
        return price * qnt + IOF;
    }
    
    
}

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CurrencyConverter Values = new CurrencyConverter();

        System.out.print("Whats is the Dollar price? ");
        Values.price = sc.nextDouble();
        
        
        
        System.out.print("How many dollar will be bought? ");
        Values.qnt = sc.nextDouble();


        System.out.printf("Amount to be paid in reais = %.2f ",Values.amount());
        
        sc.close();
    }
    
}
