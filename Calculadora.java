/* Descripcion:
 * Programa calculadora que permita realizar operaciones aritmeticas con numeros enteros que proporcione el usuario
 * Entradas:
 * Numeros que el usuario digite
 * Salidas: 
 * Resultado de suma, resta, multiplicacion, division y modulo
 * Ejemplo: 
 * "Ingresa un numero" 2
 * "Ingresa otro numero" 4
 * "La suma de los numeros es, la resta es..."
 */
import java.util.Scanner;
public class Calculadora
{
	public static void main(String[] args) {

	System.out.println("Ingresa un numero");

	Scanner entrada = new Scanner(System.in);

	int Num1, Num2, suma_res, resta, multiplicacion, division, modulo;
	

	Num1=entrada.nextInt();

	System.out.println("Ingresa otro numero");

	Num2=entrada.nextInt();

	suma_res= suma(Num1,Num2);
	resta= restaa(Num1,Num2);
	division= Num1/Num2;
	multiplicacion= multi(Num1,Num2);
	modulo= Num1%Num2;

	System.out.println("La suma es " + suma_res);
	System.out.println("La resta es " + resta);	
	System.out.println("La division es " + division);
	System.out.println("La multiplicacion es " + multiplicacion);
	System.out.println("El modulo es " + modulo);
	}
	public static int suma(int num1, int num2){
		int res;
		res= num1+num2;
		return res;
	}
	public static int restaa(int num1, int num2){
		int resu;
		resu= num1-num2;
		return resu;
	}
	public static int multi(int num1, int num2){
		int resul;
		resul= num1*num2;
		return resul;
	}

}