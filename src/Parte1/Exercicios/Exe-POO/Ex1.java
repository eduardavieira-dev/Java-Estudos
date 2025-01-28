import java.util.Locale;
import java.util.Scanner;

class Rectangle{
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2*(width+height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
    }
}

public class Ex1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();
        
        System.out.print("Digite a largura e a altura do retangulo: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        
        System.out.println("Area: "+retangulo.area());
        System.out.println("Perimetro: "+retangulo.perimeter());
        System.out.println("Diagonal: "+retangulo.diagonal());
        
    }
    

    
}
