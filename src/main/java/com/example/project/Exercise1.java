package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		// TO DO
		if(validar(a) == true) {
			int [] num = guardarDigitos(a);
			int suma = 0;
			for (int i = 0; i < num.length; i++) {
				suma = suma + (num[i] * ((int)Math.pow(2, i+1) - 1));
			}
			String convertido = String.valueOf(suma);
			return convertido;
		}
		return "El numero proporcionado no esta en base Gabriel.";
	}
	
	static int cantidadDigitos(int x) {
		int contador = 0, modulo;
		while(x > 0) {
			modulo = x % 10;
			x = x / 10;
			contador++;
			}
		return contador;
		}
	
	static int [] guardarDigitos(int x) {
		int [] digitos = new int [cantidadDigitos(x)];
		int modulo, posicion = 0;
		while(x > 0) {
			modulo = x % 10;
			x = x / 10;
			digitos[posicion] = modulo;
			posicion++;
		}
		return digitos;
	}
	
	static boolean validar(int x) {
		int [] digitos = guardarDigitos(x);
		for (int i = 0; i < digitos.length; i++) {
			if (i == 0) {
				if (digitos[i] > 1) {
					return false;
				}
			} else if ( i == 1) {
				if (digitos[i] >= 2 && digitos[i-1] == 1) {
					return false;
				}
			} else if(i > 1) {
				if(digitos[i] > 1) {
					return false;
				}
			}
		}
		return true;
	}
}
