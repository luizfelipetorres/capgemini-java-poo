package ex10;
import ex08.Data;

public class Jogador {
    public enum Posicao {
        ATAQUE,
        DEFESA,
        MEIO_CAMPO
    };

    private String nome;

    private Posicao posicao;
    private Data nascimento;
    private float altura;
    private float peso;

    public int getTempoAposentadoria(){
        int anos;
        switch (this.posicao) {
            case ATAQUE:
                anos =  35 - getIdade(); 
                break;
        
            case DEFESA:
                anos =  40 - getIdade();
                break;
        
            case MEIO_CAMPO:                
                anos = 38 - getIdade();
                break;
            default:
                anos = 0;
        }
        if (anos<0){
            anos = 0;
        }
        return anos;
    }

    public int getIdade() {
        Data hoje = new Data(22, 6, 2022);
        int idade = hoje.getAno() - getNascimento().getAno();
        if (getNascimento().getMes() > hoje.getMes()) {
            return --idade;
        } else if (getNascimento().getMes() == hoje.getMes()) {
            if (getNascimento().getDia() > hoje.getDia())
                return --idade;
        }
        return idade;

    }

    public Jogador(String nome, Posicao posicao, Data nascimento, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jogador [altura=" + altura + ", nascimento=" + nascimento + ", nome=" + nome + ", peso=" + peso
                + ", posicao=" + posicao + "]";
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
