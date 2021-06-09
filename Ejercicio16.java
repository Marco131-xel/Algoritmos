import java.util.* ;
public class Ejercicio16{
	public static void main(String [] args){
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		//pedir numeros 
		System.out.println("");
		System.out.println("*********Ejercicio16************");
		System.out.println("");
		System.out.println("Ingrese el primer numero");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scanner.nextInt();
		System.out.println("Ingrese el tercer numero");
		num3 = scanner.nextInt();
		// comparar numeros 

		if(num1 > num2){
			if (num1 > num3){
				System.out.println("El primer numero ingresado es el mayor");
			}
			else{
				System.out.println("El tercer numero ingresado es el mayor");
			}
		}
		else{
			if (num2 > num3){
				System.out.println("El Segundo numero ingresado es el mayor");
			}
			else{
				System.out.println("El tercer numero ingresado es el mayor");
			}
		}
	}
}

		
			
		