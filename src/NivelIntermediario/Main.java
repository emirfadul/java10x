package NivelIntermediario;

public class Main {
    
    public static void main(String[] args) {

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Aldeia da folha";

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 13;
        Naruto.aldeia = "Aldeia da folha";      

        System.out.println("---------------------------");
        System.out.println("Nome: " + Sasuke.nome);
        System.out.println("Idade: " + Sasuke.idade);
        System.out.println("Aldeia: " + Sasuke.aldeia);

        System.out.println("---------------------------");

        System.out.println("Nome: " + Naruto.nome);
        System.out.println("Idade: " + Naruto.idade);
        System.out.println("Aldeia: " + Naruto.aldeia);
        System.out.println("---------------------------");
    }
}
 