package ex02;
/*Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios. */

public class ContaCorrente {
    private String nomeCorrentista;
    private int numeroConta;
    private float saldoConta;
    
    public ContaCorrente(String nomeCorrentista, int numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = 0f;
    }

    public ContaCorrente(String nomeCorrentista, int numeroConta, float saldoConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public void alterarNome(String novoNome){
        this.nomeCorrentista = novoNome;
    }

    public void deposito(float valor){
        if (valor > 0){
            this.saldoConta += valor;
            this.imprimirSaldo();
        }
    }

    public void saque(float valor){
        if ((this.saldoConta - valor) >= 0){
            this.saldoConta -= valor;
            this.imprimirSaldo();
        }else{
            System.out.println("Saldo indisponível");
        }
    }

    private void imprimirSaldo(){
        System.out.printf("Saldo atual: %f\n", this.saldoConta);
    }

    @Override
    public String toString() {
        return "ContaCorrente [nomeCorrentista=" + nomeCorrentista + ", numeroConta=" + numeroConta + ", saldoConta="
                + saldoConta + "]";
    }
}
