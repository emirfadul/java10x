package NivelIntermediario.Desafio.Heranca;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha as opçoes abaixo ");
        System.out.println("1 - Exibir informacoes");
        System.out.println("2 - Adicionar Ninjas");
        System.out.println("3 - Atualizar habilidades");
        System.out.println("4 - Sair");


        String opcao = scanner.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();
        
        Uchiha Naruto = new Uchiha();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 13;
        Naruto.missao = "Encontrar o lendário Hokage";
        Naruto.nivelDificuldade = "Médio";
        Naruto.statusMissao = "Em andamento";
        Naruto.habilidadeEspecial = "Sharingan";

        Naruto.mostraInforcaoes();
        Naruto.mostraHabilidadeEspecial();
    }

}
