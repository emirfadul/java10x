package NivelIntermediario.Desafio.Desario5;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor * 0.99; // Taxa de 1%
        this.saldo += valorComTaxa;
        System.out.println("Depositado R$ " + valor + " na Conta Poupança (Taxa de 1% aplicada).");
    }

}
