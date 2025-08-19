public class Main {
    public static void main(String[] args) {

        Cliente pessoa = new Cliente();
        pessoa.nome = "Gian";
        pessoa.cpf = "1234567890";

        Conta contaPessoa = new Conta();
        contaPessoa.titular = pessoa;
        contaPessoa.numero = 1500;
        contaPessoa.saldo = 50;

        Banco sitemaBancario = new Banco();

        System.out.println("Valor atual R$:");
        contaPessoa.imprimirSaldo();

        System.out.println("Depositando 100 Reais R$:");
        sitemaBancario.depositar(contaPessoa , 100d);


        System.out.println("Valor atual apos o deposito R$:");
        contaPessoa.imprimirSaldo();

        System.out.println("Sacando 30 Reais R$:");
        sitemaBancario.sacar(contaPessoa , 30);

        contaPessoa.imprimirSaldo();

        System.out.println("Sacando 200 Reais R$:");
        sitemaBancario.sacar(contaPessoa , 200d);

        contaPessoa.imprimirSaldo();

        Cliente fulano = new Cliente();
        fulano.nome = "Guilherme";
        fulano.cpf = "1244542124";

        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1000;
        contaFulano.saldo = 0;

        System.out.println("Transferindo R$ 120 para o Fulano");

        sitemaBancario.transferir(contaPessoa , contaFulano , 120d);

        contaFulano.imprimirSaldo();
        contaPessoa.imprimirSaldo();

    }

}
