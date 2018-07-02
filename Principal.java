
public class Principal {

	public static void main(String[] args) {
		
		Garfanhoto g[] = new Garfanhoto[5];
		Video v[] = new Video[5];
		Visualizacao vis[] = new Visualizacao[3];
		
		g[0] = new Garfanhoto("Kelvyn", 20,"M", "Kj");
		v[0] = new Video("Bastardos inglórios");
		v[1] = new Video("Auto da Compadecida");
		
		vis[0] = new Visualizacao(g[0],v[0]);
		v[0].setAvalicao(5);
		System.out.println(vis[0].toString());
		vis[1] = new Visualizacao(g[0],v[0]);
		vis[2] = new Visualizacao(g[0],v[0]);
		v[0].setAvalicao(3);
		System.out.println(vis[2].toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
