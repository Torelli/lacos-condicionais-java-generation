package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int codigo;
        double salario;

        System.out.println("Digite o nome do colaborador");
        nome = input.nextLine();
        System.out.println("Cargo");
        codigo = input.nextInt();
        System.out.println("Salário");
        salario = input.nextDouble();

        switch(codigo) {
            case 1:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Gerente\nSalário: R$ " + String.format("%.2f", salario + (0.1 * salario)));
                break;
            case 2:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Vendedor\nSalário: R$ " + String.format("%.2f",salario + (0.07 * salario)));
                break;
            case 3:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Supervisor\nSalário: R$ " + String.format("%.2f",salario + (0.09 * salario)));
                break;
            case 4:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Motorista\nSalário: R$ " + String.format("%.2f",salario + (0.06 * salario)));
                break;
            case 5:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Estoquista\nSalário: R$ " + String.format("%.2f",salario + (0.05 * salario)));
                break;
            case 6:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Técnico de TI\nSalário: R$ " + String.format("%.2f",salario + (0.08 * salario)));
                break;
            default:
                System.out.println("Código inválido!");
        }
    }

}
