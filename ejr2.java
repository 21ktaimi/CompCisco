// Crear un programa, para el cual, dado el radio de una circunferencia calcule según lo que elija el usuario,
// la longitud de la misma, el área y el volumen de la esfera que determina.

import java.util.Scanner;

public class ejr2 {
    public static void main (String[] args) {
    
        int radio;

        int opcionSeleccionada;

        Scanner in = new Scanner(System.in);
   
        System.out.println("introduzca un el radio de la circunferencia");
        radio=in.nextInt();

        // vamos a crear el menu
        System.out.println("Menu a elegir");
        System.out.println("Ahora Eliga una de estas opciones");
        System.out.println("1.- Para calcular la longitud.");
        System.out.println("2.- Para calcular el Área.");
        System.out.println("3.- Para calcular el volumen de la esfera.");
        System.out.println("");
        opcionSeleccionada=in.nextInt();

  
        
            //Realizamos la opción seleccionada
        switch (opcionSeleccionada) {
            case 1:
                CalculoLongitud( radio);
                break;
            case 2:
                CalculoArea(radio);
                break;
            case 3:        
                CalculoVolumen(radio);
                break;
        }
    }
    
    public static void CalculoLongitud (int radio){

        double longitud;

        longitud= 2*3.14*radio;
        System.out.println("El resultado de la longitud es " + longitud);
    }



public static void CalculoArea (int radio){

        double area;

        area= 3.14*Math.pow(radio, 2);
        System.out.println("El resultado de la area es " + area);
    }

    public static void CalculoVolumen (int radio){

        double volumen;

        volumen= 1.33*3.14*Math.pow(radio, 3);
        System.out.println("El resultado de la volumen es " + volumen);
    }

}


