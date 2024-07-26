/*
9 - Cansar de Digitar
Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

 */

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BEM-VINDO AO JOGO - DIGITE ATÉ CANSAR!");
        System.out.println("-----------------------------------------------");
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto número:");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto número:");
        int numero5 = scanner.nextInt();
        System.out.println("Digite o sexto número:");
        int numero6 = scanner.nextInt();
        System.out.println("Digite o sétimo número:");
        int numero7 = scanner.nextInt();
        System.out.println("Digite o oitavo número:");
        int numero8 = scanner.nextInt();
        System.out.println("Digite o nono número:");
        int numero9 = scanner.nextInt();
        System.out.println("Digite o décimo número:");
        int numero10 = scanner.nextInt();

        int mediaAritmetica = (numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10) / 10;
        System.out.println("A MÉDIA ARTIMÉTICA DOS 10 NÚMEROS É: " + mediaAritmetica);
    }
}
