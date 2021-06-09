import java.util.* ;
public class Ejercicio13{
	public static void main(String[] args) {
		double radio, altura, volumen;
		double PI = 3.1416;
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio13************");
		System.out.println("");
		System.out.println("Ingrese el radio");
		radio = scanner.nextInt();
		System.out.println("Ingrese la altura");
		altura = scanner.nextInt();

		if (radio + altura > 0){
			volumen = PI * radio * radio * altura;
			System.out.println("El volumen es: " + volumen);
		}
		else{
			System.out.println("ingresar datos positivos");
		}

		
	}
}