import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas vezes quer calcular as notas: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe as 3 notas");
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("Media: %.1f%n", media);
		}
		
		sc.close();
	}
}