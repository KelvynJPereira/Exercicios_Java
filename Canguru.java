
 public final class Canguru extends Mamifero{
	
	public void usarBolsa() {
		System.out.println("Usando bolsa.");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo plantas.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Masupieia");
	}

	@Override
	public String getCorPelo() {
		// TODO Auto-generated method stub
		return super.getCorPelo();
	}

	@Override
	public void setCorPelo(String corPelo) {
		// TODO Auto-generated method stub
		super.setCorPelo(corPelo);
	}
	
	

}
