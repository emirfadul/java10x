package NivelIntermediario.Desafio.Heranca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha as opçoes abaixo ");
        System.out.println("1 - Exibir informacoes");
        System.out.println("2 - Adicionar Ninjas");
        System.out.println("3 - Atualizar habilidades");
        System.out.println("4 - Sair");
        int opcao = scanner.nextInt();

        Uchiha Naruto = new Uchiha();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 13;
        Naruto.missao = "Encontrar o lendário Hokage";
        Naruto.nivelDificuldade = "Médio";
        Naruto.statusMissao = "Em andamento";
        Naruto.habilidadeEspecial = "Sharingan";

        switch (opcao) {
            case 1:
                Naruto.mostraInforcaoes();                
                break;
            case 2:
                Uchiha Emir = new Uchiha();
                Emir.nome = "Emir Fadul";
                Emir.idade = 20;
                Emir.missao = "Encontrar o lendário Hokage";
                Emir.nivelDificuldade = "Médio";
                Emir.statusMissao = "Em andamento";
                Emir.habilidadeEspecial = "Sharingan";
                Emir.mostraInforcaoes();
                break;
            case 3:
                System.out.println("Atualizar habilidades");
                break;
            case 4:
                System.out.println("Sair");
                break;
        
            default:
                break;
        }

       
       

       
        
        

        // Naruto.mostraInforcaoes();
        // Naruto.mostraHabilidadeEspecial();
    }

}
