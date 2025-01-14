import java.util.Scanner;
public class Negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um número para saber se ele é positivo ou negativo: ");
        num = sc.nextInt();

        if(num>0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        sc.close(); 
    }
}
