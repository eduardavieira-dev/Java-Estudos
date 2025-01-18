package codewars;
import java.util.*;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

// Note: If the number is a multiple of both 3 and 5, only count it once.

public class Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int five=5, three=3, sum=0, num;

        System.out.println("Digite um numero para saber a soma dos numeros multiplos de 3 e de 5");
        
        num = sc.nextInt();
        
        for(int i= 1; i< num; i++){
            if(i% three == 0 || i% five==0){
                sum += i;
            }
            
        }
        System.out.println("Soma: "+sum);

    }
}
