public class TestarValores {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1337, 24225);
        Conta conta2 = new Conta(1337, 26225);
        Conta conta3 = new Conta(1337, 14225);
        Conta conta4 = new Conta(1337, 64225);
        System.out.println(conta4.getAgencia());
        System.out.println(conta4.getTotal());
    }
}
