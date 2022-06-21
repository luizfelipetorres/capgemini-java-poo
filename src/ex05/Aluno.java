package ex05;

public class Aluno {
    private String matricula;
    private String nome;
    private float notaP1;
    private float notaP2;
    private float notaT1;

    public Aluno(String matricula, String nome, float notaP1, float notaP2, float notaT1) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaT1 = notaT1;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", notaP1=" + notaP1 + ", notaP2=" + notaP2
                + ", notaT1=" + notaT1 + "]";
    }

    /*
     * media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
     * tem peso 2)
     * 
     */
    public float media() {
        float media = (this.notaP1 + this.notaP2) * 2.5f; // Nota provas
        media += (this.notaT1 * 2f); // + Nota trabalho
        media /= 7f; // Dividindo
        return media;
    }

    /*
     * final: calcula quanto o aluno precisa para a prova final (retorna zero se ele
     * não for para a final)
     */
    public float notaFinal() {
        float media = this.media();
        if (media < 5f) {
            float falta = 5f - media;
            return falta;
        }
        return 0;
    }
}
