/*
6 - Qual o maior?
Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

 */
import java.util.Scanner;
public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiroNumero = scanner.nextInt();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("O primeiro número é o maior: " + primeiroNumero);
        } else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            System.out.println("O segundo número é o maior: " + segundoNumero);
        } else {
            System.out.println("O terceiro número é o maior: " + terceiroNumero);
        }
    }
}
