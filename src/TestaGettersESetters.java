public class TestaGettersESetters {
    public static void main(String[] args) {
        Cliente jefferson = new Cliente();
        Conta conta = new Conta(1337, 1983);

        conta.setTitularConta(jefferson);
        jefferson.setNome("Jefferson Sombra");
        jefferson.setCpf("222.111.222.11");
        jefferson.setProfissao("Programador");
        jefferson.setEndereco("Nove de Julho");

        System.out.println(conta.getTitular().getNome());
    }
}
