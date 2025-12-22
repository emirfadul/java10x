package NivelBasico.Desafio;

public class Desafio {


    static void main(String[] args) {

        //ninja1
        String naruto1 = "Naruto";
        int idade1 = 13;
        String missao1 = "Dar o cu 2x ao dia";
        char nivel1 = 'S';
        boolean status1 = true;

        if (idade1 < 15){
            if (nivel1 == 'C' || nivel1 == 'D'){
                missao1 = "Concluida";
            } else {
                missao1 = "Não concluida";
            }
        }else{
            missao1 = "Concluida";
        }
        System.out.println("Nome: "+naruto1);
        System.out.println("idade: "+idade1);
        System.out.println("missão: "+missao1);
        System.out.println("nivel: "+nivel1);
        System.out.println("status: "+status1);
        System.out.println("---------------------------");

        //ninja2
        String naruto2 = "Goku";
        int idade2 = 15;
        String missao2 = "Dar o cu 3 ao dia";
        char nivel2 = 'B';
        boolean status2 = true;

        if (idade2 < 15){
            if (nivel2 == 'C' || nivel2 == 'D'){
                missao2 = "Concluida";
            } else {
                missao2 = "Não concluida";
            }
        }else{
            missao2 = "Concluida";

        }
        System.out.println("Nome: "+naruto2);
        System.out.println("idade: "+idade2);
        System.out.println("missão: "+missao2);
        System.out.println("nivel: "+nivel2);
        System.out.println("status: "+status2);
        System.out.println("---------------------------");

        //ninja3
        String naruto3 = "Susuke";
        int idade3 = 25;
        String missao3 = "Chupar rola e engolir";
        char nivel3 = 'A';
        boolean status3 = true;

        if (idade3 < 18){
            if (nivel3 == 'C' || nivel3 == 'D'){
                missao3 = "Concluida";
            } else {
                missao3 = "Não concluida";
            }
        }else{
            missao3 = "Concluida";

        }
        System.out.println("Nome: "+naruto3);
        System.out.println("idade: "+idade3);
        System.out.println("missão: "+missao3);
        System.out.println("nivel: "+nivel3);
        System.out.println("status: "+status3);
        System.out.println("---------------------------");




    }

}
