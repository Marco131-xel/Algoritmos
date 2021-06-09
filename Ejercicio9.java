import java.util.* ;
public class Ejercicio9{
	public static void main(String[] args) {
		String p1, p2, a, b ;
		// p1 y p2 son las palabras
		// a y b son los cambios que se haran 
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("*********Ejercicio9************");
		System.out.println("");
		System.out.println("Ingrese la primera palabra");
		p1 = scanner.nextLine();
		System.out.println("Ingrese la segunda palabra");
		p2 = scanner.nextLine();
		
		a = p1;
		b = p2;
		// cambios de palabras 
		System.out.println("La primera palabra ahora es " + b);
		System.out.println("La segunda palabra ahora es " + a);

	}
}