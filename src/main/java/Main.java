import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) throws ErroCalculo {
        while (!leParametros())
            trataExcecoes();

        Soma soma = new Soma(a, b);
        System.out.print("\nResultado " + soma.getClass().getName() + " " + soma.calcular());
        Subtracao subtracao = new Subtracao(a, b);
        System.out.print("\nResultado " + subtracao.getClass().getName() + " " + subtracao.calcular());
    }

    public static boolean leParametros() {
        boolean eValido = true;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Insira os valores:");
            a = Double.parseDouble(sc.nextLine());
            b = Double.parseDouble(sc.nextLine());
            if (a == 0 && b == 0)
                throw new ErroCalculo(a, b, "Os parametros dos valores não devem ser igual a 0");
        } catch (NumberFormatException nfe) {
            System.out.println("Você inseriu um valor inválido! " + nfe.getMessage());
            eValido = false;
        } catch (NoSuchElementException nsef) {
            System.out.println("Entrada inválida" + nsef.getMessage());
            eValido = false;
        } catch (ErroCalculo e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            eValido = false;
            a=1;
            b=1;
        }
        return eValido;
    }

    public static void trataExcecoes() throws ErroCalculo {
        try {
            if (a == 0 && b == 0)
                throw new ErroCalculo(a, b, "Os parametros não devem ser igual a 0");

        } catch (Exception e) {
            System.out.println(e + "\nInsira valores diferentedes de 0");
        }
    }
}
