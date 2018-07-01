
 public final class Cachorro extends Mamifero {
	
	public void balancarRabo() {
		System.out.println("Rabo balançando.");
	}
	
	public void enterrarOsso(){
		System.out.println("Osso enterrado!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo ração.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Auau!");
	}

	@Override
	public void locomover() {
		System.out.println("Correndo.");;
	}
	
	
	

}
