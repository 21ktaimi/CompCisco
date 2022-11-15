// Implementar en Java un método, que reciba 3 números enteros como entrada, 
// y a continuación devuelva cuál es el mayor de los 3 números con return. 
        import java.util.Scanner;

public class ejr1 {
    public static void main (String[] args) {
        int num1,num2,num3,resultado;

        Scanner in = new Scanner(System.in);
        System.out.println("introduzca un primer numero");
        num1=in.nextInt();

        System.out.println("introduzca un segundo numero");
        num2=in.nextInt();  

        System.out.println("introduzca un tercer numero");
        num3=in.nextInt();
        
		resultado = Grande(num1,num2,num3);
        System.out.println("El número mayor es " + resultado);
    }
    public static int Grande(int num1, int num2, int num3) {
        int resultado;
        if (num1 > num2) {
            if (num1 > num3) {
                resultado = num1;                                      
            } else {
                resultado = num3;    
            }
        } else if (num2 > num3) {
            resultado = num2;
        } else {
            resultado = num3;
        }
        return resultado;
    }
}