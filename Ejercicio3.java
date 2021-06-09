import java.util.* ;
public class Ejercicio3{
	public static void main(String[] args) {
		int num1, doble, triple;
		Scanner scanner = new Scanner(System.in);

		//ingresar el numero
		System.out.println("");
		System.out.println("*********Ejercicio3************");
		System.out.println("");
		System.out.println("Ingrese el numero a cambiar ");
		num1 = scanner.nextInt();

		doble = (2*num1);
		triple = (3*num1);

		System.out.println("El valor doble del numero es " + doble);
		System.out.println("El valor triple del numero es " + triple);

	}
}