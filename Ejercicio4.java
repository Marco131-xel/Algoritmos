import java.util.* ;
public class Ejercicio4{
	public static void main(String[] args) {
		int num1, cuadrado, cubo;
		Scanner scanner = new Scanner(System.in);

		//ingresar datos a elevar
		System.out.println("");
		System.out.println("*********Ejercicio4************");
		System.out.println("");
		System.out.println("Ingrese un numero");
		num1 = scanner.nextInt();

		//num1 a elevarse
		cuadrado = num1 * num1 ;
		cubo = num1 * num1 * num1;

		System.out.println("El cuadrado de " + num1 + " es " + cuadrado);
		System.out.println("El cubo de " + num1 + " es " + cubo);
	}
}