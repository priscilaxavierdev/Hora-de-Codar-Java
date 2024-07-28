package horadecodar.java.exercises.lacosderepeticao.fors;

import java.util.Arrays;
import java.util.Scanner;

public class SomaMaioresValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Aqui criamos o array numeros que recebe 5 valores

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();}

        // Ordenando números
        Arrays.sort(numeros);

        //Fazendo a soma dos dois maiores números
        int soma = numeros[3] + numeros[4]; // 3 e 4 são as ultimas posições do array, lembre-se, as posições começam a partir do 0 ex(0,1,2,3,4)

        // Exibindo o resultado.
        System.out.println("A soma dos dois maiores números é: " + soma);
    }
}
