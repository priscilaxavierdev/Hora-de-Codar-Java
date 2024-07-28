package horadecodar.java.exercises.manipulandovariaveis;/*
Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
 */
import java.util.Scanner; // Importa a classe Scanner para que possa ser usada no porgama.
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Primeiramente criamos o objeto que vai fazer a entrada de dados
        System.out.println("Escreva o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);

        scanner.close();
    }
}
/* Scnner scanner =  new Scanner(System.in);
lê um a linha de etxto digitada pelo usuario.
 String nome = scanner.nextLine(); lê a linha de texto digitada pelo usuario e armazena na variavel nome.

 */