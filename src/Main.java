
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     System.out.println(" Informe o nome do funcionário 1: ");
     String nomeFuncionario1 = scanner.next();
     Funcionario funcionario1 = new Funcionario(nomeFuncionario1);

     System.out.println(" Informe o nome do funcionário 2: ");
     String nomeFuncionario2 = scanner.next();
     Funcionario funcionario2 = new Funcionario(nomeFuncionario2);
     scanner.nextLine();

     System.out.println("Informe o nome do Cargo");
     String nomeCargo = scanner.nextLine();

     System.out.println("Informe o salário base do cargo");
     double salarioBase = scanner.nextDouble();


     System.out.println("Informe os benefícios do cargo");
     String beneficiosCargo = scanner.nextLine();

     Cargo cargo = new Cargo(nomeCargo, salarioBase, beneficiosCargo);

     funcionario1.atribuirCargo(cargo);

     System.out.println("Informe o numero de horas trabalhadas pelo funcionario 1: ");
     int horasTrabalhadas1 = scanner.nextInt();
     funcionario1.registrarHorasTrabalho(horasTrabalhadas1);

     funcionario1.calcularSalario();

     System.out.println("Informe o numero de horas trabalhadas pelo funcionario 2: ");
     int horasTrabalhadas2 = scanner.nextInt();
     funcionario2.registrarHorasTrabalho(horasTrabalhadas2);

     funcionario2.atribuirCargo(cargo);
     funcionario2.calcularSalario();
    }
}