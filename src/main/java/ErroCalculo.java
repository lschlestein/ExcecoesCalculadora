public class ErroCalculo extends Exception{
    public ErroCalculo(double a, double b, String Message){
        super(Message);
        System.out.println("Exceção de Erro de Cálculo A:"+a+" B:"+b);
    }
}
