
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa k = new Pessoa();
		Livro q = new Livro();
		
		k.setNome("Kelvyn");
		k.setIdade(20);
		k.setCpf("70260277436");
		
		
		q.setTitulo("Fundamentos da matem�tica elementar");
		q.setAutor("Iezzi");
		q.setTotPaginas(120);
		q.setLeitor(k);
		
		q.detalhes();
		q.abrir();
		q.voltarPag();
		q.avan�arPag();
		q.avan�arPag();
		q.avan�arPag();
		q.detalhes();
		q.folhear();
		
		
		
	}

}
