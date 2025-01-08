// package Estrtura-Condicional.Condicoes;
import java.util.Scanner; 

public class Condicoes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if(hora > 6 && hora <12){
            System.out.println("Bom dia!");
        }else if(hora>=12 && hora < 18){
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Boa noite!");
        }
    }
    
}
