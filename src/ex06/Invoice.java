package ex06;

public class Invoice {
    private int numeroItem;
    private String descricaoItem;
    private int qtdComprada;
    private float precoUnitario;

    public Invoice(int numeroItem, String descricaoItem, int qtdComprada, float precoUnitario) {

        if (qtdComprada < 0) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtdComprada;
        }

        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }

        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getInvoiceAmount() {
        return this.getQtdComprada() * this.getPrecoUnitario();
    }

}
