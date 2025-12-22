package NivelIntermediario.Heranca;

public class Uchira extends Ninja{

    public Uchira(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void ModoSabio(){
        System.out.println("Meu nome é " + nome + " e Ativei o modo SABIO");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome +
         " e esse é meu ataque especial, um ataque de ar!");
    }

    public void estrategiaBatalhaNinja(){

    }

    public Uchira() {
    }
    
    
}


