package ex04;

/**
 * 4. Crie uma classe denominada Elevador para armazenar as informações de um
 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
 * elevador e quantas pessoas estão presentes nele. A classe deve também
 * disponibilizar os seguintes métodos:
 */
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadeAtual;

    /**
     * Inicializa: que deve receber como parâmetros a capacidade do elevador e o
     * total de andares no
     * prédio (os elevadores sempre começam no térreo e vazio);
     * 
     */
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidadeElevador = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadeAtual = 0;
    }

    /**
     * Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
     * houver espaço);
     */
    public void entra() {
        if (this.quantidadeAtual < this.capacidadeElevador) {
            this.quantidadeAtual++;
        } else {
            System.out.println("Elevador lotado");
        }
    }

    /**
     * Sai: para remover uma pessoa do elevador (só deve remover se houver alguém
     * dentro dele);
     */
    public void sai() {
        if (this.quantidadeAtual > 0) {
            this.quantidadeAtual--;
        } else {
            System.out.println("Elevador vazio");
        }
    }

    /**
     * Sobe: para subir um andar (não deve subir se já estiver no último andar);
     */
    public void sobre() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Elevador no último andar!");
        }
    }

    /**
     * Desce: para descer um andar (não deve descer se já estiver no térreo);
     */
    public void desce(){
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Elevador já está no térreo!");
        }
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", capacidadeElevador=" + capacidadeElevador
                + ", quantidadeAtual=" + quantidadeAtual + ", totalAndares=" + totalAndares + "]";
    }
}
