import java.util.Scanner;

public class Maioridade {
    public static int maioral(int idade, int condicao) {
        if (idade > 18) {
            condicao = 1;
            return condicao;
        } else {
            condicao = 0;
            return condicao;
        }
    }

    public static void print(int condicao) {
        if (condicao == 1) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        int condicao = 0;

        condicao = maioral(idade, condicao);

        print(condicao);

        scanner.close();
    }
}
