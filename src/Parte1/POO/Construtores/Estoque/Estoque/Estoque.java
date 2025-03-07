package Parte1.POO.Construtores.Estoque.Estoque;

import java.util.Locale;
import java.util.Scanner;

class Produto{

    public String name;
    public double price;
    public int qnt;

    public Produto(String name,double price, int qnt ){
        this.name = name;
        this.price = price;
        this.qnt = qnt;
    }

    public double totalValue(){
        return price * qnt;
    }

    public void addProducts(int qnt){
        this.qnt += qnt;
    }

    public void removeProducts(int qnt){
        this.qnt -= qnt;
    }

    public String toString() {
        return name
         + ", $ "
         + String.format("%.2f", price)
        //  + price
         + ", "
         + qnt
         + " unidades, Total: $ "
         + String.format("%.2f", totalValue());
    }
}


public class Estoque {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade: ");
        int qnt = sc.nextInt();

        Produto product = new Produto(name, price, qnt);
        
        System.out.println("\nDados do produto: "+ product.toString());
        
        System.out.print("Informe quantos produtos foram adicionados: ");
        qnt = sc.nextInt();
        product.addProducts(qnt);
        System.out.println("\n Atualização do produto: "+ product.toString());
        
        
        System.out.print("Informe quantos produtos foram removidos: ");
        qnt = sc.nextInt();
        product.removeProducts(qnt);
        System.out.println("\n Atualização do produto: "+ product.toString());


        sc.close();
    }
    
}
