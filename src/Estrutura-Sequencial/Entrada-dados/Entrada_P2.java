import java.util.Locale;
import java.util.Scanner;

public class Entrada_P2 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        // next line lê  a linha toda p/ evitar um bug, vc coloca um extra pra usar outro tipo como o nextInt
        x = sc.nextInt(); 
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
