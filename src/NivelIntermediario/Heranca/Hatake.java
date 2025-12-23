package NivelIntermediario.Heranca;

public class Hatake extends Ninja implements AnbuInterface, ShariganInterface {

    public void boasVindas() {
        System.out.println(nome+" Seja bem-vindo, eu sou um Hatake!");
    }

    public void SharinganAtivado(){
        System.out.println(nome + " Ativei o Sharingan!");
    }

    public void NinjaDeElite(){
        System.out.println(nome + " Eu sou um ninja de elite ANBU !");
    }

}
