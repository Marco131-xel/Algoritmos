import java.util.* ;
public class Ejercicio11{
	public static void main(String[] args) {
		double cm, yd, in, m, ft;
		// cm son centimetros m son metros
		// yd son yardas in son pulgadas
		// ft son pies 
		Scanner scanner = new Scanner(System.in);

		// ingresar los dos numeros 
		System.out.println("");
		System.out.println("*********Ejercicio11************");
		System.out.println("");
		System.out.println("Ingrese la unidad en centimetros");
		cm = scanner.nextDouble();
		System.out.println("");

		// las conversiones 
		yd = (cm * 0.109361);
		in = (cm * 0.393701);
		m = (cm * 0.01);
		ft = (cm * 0.03280);

		// los resultados 
		System.out.println("La conversion de centimetros a yardas es: " + yd);
		System.out.println("La conversion de centimetros a pulgadas es: " + in);
		System.out.println("La conversion de centimetros a metros es: " + m);
		System.out.println("La conversion de centimetros a pies es: " + ft);
	}
}