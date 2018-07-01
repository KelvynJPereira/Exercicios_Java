
public class Peixe extends Animal {
	
	private String corEscama;
	
	public void soltaBolha(){
		System.out.println("Peixe soltou bolha.");
		
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando.");
		
	}



	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncia.");
		
	}


	
	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som.");
		
	}



	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
