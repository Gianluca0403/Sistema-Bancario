public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    void imprimirSaldo(){

        System.out.println("Saldo para a conta " + this.numero + ":" + this.saldo);

    }

}
