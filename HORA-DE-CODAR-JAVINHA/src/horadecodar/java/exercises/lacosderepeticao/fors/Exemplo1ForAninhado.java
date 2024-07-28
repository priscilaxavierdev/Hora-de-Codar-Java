package horadecodar.java.exercises.lacosderepeticao.fors;

public class Exemplo1ForAninhado {
   // Tabela de Multiplicação
        public static void main(String[] args) {
            int tamanho = 10; // Tamanho da tabela

            for (int i = 1; i <= tamanho; i++) {
                for (int j = 1; j <= tamanho; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
    }

