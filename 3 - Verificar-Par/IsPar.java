public class IsPar {
    public static int paridade(int x, int par) {
        if (x % 2 == 0) {
            par = 1;
            return par;
        } else {
            par = 0;
            return par;
        }
    }

    public static void print(int value) {
        if (value == 1) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void main(String[] args){
        int x = 10;
        int par = 0;

        par = paridade(x, par);

        print(par);
    }
}