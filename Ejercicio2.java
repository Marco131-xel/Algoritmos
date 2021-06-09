import java.util.* ;
public class Ejercicio2{
	public static void main(String[] args) {
		String pais, capital;
		Scanner scanner = new Scanner(System.in);

        //se colocan los datos del lugar 
        System.out.println("");
		System.out.println("*********Ejercicio2************");
		System.out.println("");
		System.out.println("Ingrese el nombre del pais");
		pais = scanner.nextLine();
		System.out.println("Ingrese el nombre de la capital");
		capital = scanner.nextLine();
		
		System.out.println(capital + " es la capital de " + pais);
	}
}