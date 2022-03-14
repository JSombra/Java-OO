public class App {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1337, 108742);

        Cliente jefferson = new Cliente();
        jefferson.setNome("Jefferson Sombra");
        jefferson.setCpf("222.111.222.11");
        jefferson.setProfissao("Programador");
        jefferson.setEndereco("Nove de Julho");

        primeiraConta.setAgencia(121);
        primeiraConta.setNumeroConta(2531);
        primeiraConta.depositarValor(670.01);
        primeiraConta.setTitularConta(jefferson);
        primeiraConta.depositarValor(1000);

        Conta segundaConta = new Conta(1337, 17632);

        Cliente raquel = new Cliente();
        raquel.setNome("Raquel Oliveira");
        raquel.setCpf("222.111.111.55");
        raquel.setProfissao("Advogada");
        raquel.setEndereco("Nove de Julho");

        segundaConta.setTitularConta(raquel);
        segundaConta.setAgencia(121);
        segundaConta.depositarValor(1000);
        segundaConta.depositarValor(250);
        System.out.println("Segunda conta possui R$" + segundaConta.getSaldo() + " após o deposito");
        boolean saqueConcluido = segundaConta.sacarValor(1250);
        if (saqueConcluido) {
            System.out.println("Saque efetuado com sucesso. Novo saldo é R$" + segundaConta.getSaldo());
        } else {
            System.out.println("Não foi possível efetuar o saque da conta. Valor não disponível");
        }

        primeiraConta.transfereValor(670, segundaConta);
        System.out.println(segundaConta.getSaldo());
        System.out.println(segundaConta.getTitular().getCpf());
    }
}
