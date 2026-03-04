public class PrimeiraCalculadora {
    public static int calculadora(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void ler(int resultado) {
        System.out.println(resultado);
    }

    public static void main(String[] args){
        int a = 3;
        int b = 5;

        int resultado = calculadora(a, b);
        ler(resultado);
    }

}