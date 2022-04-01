
public interface IConta {


    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino );

    void transferir(Conta contaDestino);

    void imprimirExtrato();

}
