public class ExpressaoTernaria {
    public static void main(String[] args) {
        

        //Sintaxe:
        //( condição ) ? valor_se_verdadeiro : valor_se_falso

        // ( 2 > 4 ) ? 50 : 80  -> 80
        // ( 10 != 3 ) ? "Maria" : "Alex"  -> "Maria"

        double preco = 34.5;
        
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
        
        System.out.println(desconto);

        // double desconto;

        // if(preco<20.0){
        //     desconto = preco *0.1;
        // }else{
        //     desconto = preco*0.5;
        // }





    }
    
}
