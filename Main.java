
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("X= ");
        String x = myScanner.nextLine();
        System.out.println("Y= ");
        String y = myScanner.nextLine();
        Integer xInteger = Integer.valueOf(x);
        Integer yInteger = Integer.valueOf(y);
        int resultado = main.suma(xInteger, yInteger);
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
