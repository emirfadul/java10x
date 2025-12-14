package Desafio;

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
        System.out.println("Nome: "+naruto1+"   idade: "+idade1+"   missão: "+missao1+"   nivel: "+nivel1+"   status: "+status1);


        //ninja2
        String naruto2 = "Goku";
        int idade2 = 15;
        String missao2 = "Dar o cu 3 ao dia";
        char nivel2 = 'B';
        boolean status2 = true;
        System.out.println("Nome: "+naruto2+"   idade: "+idade2+"   missão: "+missao2+"   nivel: "+nivel2+"   status: "+status2);


        //ninja3
        String naruto3 = "Susuke";
        int idade3 = 25;
        String missao3 = "Chupar rola e engolir";
        char nivel3 = 'A';
        boolean status3 = true;
        System.out.println("Nome: "+naruto3+"   idade: "+idade3+"   missão: "+missao3+"   nivel: "+nivel3+"   status: "+status3);



    }

}
