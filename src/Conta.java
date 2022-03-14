public class Conta {
    private double saldo = 0;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) { // construtor
        total++;
        this.agencia = agencia;
        this.numeroConta = numero;
    }

    public void depositarValor(double deposito) {
        if (deposito <= 0) {
            System.out.println("Deposito inválido, favor depositar apenas valores maiores que R$0,00");
            return;
        }
        this.saldo += deposito;

    }

    public boolean sacarValor(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor indisponível para saque");
            return false;
        }

    }

    public boolean transfereValor(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositarValor(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int novoNumero) {
        if (novoNumero <= 0) {
            System.out.println("Não pode valor igual ou menor que 0");
            return;
        }
        this.numeroConta = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int novaAgencia) {
        if (novaAgencia <= 0) {
            System.out.println("Não pode valor igual ou menor que 0");
            return;
        }
        this.agencia = novaAgencia;
    }

    public void setTitularConta(Cliente cliente) {
        this.titular = cliente;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getTotal(){
        return Conta.total;
    }
}