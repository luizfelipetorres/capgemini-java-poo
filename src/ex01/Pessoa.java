package ex01;

/**
 * Pessoa
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private float altura;

    public Pessoa(String nome, String dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", dataNascimento=" + dataNascimento + ", nome=" + nome + "]";
    }

}