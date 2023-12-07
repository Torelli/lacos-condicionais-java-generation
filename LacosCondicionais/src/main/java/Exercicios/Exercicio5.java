package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoProduto, qtd;

        System.out.println("Código do produto");
        codigoProduto = input.nextInt();
        System.out.println("Quantidade");
        qtd = input.nextInt();

        switch(codigoProduto) {
            case 1:
                System.out.println("Produto: Cachorro Quente \nValor total: R$ " + (10 * qtd) + ".00");
                break;
            case 2:
                System.out.println("Produto: X-Salada \nValor total: R$ " + (15 * qtd) + ".00");
                break;
            case 3:
                System.out.println("Produto: X-Bacon \nValor total: R$ " + (18 * qtd) + ".00");
                break;
            case 4:
                System.out.println("Produto: Bauru \nValor total: R$ " + (12 * qtd) + ".00");
                break;
            case 5:
                System.out.println("Produto: Refrigerante \nValor total: R$ " + (8 * qtd) + ".00");
                break;
            case 6:
                System.out.println("Produto: Suco de laranja \nValor total: R$ " + (13 * qtd) + ".00");
                break;
            default:
                System.out.println("Código inválido!");
        }
    }

}
