import java.util.Scanner;
//CHAT QUE FEZ ESSE EXERCICIOOOOOO
public class DivisaoDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro valor
        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor = 0;

        // Continua solicitando o segundo valor até que seja um valor positivo
        while (true) {
            System.out.print("Informe o segundo valor (não pode ser zero ou negativo): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor > 0) {
                break;
            } else {
                System.out.println("O segundo valor deve ser maior que zero. Tente novamente.");
            }
        }

        // Realiza a divisão
        double resultado = primeiroValor / segundoValor;

        // Imprime o resultado
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}
