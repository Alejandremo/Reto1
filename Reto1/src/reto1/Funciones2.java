package reto1;


public class Funciones2 {

		public static int multiplicar(int a, int b) {
			return a*b;
}	

		public static int dividir(int a, int b) {
			if (b == 0) {
					System.out.println("No se puede dividir entre 0");
	}
			return a / b;
}

		public static boolean esPositivo(int n) {
			return n >= 0;
		}
		
		public static boolean esNegativo(int n) {
			return n < 0;
		}
}
