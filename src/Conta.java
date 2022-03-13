public class Conta {
    double saldo;
    int agencia;
    int numeroConta;
    String titular;

    public void depositarValor(double deposito) {
        this.saldo += deposito;
    }
    public void sacarValor(double sacar){
        this.saldo -= sacar;
    }
}
