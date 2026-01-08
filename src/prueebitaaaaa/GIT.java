/*
	Este programa filtra el número
	almacenado en la variable N y
	luego muestra su tabla de multiplicar.

	autor: Alejandro
	date: 24102025

*/

import java.util.Scanner;

public class GIT {

	public static void main ( String [] args ) {

	int N;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un número: ");
	N = teclado.nextInt();

	if (10>=N && N>=1)
		System.out.println("El número introducido es " + N);
	else
		System.out.println("Número mayor que 10 o menor que 1");

	System.out.println("Tabla de multiplicar de " + N);

	for (int multiplicador = 1; multiplicador <= 10; multiplicador++)

		System.out.println(N * multiplicador);

	}

}

