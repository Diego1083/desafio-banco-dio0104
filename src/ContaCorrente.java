public class ContaCorrente extends Conta {

    @Override
    public void transferir(Conta contaDestino) {
        // TODO Auto-generated method stub



    }

    public void imprimirExtrato() {
        System.out.println((" === Extrato Conta Corrente ===  "));
        super.imprimirInfosComuns();

    }


}