import java.util.* ;
public class Ejercicio12{
	public static void main(String[] args) {
		int c, f;
		// donde c es celcius y f fahreneheit
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio12************");
		System.out.println("");
		System.out.println("Ingrese la Temperatura en Celcius");
		c = scanner.nextInt();

		// la conversion de grados 
		f = (9 / 5 * c) + 32;

		System.out.println("La Temperatura en Fahrenheit es: " + f);
		
	}
}