package objetosDos.ej1RedSocial;

public class ReTweet implements Publicacion {
	
	private Tweet twOrigen; 
	
	public ReTweet (Tweet t) {
		this.twOrigen = t;
	}

	public Tweet getTwOrigen() {
		return twOrigen;
	}
	
	@Override
	public boolean equals(Object t) {
		return twOrigen == t;
	}
}
