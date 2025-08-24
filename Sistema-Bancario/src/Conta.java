public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    Conta(){

    }

    Conta(Cliente titular , int numero , double saldo){

        if(titular == null){

            throw new IllegalArgumentException("Titular não encontrado");

        }
        this.titular = titular;

        this.numero = numero;

        if(saldo >= 0){

            this.saldo = saldo;

        }
    }

    void imprimirSaldo(){

        System.out.println("Saldo para a conta " + this.numero + ":" + this.saldo);

    }

}
