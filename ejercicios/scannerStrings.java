package ejercicios;

import java.util.Scanner;

public class scannerStrings {
    public static void extraerParteDeUnaCadena() {
        String cadenaOriginal, cadenaFinal;
        int posicionInicial, posicionFinal;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime una frase:");
        cadenaOriginal = in.nextLine();

        System.out.println("Dime de donde a donde quieres cortar tu frase");
        System.out.println("Posicion inicial:");
        posicionInicial = in.nextInt();
        System.out.println("Posicion final:");
        posicionFinal = in.nextInt();
        
        cadenaFinal = cadenaOriginal.substring(posicionInicial, posicionFinal);
        System.out.println(cadenaFinal);
        in.close();
    }
}
