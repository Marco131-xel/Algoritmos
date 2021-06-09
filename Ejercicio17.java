import java.util.* ;
public class Ejercicio17{
	public static void main(String[] args) {
		int l1, l2, l3;
		Scanner scanner = new Scanner(System.in);
		//pedir numeros 
		System.out.println("");
		System.out.println("*********Ejercicio17************");
		System.out.println("");
		System.out.println("Ingrese el primer lado del triangulo");
		l1 = scanner.nextInt();
		System.out.println("Ingrese el segundo lado del triangulo");
		l2 = scanner.nextInt();
		System.out.println("Ingrese el tercer lado del triangulo");
		l3 = scanner.nextInt();

		// comparacion de triangulos 
		if (l1 == l2){
			if (l1 == l3){
				System.out.println("Es un triangulo equilatero");
			}
			else{
				System.out.println("Es un triangulo isosceles");
			}
			
		}
		else{
			System.out.println("Es un triangulo escaleno");

		}
	}
}