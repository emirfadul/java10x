package NivelIntermediario.Desafio.Desario5;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste Conta Corrente ---");
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100.0);
        cc.consultarSaldo(); // Deve ser 100.0

        System.out.println("\n--- Teste Conta Poupança ---");
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100.0);
        cp.consultarSaldo(); // Deve ser 99.0 (1% de taxa)
        
    }

}
