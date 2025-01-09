import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite 2 números para saber se são multiplos: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            if (a % b == 0) {
               System.out.println("São Multiplos");
            } else {
               System.out.println("Não são multiplos");
            }
         } else {
               if (b % a == 0) {
               System.out.println("São Multiplos");
               } else {
                   System.out.println("Não são multiplos");
               }
         }
         sc.close();
   
      }
}
