import java.util.Random;

public class Livro implements Publicacao {
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public void detalhes() {
		System.out.println("- - - D E T A L H E S - - -");
		System.out.println("T�tulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de p�ginas: " + this.getTotPaginas());
		System.out.println("O livro est� aberto? "+this.getAberto());
		System.out.println(this.aberto?"P�gina atual: " + this.pagAtual:"P�gina atual: Capa");
		System.out.println("- - - L E I T O R - - -");
		System.out.println("Leitor: "+this.getLeitor().getNome());
		System.out.println("Idade: "+this.getLeitor().getIdade());
		System.out.println("CPF: " + this.getLeitor().getCpf());
		System.out.println("- - - - - - - - - - - - -");
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		System.out.println("O livro foi aberto!");
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		System.out.println("O livro foi fechado!");
	}

	@Override
	public void folhear() {
		Random aleatorio = new Random();
		int folhaAleatoria = aleatorio.nextInt(this.getTotPaginas());
		System.out.println("P�gina folheada!");
		System.out.println("P�gina atual: " + folhaAleatoria);
		
	}

	@Override
	public void avan�arPag() {
		if (this.getAberto()) {
			if(this.pagAtual < this.totPaginas) {
				this.setPagAtual(this.getPagAtual()+1);
				System.out.println("Pagina atual: " +this.getPagAtual());
			}else{
				System.out.println("Voc� chegou ao fim do livro");
			}
		}else{
			System.out.println("Abra o livro primeiro!");
		}

	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			if(this.pagAtual >= 1) {
				this.setPagAtual(this.getPagAtual()-1);
				System.out.println("Pagina atual: " +this.getPagAtual());
			}else{
				System.out.println("Voc� est� no inicio do livro");
			}
		}else{
			System.out.println("Abra o livro primeiro!");
		}
		
	}
	

}
