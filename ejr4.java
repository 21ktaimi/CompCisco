/* Realizar un método que tenga como parámetro de entrada dos cadenas, 
y muestre por pantalla, la concatenación de ambas cadenas.*/ 
import java.util.Scanner;

public class ejr4 {
    public static void main (String[] args) {

        String cadena1, cadena2, ola;

        Scanner in = new Scanner(System.in);

        System.out.println("inroduce una palabra");
        cadena1= in.nextLine();

        System.out.println("inroduce una segunda palabra");
        cadena2= in.nextLine();

        ola = palabras( cadena1,  cadena2 );
        System.out.println(ola);    
    }

    public static String palabras (String cadena1, String cadena2){
        String juntarPalabras;

        System.out.println("vamos a juntar las 2 palabras introducidas");
        juntarPalabras= cadena1+cadena2;

        return juntarPalabras;
    }

}