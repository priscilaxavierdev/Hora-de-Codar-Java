package horadecodar.java.exercises.estruturascondicionais.ifs;/*
Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor -
 ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
 */
import java.util.Scanner;
public class DigiteNovamente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = input.nextInt();

        if(primeiroValor <= 0 || primeiroValor == 0){
            System.out.println("Digite novamente(não serão aceitos numeros negativos ou neutros)");
            input.nextInt();
        }

    }
}
