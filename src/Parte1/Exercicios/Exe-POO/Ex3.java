import java.util.Locale;
import java.util.Scanner;

class Aluno{

    String nome;
    double n1,n2,n3;

    public double total(){
        return n1+n2+n3;
    }

    public double faltantes() {
        return 60 - total();  
    }
    
}

public class Ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        
        System.out.println("Informe o nome e as 3 notas do aluno: ");
        aluno.nome = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();
        
        
        double total = aluno.total();
        System.out.printf("\nTotal das notas: %.2f%n", total);
        
        if (total >= 60) {
            System.out.println("Passou");
        } else {
            System.out.printf("Não passou. Faltaram %.0f pontos.%n", aluno.faltantes());
        }
       
    }
    
}
