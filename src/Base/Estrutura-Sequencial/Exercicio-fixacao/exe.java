import java.util.Locale;
public class exe {
    public static void main(String[] args) {
        

        String product1 ="Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
        System.out.printf("%s, wich price is $ %.2f%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c cd%n",age, code, gender);

        System.out.println("Measue eith eight decimal places: "+ measure);
        System.out.printf("Rouded (theree decimal places): %.3f %n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f%n", measure);

    }
}
