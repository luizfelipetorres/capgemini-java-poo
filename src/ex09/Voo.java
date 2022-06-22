package ex09;
import ex08.Data;

public class Voo {
    private int assentosLivres;
    private int[] assentos;
    private String numeroVoo;
    private Data data;

    public Voo(String numeroVoo, Data data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.assentosLivres = 100;
        this.assentos = new int[100];
    }

    @Override
    public String toString() {
        return "Voo [data=" + data + ",assentosLivres=" + assentosLivres + ", numeroVoo=" + numeroVoo + ", assentos="
                + assentos + "]";
    }

    public int proximoLivre() {
        if (this.assentosLivres == 0) {
            return 0;
        }

        for (int i = 0; i < 100; i++) {
            if (this.assentos[i] == 0) {
                return i + 1;
            }
        }
        return 0;
    }

    /* Retorna 1 se estiver vázio, 0 se estiver ocupado e -1 se valor inválido */
    public int isVazio(int assento) {
        if (assento < 1 || assento > 100) {
            return -1;
        }
        if (this.assentos[assento - 1] == 0) {
            return 1;
        }
        return 0;
    }

    /*
     * Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como
     * parâmetro, e retorna verdadeiro se a cadeira ainda não estiver ocupada
     * (operação foi bem sucedida) e falso caso contrário
     */
    public boolean ocupa(int assento) {
        if (this.assentosLivres == 0) {
            System.out.println("Avião lotado!");
            return false;
        }
        
        if (isVazio(assento) == 1) {
            this.assentos[assento - 1] = 1;
            this.assentosLivres--;
            System.out.printf("Assento %d populado!\n", assento);
            return true;
        }
        return false;
    }

    public String getVoo() {
        return this.numeroVoo;
    }

}
