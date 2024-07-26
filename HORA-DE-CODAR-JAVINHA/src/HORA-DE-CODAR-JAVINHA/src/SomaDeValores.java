/*
Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
 */
import java.util.Scanner;
import java.util.Arrays;
// essa classe permite manipular arrays.
public class SomaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();}

            // Ordenando números
            Arrays.sort(numeros);

            //Fazendo a soma dos dois maiores números
            int soma = numeros[1] + numeros[2];

            // Exibindo o resultado.
            System.out.println("A soma dos dois maiores números é: " + soma);


    }
}
