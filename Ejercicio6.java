import java.util.* ;
public class Ejercicio6{
	public static void main(String[] args) {
		double aumento;
		int numero = (int)(Math.random()*200);
		System.out.println("");
		System.out.println("*********Ejercicio6************");
		System.out.println("");
		System.out.println("El numero aleatorio es " + numero);

		aumento = numero + (numero * 0.30);

		System.out.println("El numero " + numero + " aumentado al 30% es " + aumento);
	}
}