package ejercicios;

import java.util.Scanner;

public class scannerStrings {
    public static void extraerParteDeUnaCadena() {
        String cadenaOriginal, cadenaFinal;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime una frase:");
        cadenaOriginal = in.nextLine();
        int posicionInicial = 0, posicionFinal = cadenaOriginal.length();

        System.out.println("Dime de donde a donde quieres cortar tu frase");
        System.out.println("Posicion inicial:");
        try {
            posicionInicial = in.nextInt();
        } catch (Exception e) {}
        in.nextLine();
        System.out.println("Posicion final:");
        
        try {
            posicionFinal = in.nextInt();
        } catch (Exception e) {}
        
        if (posicionInicial < 0) {
            posicionInicial = 0;
        }
        if (posicionFinal > cadenaOriginal.length()) {
            posicionFinal = cadenaOriginal.length();
        }
        if (posicionInicial < posicionFinal) {
            cadenaFinal = cadenaOriginal.substring(posicionInicial, posicionFinal);
            System.out.println(cadenaFinal);
        } else if (posicionInicial >= posicionFinal) {
            System.out.println("La posicion inicial no puede ser mayor o igual a la posicion final");
        } else {
            System.out.println("Ha ocurrido un error");
        }
        in.close();
    }
}
