package NivelIntermediario.Desafio.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico();
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidades();
        
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto Uzumaki", 13, "Sharingan");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidades();    

        Ninja emir = new NinjaBasico();
        emir.mostrarInformacoes();
        emir.executarHabilidades();
    }

}
