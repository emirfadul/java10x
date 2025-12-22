package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
        scanner.close();
    }
}