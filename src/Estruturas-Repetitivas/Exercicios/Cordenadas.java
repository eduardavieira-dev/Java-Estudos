import java.util.Scanner;
public class Cordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite os pontos de X e Y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while( x != 0 && y != 0 ){

            if(x>0 && y>0){
                System.out.println("Q1");
            }else if(x<0 && y>0){
                System.out.println("Q2");
            }else if(x<0 && y<0){
                System.out.println("Q3");
            }else{
                System.out.println("Q4");
            } 

        x = sc.nextInt();
        y = sc.nextInt();

        }
        
        
        sc.close();
    }
    
}
