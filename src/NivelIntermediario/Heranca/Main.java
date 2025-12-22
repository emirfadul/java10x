package NivelIntermediario.Heranca;

public class Main {
    
    public static void main(String[] args) {

        // Uzumaki Sasuke = new Uzumaki();
        // Sasuke.nome = "Sasuke Uchiha";
        // Sasuke.idade = 16;
        // Sasuke.aldeia = "Uchicha";
        // Sasuke.SharinganAtivado();     


        // Ninja Naruto = new Ninja();
        // Naruto.nome = "Naruto Uzumaki";
        // Naruto.idade = 13;
        // Naruto.aldeia = "Aldeia da folha";     
        
        // Uchira Sakuro = new Uchira();
        // Sakuro.nome = "Sakuro Uzumaki";
        // Sakuro.idade = 21;
        // Sakuro.aldeia = "Cornos S/A";
        // Sakuro.ModoSabio();     
 
        // Haruno Hinata = new Haruno();
        // Hinata.nome = "HInata Uzumaki";
        // Hinata.idade = 18;
        // Hinata.aldeia = "Aldeia da folha";     
        // Hinata.AtivarCura();

        // Hyuga Hinato = new Hyuga();
        // Hinato.nome = "HInata Uzumaki";
        // Hinato.idade = 18;
        // Hinato.aldeia = "Aldeia da folha";     
        // Hinato.ByuriganAtivado();

        // Boruto Boruto = new Boruto();
        // Boruto.nome = "Boruto Uzumaki";
        // Boruto.idade = 20;
        // Boruto.aldeia = "Aldeia da folha";     
        // Boruto.SharinganAtivado();
        // Boruto.AtivarKarma();
        // Boruto.AtivarJogan();

        // Uzumaki narutinho = new Uzumaki();
        // narutinho.nome = "Naruto Uzumaki";
        // narutinho.idade = 13;
        // narutinho.aldeia = "Aldeia da folha";     
        // narutinho.habilidadeEspecial();

        // Uchira sakuro = new Uchira();
        // sakuro.nome = "Sakuro Uzumaki";
        // sakuro.idade = 21;
        // sakuro.aldeia = "Cornos S/A";
        // sakuro.habilidadeEspecial();

        // Naruto.SharinganAtivado();

        // String r = Naruto.SharinganViado();
        // System.out.println(r);

        // int a = Naruto.SharinganDeMaior(15, 18);
            
        // if (a > 0){
        //     System.out.println("O Ninja é maior de idade!");
        // } else {
        //     System.out.println("O Ninja é menor de idade!");
        // }

        Hokage Hashirama = new Hokage("Hashirama", 30, true);
        System.out.println(Hashirama.nome); 

        Hokage Hashirama2 = new Hokage("Hashirama Goku", 30, true);
        System.out.println(Hashirama2.nome);

        Hokage Hashirama3 = new Hokage("Hashirama Fadul", 30, true);
        System.out.println(Hashirama3.nome);

        Hokage Nirama = new Hokage("Nirama max", 0, false);
        System.out.println(Nirama.nome);
        System.out.println(Nirama.idade);
        System.out.println(Nirama.vivoOuNao);

    }
}
 