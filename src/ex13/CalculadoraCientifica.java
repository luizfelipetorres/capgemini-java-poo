package ex13;


public class CalculadoraCientifica extends Calculadora {
    public float potencia(float n1, float n2) {
        float r = n1;

        if (n2 == 0) {
            return 1;
        } else if (n2 >= 1) {
            for (int i = 1; i < n2; i++) {
                r *= n1;
            }
            return r;

        }else if(n2 > 0){
            for (int i = 1; i < n2; i /= n2) {
                r /= n1;
            }
            return r;
        } else {
            n2 *= -1;
            for (int i = 1; i < n2; i++) {
                r *= n1;
            }
            return 1f / r;
        }
    }

    public double raizQuadrada(float n1, int n2) {
        double r;
        r = Math.pow(n1, 1f/n2); 
        return r;
    }
}
