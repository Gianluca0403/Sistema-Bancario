public class Banco {

    void depositar(Conta conta , double valor){

        double SaldoAtual = conta.getSaldo();
        Double NovoSaldo = SaldoAtual + valor;
        conta.setSaldo(NovoSaldo);

    }

    void sacar(Conta conta, double valor){

        double SaldoAtual = conta.getSaldo();
        double NovoSaldo = SaldoAtual -valor;
        if(NovoSaldo < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        }else{

            conta.setSaldo(NovoSaldo);

        }

    }

    void transferir (Conta origem , Conta destino, double valor){

        double saldoAtualOrigem = origem.getSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if(novoSaldoOrigem < 0){

            System.out.println("Voce nao tem dinheiro suficiente na conta, o saldo ficará negativo");

        } else {

            origem.setSaldo(novoSaldoOrigem);
            double saldoNovoDestino = destino.getSaldo() + valor;
            destino.setSaldo(saldoNovoDestino);

        }

    }

}
