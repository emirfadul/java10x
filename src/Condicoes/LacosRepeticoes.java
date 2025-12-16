package Condicoes;

public class LacosRepeticoes {

    static void main(String[] args) {

        //while

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras "+numeroDeClones);
        }

        //for
        for (int i = 0; i <= numeroDeClones; i++) {
            System.out.println("O naruto fez um clone das sombras "+i);

        }
    }
}
