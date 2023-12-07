package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1, num2;

        int operacao;

        System.out.println("Digite o 1ª número:");
        num1 = input.nextFloat();
        System.out.println("Digite o 2ª número:");
        num2 = input.nextFloat();

        System.out.println("Operação:");
        operacao = input.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(String.format("%.1f", num1) + " + " + String.format("%.1f", num2) + " = " + String.format("%.1f", num1 + num2));
                break;
            case 2:
                System.out.println(String.format("%.1f", num1) + " - " + String.format("%.1f", num2) + " = " + String.format("%.1f", num1 - num2));
                break;
            case 3:
                System.out.println(String.format("%.1f", num1) + " * " + String.format("%.1f", num2) + " = " + String.format("%.1f", num1 * num2));
                break;
            case 4:
                System.out.println(String.format("%.1f", num1) + " / " + String.format("%.1f", num2) + " = " + String.format("%.1f", num1 / num2));
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }

}
