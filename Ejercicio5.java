import java.util.* ;
public class Ejercicio5{
	public static void main(String[] args) {
		int num1, mas;
		Scanner scanner = new Scanner(System.in);
		//ingresar el numero
		System.out.println("");
		System.out.println("*********Ejercicio5************");
		System.out.println("");
		System.out.println("Ingrese un numero");
		num1 = scanner.nextInt();

		mas = num1 + 1;
		// lo que sigue despues de num1
		System.out.println("El numero que sigue de " + num1 + " es " + mas);
	}

}