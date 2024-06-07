public class Soma extends Operacao {
    public Soma(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calcular() {
        resultado = a + b;
        return resultado;
    }
}
