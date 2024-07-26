/*
10 - Parabéns
Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem:
PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
 */

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SEJA BEM-VINDO AO PORTAL DE NOTAS DO ALUNO");
        System.out.println("-------------------------------------------");
        System.out.println("Para obter aprovação o aluno precisa ter média igual ou superior a 6.");
        System.out.println("-------------------------------------------");
        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = scanner.nextInt();
        int mediaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaDasNotas >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado");
        } else {
            System.out.println("REPROVADO");
        }


    }
}
