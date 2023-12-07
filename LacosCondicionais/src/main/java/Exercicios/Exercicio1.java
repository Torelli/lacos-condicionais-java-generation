package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;


        System.out.println("\nDigite o número A");
        a = input.nextInt();
        System.out.println("\nDigite o número B");
        b = input.nextInt();
        System.out.println("\nDigite o número C");
        c = input.nextInt();


        if((a + b) > c) {
            System.out.println("A soma de A + B é Maior do que C");
        } else if((a + b) == c) {
            System.out.println("A soma de A + B é Igual a C");
        } else {
            System.out.println("A soma de A + B é Menor que C");
        }
    }

}
