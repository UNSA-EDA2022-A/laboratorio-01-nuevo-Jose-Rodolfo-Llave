package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		// TO DO
				int contador = 0;
		int salto = 50;
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if(a[i] == salto) {
					if((a[i] - salto) <= salto) {
						salto = 50 + a[i];
						contador++;
						i++;
					} else {
						return -1;
					}
				} else if (a[i] > salto) {
					if((a[i] - salto) <= salto) {
						salto = 50 + a[i-1];
						contador++;
						i--;
					} else {
						return -1;
					}
				}
				
			} else if(i == a.length - 1) {
				if(a[i] <= salto) {
						contador++;
					} else {
						return -1;
					}
				} 
			}
		return contador;
	}
}
