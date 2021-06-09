import java.util.Scanner;

public class Ejercicio20{

    public static void main(String[] args) {
        int numero, contador, inicio = 0, digito;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("*********Ejercicio20************");
        System.out.println("");
        do {
            System.out.print("Introduce un numero de 5 digitos: ");                                                 
            numero = scanner.nextInt();
        } while (numero < 10);
       
        //le damos la vuelta al número
        contador = numero;
        while (contador!=0){
            digito = contador % 10;
            inicio = inicio * 10 + digito;
            contador = contador / 10;
        }
    
        if(numero == inicio){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}