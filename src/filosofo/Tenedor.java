package filosofo;

import java.util.concurrent.Semaphore;

public class Tenedor {
	private int id;
	private Semaphore t = new Semaphore(1); //estado del tenedor 
	
	public Tenedor(int id) {
		this.id= id;		
	}

	public void cogeTenedor(int filosofo) throws InterruptedException
	{
		t.acquire();
		System.out.println("filosofo.Filosofo "+filosofo+" coge tenedor "+id);
	}
	
	public void sueltaTenedor(int filosofo) {
		System.out.println("filosofo.Filosofo "+filosofo+" suelta tenedor "+id);
		t.release();
	}
}
