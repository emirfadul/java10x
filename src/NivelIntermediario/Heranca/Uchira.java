package NivelIntermediario.Heranca;

public class Uchira extends Ninja{

    public void ModoSabio(){
        System.out.println("Meu nome é " + nome + " e Ativei o modo SABIO");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome +
         " e esse é meu ataque especial, um ataque de ar!");
    }
    
}
