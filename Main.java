
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("X= ");
        int x = myScanner.nextInt();
        System.out.println("Y= ");
        int y = myScanner.nextInt();
        int resultado = main.suma(x, y);
        System.err.println(resultado);
        
    }

    private int suma(int x, int y) {
        return x + y;
    }
    public int resta(int x, int y) {
        return x - y;
    }
    public int multiplicacion(int x, int y) {
        return x * y;
    }
    public int division(int x, int y) {
        return x / y;
    }

}
