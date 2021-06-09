import java.util.* ;
public class Ejercicio7{
	public static void main(String[] args) {
		double dismi;
		int numero = (int)(Math.random()*50+10);
		System.out.println("");
		System.out.println("*********Ejercicio7************");
		System.out.println("");
		System.out.println("El numero aleatorio es " + numero);

		dismi = numero - (numero * 0.15);

		System.out.println("El numero " + numero + " disminuido al 15% es " + dismi);
		
	}
}