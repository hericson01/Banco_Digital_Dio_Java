public class Main {

    public static void main(String[] args) {
        Cliente Hericson = new Cliente();
        Hericson.setNome("Hericson");

        Conta contaCorrente = new ContaCorrente(Hericson);
        Conta contaPoupanca = new ContaPoupanca(Hericson);
        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        contaCorrente.transferir(20, contaPoupanca);
        contaPoupanca.transferir(5, contaCorrente);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
