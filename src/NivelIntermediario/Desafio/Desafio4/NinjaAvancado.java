package NivelIntermediario.Desafio.Desafio4;

public class NinjaAvancado implements Ninja{
 
    String habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Avançado");
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Executando habilidades avançadas");
    } 
   
    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
      
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }    
    
}
