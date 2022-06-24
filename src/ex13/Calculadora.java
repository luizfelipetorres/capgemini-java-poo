package ex13;

public class Calculadora {
    public float soma (float n1, float n2){
        float r = n1 + n2;
        return r;
    }

    public float subtracao(float n1, float n2){
        float r = n1 - n2;
        return r;
    }

    public float multiplicacao(float n1, float n2){
        float r = n1 * n2;
        return r;
    }

    public float divisao(float n1, float n2){
        if (n2 == 0){
            System.out.println("Divisão por zero não é possível!");
            return 0;
        }
        float r = n1 / n2;
        return r;
    }
}
