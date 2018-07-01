
public class Ave extends Animal{
	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Pass�ro faz ninho.");
		
	}
	

	@Override
	public void locomover() {
		System.out.println("Voando.");
	}



	@Override
	public void alimentar() {
		System.out.println("Comendo minhoca.");
	}



	@Override
	public void emitirSom() {
		System.out.println("Cantando.");
	}



	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	
}
