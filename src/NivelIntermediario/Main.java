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

        Naruto.SharinganAtivado();

        String r = Naruto.SharinganViado();
        System.out.println(r);

        int a = Naruto.SharinganDeMaior(15, 18);
            
        if (a > 0){
            System.out.println("O Ninja é maior de idade!");
        } else {
            System.out.println("O Ninja é menor de idade!");
        }

    }
}
 