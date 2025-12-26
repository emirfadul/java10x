package NivelIntermediario.Desafio.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome = "goku";
    int idade = 54;
    String habilidade = "comer cu";
    String especialidade = "dev";

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Avançado");
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Executando habilidades avançadas");
    }

    public NinjaAvancado(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    
    
}
