import java.util.* ;
public class Ejercicio19{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = (int)(Math.random()*1000+1);
		System.out.println("");
		System.out.println("*********Ejercicio19************");
		System.out.println("");
		System.out.println("El numero aleatorio es " + numero);

		//debe ser el multiplo
		if (numero < 25){
			if (numero % 5 == 0){
				System.out.println("Correcto");
			}
			else{
			}	
		}
		else{
			System.out.println("El numero " + numero + " es mayor a 25 y/o no es divisible entre 5");
		}
		
	}
}