package Ejemplo.ParqueWait;

public class Persona extends Thread{
	
	private Parque parque;
	
	public Persona(int id, Parque parque) {
		
		super("Persona " + id);
		
		this.parque = parque;
		
	}
	
	
	
	@Override
	public void run() {
		
		try {
			
			System.out.println(getName() + " pasea por el parque");
			
			Thread.sleep((long) (Math.random() * 2000 + 1000)); // tiempo paseando
			
			System.out.println(getName() + " llega al banco");
			
			parque.sentarse();
			
			System.out.println(getName() + " se ha sentado");
			
			Thread.sleep((long) (Math.random() * 500)); // tiempo sentada
			
			parque.levantarse();
			
			System.out.println(getName() + " se ha levantado");
			
		} catch (InterruptedException e) {
			
		}
		
	}

}
