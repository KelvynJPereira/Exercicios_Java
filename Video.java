
public class Video implements AcoesVideo{
	
	private String titulo;
	private int avalicao, views, curtidas;
	private boolean reproduzindo;
	
	
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avalicao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
		
	}
	
	
	@Override
	public void play() {
		if(this.reproduzindo) {
			System.out.println("O vídeo já está sendo reproduzido!.");
		}else{
			System.out.println("Play.");
			this.reproduzindo = true;
		}
		
	}
	@Override
	public void pause() {
		if(this.reproduzindo) {
			this.reproduzindo = false;
			System.out.println("Pause.");
		}else{
			System.out.println("O vídeo já está pausado!");
		}
		
		
	}
	@Override
	public void like() {
		this.curtidas++;
		System.out.println("Like");
		
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvalicao() {
		return avalicao;
	}
	public void setAvalicao(int ava) {
		int nova;
		nova = (this.avalicao + ava)/this.views;
		this.avalicao = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}


	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avalicao=" + avalicao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
	
	

}
