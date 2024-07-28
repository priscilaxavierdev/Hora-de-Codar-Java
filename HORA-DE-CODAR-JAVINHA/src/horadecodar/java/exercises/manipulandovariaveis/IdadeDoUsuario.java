package horadecodar.java.exercises.manipulandovariaveis;/*
3 - A Bit of Information
Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
 */
import java.util.Scanner;
public class IdadeDoUsuario {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Qual é a sua idade: ");
        int idadeUsuario = scanner.nextInt();
        System.out.println("Olá, " + nomeUsuario + " sua idade é " + idadeUsuario);
    }
}





