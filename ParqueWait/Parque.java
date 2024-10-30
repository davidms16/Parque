package Ejemplo.ParqueWait;



public class Parque {

	private int contador;
	
	private int plazas;
	
	public Parque(int plazas) {
		
		this.plazas = plazas;
		
	}
	
	public synchronized void sentarse() {
		
		while (contador >= plazas) {
			
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		try {
			
			Thread.sleep((long) (Math.random() * 700 - 100) + 100 );
			
			notifyAll();
			
			contador++;
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	
	public synchronized void levantarse() {
		
		notifyAll();
		
		contador--;
		
	}
	
}

