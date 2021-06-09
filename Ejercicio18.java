import java.util.* ;
public class Ejercicio18{
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("*********Ejercicio18************");
		System.out.println("");

		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese un numero");
        int n = reader.nextInt();
        int d = Integer.toString(n).length();
        int t = 0;
        
        // suma de los digitos 
        if(d>=5){
        	for(int i = 0; i < d; i++){
        		String num = String.valueOf(Integer.toString(n).charAt(i));
                t+=Integer.parseInt(num);
        	}
        }
        else{
        	System.out.println("Ingrese un numero con mas digitos");
        }
        System.out.println("La suma de los digitos es: " +t);
        
        
	}
}