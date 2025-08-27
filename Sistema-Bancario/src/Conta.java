public class Conta {

    public Cliente titular;
    public int numero;
    private double saldo;


    public Conta(Cliente titular , int numero , double saldo){

        if(titular == null){

            throw new IllegalArgumentException("Titular não encontrado");

        }
        this.titular = titular;

        this.numero = numero;

        if(saldo >= 0){

            this.saldo = saldo;

        }
    }

    public void modificarSaldo(double saldo){

        if(saldo > 0){

            this.saldo = saldo;

        }else{

            System.out.println("sua conta esta com saldo negativo");

        }

    }

    public double obterSaldo(){

        return this.saldo;

    }

    public void imprimirSaldo(){

        System.out.println("Saldo para a conta " + this.numero + ":" + this.saldo);

    }

}
