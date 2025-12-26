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

        // 

            
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaBatalhaNinja();

        Uchira sasuke = new Uchira();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
        naruto.estrategiaBatalhaNinja();      
        
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 25;
        kakashi.SharinganAtivado();
        kakashi.NinjaDeElite();


        Hokage hirizen = new Hokage();
        hirizen.nome = "Hokage";
        hirizen.idade = 20;
        hirizen.vivoOuNao = true;
        System.out.println(hirizen.nome);
        System.out.println(hirizen.idade);
        System.out.println(hirizen.vivoOuNao);

        Hokage emir = new Hokage();
        emir.nome = "Emir Fadul";
        emir.idade = 25;
        emir.vivoOuNao = true;
        System.out.println(emir.nome);
        System.out.println(emir.idade);
        System.out.println(emir.vivoOuNao);

        
        


    }

   
}
 