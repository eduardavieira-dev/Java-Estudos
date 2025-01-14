import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, fatorial= 1;

        System.out.print("Digite um número para saber seu fatorial: ");
        x = sc.nextInt();

        for(int i=1; i<=x; i++){
            fatorial*=i;
        }      

        System.err.println("Fatorial: "+fatorial);
        
        sc.close();
    }
    
}
