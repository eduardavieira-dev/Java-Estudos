import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

        
        System.out.println("Digite: \n1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim ");
        int tipo = sc.nextInt();
        
    

        while(tipo<1 && tipo>4){
            System.out.println("Digite novamente: ");
        }
       
        while(tipo<1 && tipo>4){
            System.out.println("Digite novamente: ");
        }

        while( tipo != 4 ){
            if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}   
            
            System.out.println("Digite: \n1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim ");

            tipo = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
        
        
        sc.close();
    }
    
}
