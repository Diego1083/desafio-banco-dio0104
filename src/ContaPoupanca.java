
public class ContaPoupanca extends Conta {

    @Override
    public void transferir(Conta contaDestino) {
        // TODO Auto-generated method stub

    }


    public void imprimirExtrato() {
        System.out.println((" === Extrato Conta Poupanca ===  "));
        super.imprimirInfosComuns();

    }



}
