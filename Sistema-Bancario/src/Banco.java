public class Banco {

    void depositar(Conta conta , double valor){

        double SaldoAtual = conta.saldo;
        Double NovoSaldo = SaldoAtual + valor;
        conta.saldo = NovoSaldo;

    }

    void sacar(Conta conta, double valor){

        double SaldoAtual = conta.saldo;
        double NovoSaldo = SaldoAtual -valor;
        if(NovoSaldo < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        }else{

            conta.saldo = NovoSaldo;

        }

    }

    void transferir (Conta origem , Conta destino, double valor){

        double saldoAtualOrigem = origem.saldo;
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if(novoSaldoOrigem < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        } else {

            origem.saldo = novoSaldoOrigem;
            double saldoNovoDestino = destino.saldo + valor;
            destino.saldo = saldoNovoDestino;

        }

    }

}
