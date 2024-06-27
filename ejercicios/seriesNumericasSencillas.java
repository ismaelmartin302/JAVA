package ejercicios;

public class seriesNumericasSencillas {
    public static void serieNumericaFor () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void serieNumericaWhile () {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void serieNumericaDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
