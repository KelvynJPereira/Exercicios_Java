
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa k = new Pessoa();
		Livro q = new Livro();
		
		k.setNome("Kelvyn");
		k.setIdade(20);
		k.setCpf("70260277436");
		
		
		q.setTitulo("Fundamentos da matemática elementar");
		q.setAutor("Iezzi");
		q.setTotPaginas(120);
		q.setLeitor(k);
		
		q.detalhes();
		q.abrir();
		q.voltarPag();
		q.avançarPag();
		q.avançarPag();
		q.avançarPag();
		q.detalhes();
		q.folhear();
		
		
		
	}

}
