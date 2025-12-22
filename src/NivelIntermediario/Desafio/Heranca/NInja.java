package NivelIntermediario.Desafio.Heranca;

public class NInja {

    String nome = "";
    int idade = 0;
    String missao = "";
    String nivelDificuldade = ""   ;
    String statusMissao = "";
    
    public void mostraInforcaoes(){
        System.out.println("Nome: " + nome +
         "\nIdade: " + idade +
         "\nMissão: " + missao +
         "\nNível de Dificuldade: " + nivelDificuldade +
          "\nStatus da Missão: " + statusMissao);
    }


}
