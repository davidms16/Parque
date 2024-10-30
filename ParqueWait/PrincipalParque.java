package Ejemplo.ParqueWait;

import java.util.Scanner;

public class PrincipalParque {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir numero de personas");
		
		int personas = s.nextInt();
		
		System.out.println("Introducir numero de plazas");
		
		int plazas = s.nextInt();
		
		Parque parque = new Parque(plazas);
		
		
		
		Thread[]hilos = new Thread[personas];
		
		
		
		for (int i = 0; i < hilos.length; i++) {
			
			hilos[i] = new Persona((i + i) , parque);
			
			hilos[i].start();
			
		}
		
		for (int i = 0; i < hilos.length; i++) {
			
			try {
				
				hilos[i].join();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}
