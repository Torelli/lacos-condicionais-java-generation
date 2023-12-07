package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] palavras = new String[3];

        for(int i = 0; i < 3; i++) {
            palavras[i] = input.nextLine();
        }

        if(palavras[0].equalsIgnoreCase("Vertebrado")) {
            if(palavras[1].equalsIgnoreCase("Ave")) {
                if(palavras[2].equalsIgnoreCase("Carnívoro")) {
                    System.out.println("Águia");
                } else if(palavras[2].equalsIgnoreCase("Onívoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.printf("Palavra inválida!");
                }
            } else if (palavras[1].equalsIgnoreCase("Mamífero")) {
                if(palavras[2].equalsIgnoreCase("Onívoro")) {
                    System.out.println("Homem");
                } else if(palavras[2].equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Vaca");
                } else {
                    System.out.printf("Palavra inválida!");
                }
            } else {
                System.out.println("Palavra inválida!");
            }
        } else if(palavras[0].equalsIgnoreCase("Invertebrado")) {
            if(palavras[1].equalsIgnoreCase("Inseto")) {
                if(palavras[2].equalsIgnoreCase("Hematófago")) {
                    System.out.println("Pulga");
                } else if(palavras[2].equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Lagarta");
                } else {
                    System.out.printf("Palavra inválida!");
                }
            } else if (palavras[1].equalsIgnoreCase("Anelídeo")) {
                if(palavras[2].equalsIgnoreCase("Hematófago")) {
                    System.out.println("Sanguessuga");
                } else if(palavras[2].equalsIgnoreCase("Onívoro")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.printf("Palavra inválida!");
                }
            } else {
                System.out.println("Palavra inválida!");
            }
        }
    }

}
