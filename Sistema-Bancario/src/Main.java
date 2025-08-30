public class Main {
    public static void main(String[] args) {

        Cliente pessoa = new Cliente("44584186857" , "Gian");
        Conta contaPessoa = new Conta(pessoa , 1500 , 50);


        Banco sitemaBancario = new Banco();

        System.out.println("Valor atual R$: ");
        contaPessoa.imprimirSaldo();

        System.out.println("Depositando 100 Reais R$: ");
        sitemaBancario.depositar(contaPessoa , 100d);


        System.out.println("Valor atual apos o deposito R$: ");
        contaPessoa.imprimirSaldo();

        System.out.println("Sacando 30 Reais R$: ");
        sitemaBancario.sacar(contaPessoa , 30);

        contaPessoa.imprimirSaldo();

        System.out.println("Sacando 200 Reais R$: ");
        sitemaBancario.sacar(contaPessoa , 200d);

        contaPessoa.imprimirSaldo();

        Cliente fulano = new Cliente();
        fulano.setNome("Guilherme");
        fulano.setCpf("1244542124");

        Conta contaFulano = new Conta(fulano ,2000 , 50);

        System.out.println("Transferindo R$ 120 para o Fulano ");

        sitemaBancario.transferir(contaPessoa , contaFulano , 120d);

        contaFulano.imprimirSaldo();
        contaPessoa.imprimirSaldo();

        ValidarCpf cpfValido = new ValidarCpf();


    }

}
