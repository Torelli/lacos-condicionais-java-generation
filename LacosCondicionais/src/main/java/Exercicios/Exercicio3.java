package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        boolean isFirst;

        System.out.println("Digite o nome do doador");
        nome = input.nextLine();

        System.out.println("Digite a idade do doador");
        idade = input.nextInt();

        System.out.println("Primeira doação de sangue?");
        isFirst = input.nextBoolean();

        if((idade >= 18 && idade <= 59) || ((idade >= 60 && idade <= 69) && !isFirst)) {
            System.out.println(nome + " está apto(a) para doar sangue!");
        } else {
            System.out.println(nome + " não está apto(a) para doar sangue!");
        }
    }

}
