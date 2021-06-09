import java.util.* ;
public class Ejercicio15{
	public static void main(String [] args){
		int numero;
		Scanner scanner = new Scanner(System.in);

		//pedir el numero
		System.out.println("");
		System.out.println("*********Ejercicio15************");
		System.out.println("");
		System.out.println("Ingrese un numero");
		numero = scanner.nextInt();
	
		// comparar numeros 

		if (numero == 0){
			System.out.println("El numero es nulo");
		}
		else{
			if (numero > 0){
				System.out.println("El numero es positivo");
			}
			else{
				System.out.println("El numero es negativo");
			}
		}
	}
}


