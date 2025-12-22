;l;package NivelBasico.Desafio;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMax = 10;
        String[] ninjas = new String[numeroMax];

        int cadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3) {


            System.out.println("\n====== Menu Ninja =========");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Sair");
            System.out.println("Escolha uma Opção: ");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    if(cadastrados < numeroMax) {
                        System.out.println("Digite o nome do ninja: ");
                        String nome = scanner.next();
                        ninjas[cadastrados] = nome;
                        cadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                        break;
                    } else {
                        System.out.println("Lista está cheia");                        
                    }
                    break;

                case 2:
                    if(cadastrados > 0) {
                        System.out.println("Ninjas cadastrados:");
                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println((i+1) + ". " + ninjas[i]);
                        }
                    } else {
                        System.out.println("Nenhum ninja cadastrado");
                    }
                    break;

                case 3:
                    System.out.println("Fim do acesso");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }            


        }
        scanner.close();
    }
}
