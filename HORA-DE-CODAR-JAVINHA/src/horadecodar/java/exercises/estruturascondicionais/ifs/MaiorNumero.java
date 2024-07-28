package horadecodar.java.exercises.estruturascondicionais.ifs;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiroNumero = scanner.nextInt();
        System.out.println("Digite o quarto número: ");
        int quartoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && primeiroNumero > quartoNumero) {
            System.out.println("O primeiro número é o maior: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && segundoNumero > quartoNumero) {
            System.out.println("O segundo número é o maior: " + segundoNumero);
        } else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && terceiroNumero > quartoNumero) {
            System.out.println("O terceiro número é o maior: " + terceiroNumero);
        } else {
            System.out.println("O quarto número é o maior: " + quartoNumero);
        }
    }
}
