package NivelIntermediario;

public class Ninja {

    String nome = "";
    int idade = 0;
    String aldeia = "";

    public void SharinganAtivado(){
        System.out.println("Sharingan Ativado!");
    }

    public String SharinganViado(){
        return "Sharingan Viado!";
    }    
    
    public int SharinganDeMaior(int idadeMinima, int idade){
        return idade - idadeMinima;
    }

}
