package NivelIntermediario.Desafio.Desafio4;

public class NinjaBasico implements Ninja{
    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Básico");
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Executando habilidades básicas");
    }

    public String toString(){
        return "### Esse é o metodo toString ###";
    }
}
