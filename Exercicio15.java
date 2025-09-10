import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        double horasPorDia = 8;
        double valorPorHora = 25.00;


        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        double salarioTotal = diasTrabalhados * horasPorDia * valorPorHora;


        System.out.printf("O salário do funcionário por " + diasTrabalhados + " dias trabalhados é de R$%.2f\n", salarioTotal);

        scanner.close();
    }
}
