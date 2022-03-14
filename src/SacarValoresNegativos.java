public class SacarValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 10823);
        conta.depositarValor(100);
        conta.sacarValor(200);
        System.out.println(conta.getSaldo());
    }
}
