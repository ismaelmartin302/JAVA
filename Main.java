
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Integer x = 0, y = 0, resultado = null;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("X= ");
        x = myScanner.nextInt();
        System.out.println("Y= ");
        y = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Operación? ");
        String operacion = myScanner.nextLine().toLowerCase();
        switch (operacion) {
            case "suma":
                resultado = main.suma(x, y);
                break;
            case "resta":
                resultado = main.resta(x, y);
                break;
            case "multiplicacion":
                resultado = main.multiplicacion(x, y);
                break;
            case "division":
                resultado = main.division(x, y);
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
        myScanner.close();

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