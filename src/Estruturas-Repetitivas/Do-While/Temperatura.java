import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double f = 0; 
		double c = 0;

		char resp;
		
		
		do{
			System.out.println("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			
			f = 9.0*c/5.0+32.0;

			System.err.printf("Faherenheit: %.1f%n", f);
			
			System.out.println("Deseja repetir(s/n)? ");
			
			resp = sc.next().charAt(0);

		}while(resp !='n' );

		
		
		
		sc.close();
	}
}