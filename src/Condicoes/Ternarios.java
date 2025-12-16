package Condicoes;

public class Ternarios {

    static void main(String[] args) {

        short numeroDeMissoes = 5;

        String nivelDoNinja  = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja não esta com menos de 10 missoes";

        System.out.println(nivelDoNinja);

    }
}
