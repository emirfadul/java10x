package NivelIntermediario.Desafio.Desario5;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado R$ " + valor + " na Conta Corrente.");
    }

}
