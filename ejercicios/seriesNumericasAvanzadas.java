package ejercicios;

public class seriesNumericasAvanzadas {
    public static void serieNumericaDobleInversaI() {
        int x = 99;
        for (int y = 1; y <= 5; y++) {
            System.out.println(y);
            System.out.println(x);
            x--;
        }
    }
    public static void serieNumericaDobleInversaII() {
        for (int y = 1; y <= 5; y++) {
            System.out.println(y);
            System.out.println(100 - y);
        }
    }
    public static void serieFibonacci() {
        int x = 0;
        int y = 1;
        for (int i = 1; i < 6; i++) {
            System.out.println(x);
            System.out.println(y);
            x+=y;
            y+=x;
            
        }
    }
}
