import java.util.* ;
public class Ejercicio10{
	public static void main(String[] args) {
		int b, h, perimetro, area;
		// b y h son las base y altura 
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio10************");
		System.out.println("");
		System.out.println("Ingrese la base del rectangulo");
		b = scanner.nextInt();
		System.out.println("Ingrese la altura del rectangulo");
		h = scanner.nextInt();
		
		// operaciones 
		perimetro = (2*b)+(2*h); 
		area = (b * h);
		// area y perimetro
		System.out.println("El Perimetro del rectangulo es: " + perimetro);
		System.out.println("El area del rectangulo es: " + area);
	}
}