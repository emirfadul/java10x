package NivelIntermediario.Heranca;

public abstract class Ninja implements EstrategiaBatalha {

    String nome = "";
    int idade = 0;
    String aldeia = "";

    //void
    // public void SharinganAtivado(){
    //     System.out.println("Meu nome é " + nome + " e Sharingan está Ativado e eu sou um "+aldeia);
    // }

    // // STRING sem argumento
    // public String SharinganViado(){
    //     return "Sharingan Viado!";
    // }    
    
    // public int SharinganDeMaior(int idadeMinima, int idade){
    //     return idade - idadeMinima;
    // }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome +
         " e esse é meu ataque de fogo");
    }

    @Override
    public  void estrategiaBatalhaNinja(){
        System.out.println("Meu nome é " + nome +
         " e minha estratégia de batalha é atacar primeiro");
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja() {
    }   

    



}
