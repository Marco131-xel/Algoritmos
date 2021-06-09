import java.util.* ;
public class Ejercicio14{
	public static void main(String[] args) {
		int num1, num2, resultado;
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio14************");
		System.out.println("");
		System.out.println("Ingrese el primer numero");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scanner.nextInt();

		//operaciones
		resultado = num1 / num2;
		if (resultado > 0){
			System.out.println("El segundo numero es divisible al primero");
		}
		else{
			System.out.println("No es divisible");
		}
		
	}
}