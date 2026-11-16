package reto1;

import java.util.Scanner;

import reto1.Funciones1;
import reto1.Funciones2;


public class Reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String opcionString="";
		int opcion = 9;
		int n1 = 0;
		int n2 = 0;
		int resultado = 0;
		boolean resultadoBool = false;
		
		
		do {
			opcionString="";
			n1 = 0;
			n2 = 0;
			resultado = 0;
			resultadoBool = false;
			
			System.out.println("Elige la operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			
			
			opcionString = sc.nextLine();
			if(opcionString.length()==1 && Character.isDigit(opcionString.charAt(0)) ) {
				opcion = Integer.parseInt(opcionString);
			}
			else {
				opcion = 9;
			}
			
			if (opcion == 0) {
				System.out.println("Fin del programa");
				}
			else if(opcion>=1&&opcion<=4) {
				System.out.println("Introduce el primer número");
				n1 = sc.nextInt();
				System.out.println("Introduce el segundo número");
				n2 = sc.nextInt();
			}
			else if (opcion>=5&&opcion<=8){
				System.out.println("Introduce el número");
				n1 = sc.nextInt();
			}
			else {
				System.out.println("Orden no válida");
			}
			
			switch (opcion) {
			case 1:
				resultado = Funciones1.sumar(n1, n2);
				System.out.println("La suma es "+resultado);
				break;
			case 2:
				resultado = Funciones1.restar(n1, n2);
				System.out.println("La resta es "+resultado);
				
				break;
			case 3:
				resultado = Funciones2.multiplicar(n1, n2);
				System.out.println("La multiplicación es "+resultado);
				
				break;
			case 4:
				if (n2==0) {
					System.out.println("No se puede dividir entre 0");
				}
				else {
					resultado = Funciones2.dividir(n1, n2);
					System.out.println("La división es "+resultado);
				}
				
				break;
			case 5:
				resultadoBool = Funciones1.esPar(n1);
				System.out.println("Es par? "+resultadoBool);
				
				break;
			case 6:
				resultadoBool =Funciones1.esImpar(n1);
				System.out.println("Es impar? "+resultadoBool);
				
				break;
			case 7:
				resultadoBool =Funciones2.esPositivo(n1);
				System.out.println("Es positivo? "+resultadoBool);
				
				break;
			case 8:
				resultadoBool =Funciones2.esNegativo(n1);
				System.out.println("Es negativo? "+resultadoBool);
				
				break;
	
			default:
				break;
				
				}
			} while (opcion !=0);
		
		}

}
