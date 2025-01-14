import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, f, duracao;

        System.out.print("Informe o horario de inicio e o horario de termino do jogo: ");
        i = sc.nextInt();
        f = sc.nextInt();

        if(f==i){
            duracao = 24;
        }else if(f>i){
            duracao = f-i;
        }
        else{
            // Se a hora final for menor que a hora inicial (passou da meia-noite)
            duracao = 24-i+f;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close(); 
    }
}
