// Diseñar un programa que nos permita calcular áreas y volúmenes de distintas figuras geométricas, 
// como conos, pirámides y cilindros, según elija el usuario.

import java.util.Scanner;

public class ejr3 {
    public static void main (String[] args) {

        int radio;

        int opcionSeleccionada;

        Scanner in = new Scanner(System.in);
   
        

        // vamos a crear el menu
        System.out.println("Menu a elegir");
        System.out.println("Ahora Eliga una de estas opciones");
        System.out.println("1 Para calcular la longitud.");
        System.out.println("2 Para calcular el Área.");
        System.out.println("3 Para calcular el volumen de la esfera.");
        System.out.println("");
        opcionSeleccionada=in.nextInt();
        
        System.out.println("introduzca un el radio de la circunferencia");
        radio=in.nextInt();
        
    }

}
