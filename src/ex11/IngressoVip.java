package ex11;


public class IngressoVip extends Ingresso {
    static float valorAdicional = 5f;

    @Override
    public void imprimirValor() {
        System.out.println(super.valor + valorAdicional);
    }
}
