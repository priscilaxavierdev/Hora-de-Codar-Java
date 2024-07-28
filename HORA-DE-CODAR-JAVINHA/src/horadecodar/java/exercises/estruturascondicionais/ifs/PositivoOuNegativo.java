package horadecodar.java.exercises.estruturascondicionais.ifs;/*
5 - 1, 2 e 3
Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
 */
import java.util.Scanner;
public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto que permite a entrada de dados.
        System.out.println("Digite um numero: ");
        int numeroDigitado = scanner.nextInt(); // Variavel para ler e guardar valores inteiros.
        if (numeroDigitado > 0){ //Condição que verifica se é positivo
            System.out.println("Este número é positivo ");
        } else if (numeroDigitado < 0){
            System.out.println("Este numero é negativo "); //Condição que verifica se é negativo
        } else {
            System.out.println("Este número é neutro "); // /Condição que verifica se é neutro
        }
       scanner.close();
    }
}
