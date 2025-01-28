import java.util.Locale;
import java.util.Scanner;

class Employee{
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double precent){
        this.grossSalary = grossSalary*(1+(precent/100));
    }

    public String toString() {
        return name
         + ", $ "
         + String.format("%.2f", netSalary());
    }


}

public class Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();
        
        System.out.println("Informe os dados do funciuonario: ");
        System.out.print("Nome: ");
        func.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        func.tax = sc.nextInt();


        System.out.println("\nFuncionario: "+ func.toString());
        System.out.print("Qual porcentagem deseja incrementar ao salario? ");
        double percent = sc.nextDouble();
        func.IncreaseSalary(percent);
        
        System.out.println("\nDados atualizados: "+ func.toString());
    }
    
}
