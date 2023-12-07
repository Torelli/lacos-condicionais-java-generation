package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        String result;

        System.out.println("\nDigite um número: ");

        num = input.nextInt();

        if(num % 2 == 0) {
            result = "O número " + num + " é par ";
        } else {
            result = "O número " + num + " é ímpar ";
        }

        if(num < 0) {
            result += "e negativo!";
        } else {
            result += "e positivo!";
        }

        System.out.println(result);
    }

}
