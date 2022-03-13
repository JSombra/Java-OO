public class App {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.agencia = 121;
        primeiraConta.numeroConta = 2531;
        primeiraConta.saldo = 670.01;
        primeiraConta.titular = "Jefferson";
        System.out.println("Primeira conta possui " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        
        segundaConta.titular = "Raquel";
        segundaConta.agencia = 121;
        segundaConta.saldo = 1000;
        segundaConta.depositarValor(500);
        System.out.println("Segunda conta possui " + segundaConta.saldo + " após o deposito");
        segundaConta.sacarValor(250);
        System.out.println("Segunda conta possui " + segundaConta.saldo + " após o saque");
    }
}
