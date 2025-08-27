public class Banco {

    void depositar(Conta conta , double valor){

        double SaldoAtual = conta.obterSaldo();
        Double NovoSaldo = SaldoAtual + valor;
        conta.modificarSaldo(NovoSaldo);

    }

    void sacar(Conta conta, double valor){

        double SaldoAtual = conta.obterSaldo();
        double NovoSaldo = SaldoAtual -valor;
        if(NovoSaldo < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        }else{

            conta.modificarSaldo(NovoSaldo);

        }

    }

    void transferir (Conta origem , Conta destino, double valor){

        double saldoAtualOrigem = origem.obterSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if(novoSaldoOrigem < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        } else {

            origem.modificarSaldo(novoSaldoOrigem);
            double saldoNovoDestino = destino.obterSaldo() + valor;
            destino.modificarSaldo(saldoNovoDestino);

        }

    }

}
