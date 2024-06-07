public class Subtracao extends Operacao {
    public Subtracao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calcular() {
        resultado = a - b;
        return resultado;
    }
}
