import java.util.* ;
public class Ejercicio1{
	public static void main(String[] args) {
		int num1, num2, resultado;
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio1************");
		System.out.println("");
		System.out.println("Ingrese el primer numero");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scanner.nextInt();
		
		resultado = num1 + num2;
		System.out.println("El resultado de tu suma es: " + resultado);
	}
}