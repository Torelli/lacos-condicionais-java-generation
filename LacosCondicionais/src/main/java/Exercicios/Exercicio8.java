package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float saldo = 1000;

        float valor;

        int codigo;

        System.out.println("Operação: ");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Operação - Saldo\nSaldo: R$ " + String.format("%.2f",saldo));
                break;
            case 2:
                System.out.println("Valor: ");
                valor = input.nextFloat();
                System.out.println("Operação - Saque");
                if(valor > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    System.out.println("Novo Saldo: R$ " + String.format("%.2f",saldo - valor));
                }
                break;
            case 3:
                System.out.println("Valor: ");
                valor = input.nextFloat();
                System.out.println("Operação - Depósito");
                if(valor < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    System.out.println("Novo Saldo: R$ " + String.format("%.2f",saldo + valor));
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }

}
