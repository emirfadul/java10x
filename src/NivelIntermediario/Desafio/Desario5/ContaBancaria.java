package NivelIntermediario.Desafio.Desario5;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
