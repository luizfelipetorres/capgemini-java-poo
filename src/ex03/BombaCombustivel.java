/*Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.

 
*/

package ex03;

public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    /*
     * a. abastecerPorValor; //método onde é informado o valor a ser abastecido e
     * mostra a quantidade de
     * litros que foi colocada no veículo
     */

    private void imprimeValorLitro(float valorTotal, float litroTotal) {
        System.out.printf("Foram abastecidos %.2f litros a R$ %.2f\n", litroTotal, valorTotal);
    }

    public void abastecerPorValor(float valor) {
        float qtdNova = this.quantidadeCombustivel - (valor / this.valorLitro);

        if (valor <= 0f) {
            System.out.println("Valor inválido");
        } else if (qtdNova < 0f) {
            System.out.println("Combustível insuficiente na bomba");
        } else {
            float qtdLitros = valor / this.valorLitro;
            this.quantidadeCombustivel -= qtdLitros;
            this.imprimeValorLitro(valor, qtdLitros);
        }

    }

    /*
     * b. abastecerPorLitro; // método onde é informado a quantidade em litros de
     * combustível e mostra o
     * valor a ser pago pelo cliente.
     */
    public void abastecerPorLitro(float qtdLitros) {
        float qtdNova = this.quantidadeCombustivel - qtdLitros;

        if (qtdNova < 0) {
            System.out.println("Combustivel insuficiente na bomba");
            return;
        } else if (qtdLitros <= 0) {
            System.out.println("Quantidade de combustível inválida");
        } else {
            float valorPago = qtdLitros * this.valorLitro;
            this.quantidadeCombustivel = qtdNova;
            this.imprimeValorLitro(valorPago, qtdLitros);
        }
    }

    /*
     * c. alterarValor; //altera o valor do litro do combustível.
     */
    public void alterarValor(float valor) {
        if (valor < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.valorLitro = valor;
        }
    }

    /* d. alterarCombustivel; //altera o tipo do combustível. */
    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    /*
     * e. alterarQuantidadeCombustivel; //altera a quantidade de combustível
     * restante na bomba.
     */
    public void alterarQuantidadeCombustivel(float qtdCombustivel) {
        if (qtdCombustivel < 0) {
            System.out.println("Quantidade inválida");
        } else {
            this.quantidadeCombustivel = qtdCombustivel;
        }
    }

    @Override
    public String toString() {
        return "BombaCombustivel [quantidadeCombustivel=" + quantidadeCombustivel + ", tipoCombustivel="
                + tipoCombustivel + ", valorLitro=" + valorLitro + "]";
    }
}
