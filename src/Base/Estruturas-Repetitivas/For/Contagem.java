import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        System.out.println("Informe um número para fazer a contagem normal e a contagem regressiva: ");
        int n = sc.nextInt();
        
        System.out.println("Contagem Normal: ");
        for(int i=0; i<n; i++){
            System.out.println(i+1);
        }
        System.out.println("Contagem Regressiva: ");
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    
        
        sc.close();
    }
    
}
