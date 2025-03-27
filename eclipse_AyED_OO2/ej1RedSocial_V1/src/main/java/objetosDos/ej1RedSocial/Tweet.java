package objetosDos.ej1RedSocial;

public class Tweet {
	private String body;
	private Tweet origin;
	
	//Algo que nunca hicimos: se podria controlar el body length en el constructor ?
	//Es buena practica usar de esta forma los constructores ?
	public Tweet (String body) {
		this.body = body;
	}
	
	public Tweet (Tweet origin) {
		this.origin = origin;
	}

	public String getBody() {
		return body;
	}

	public Tweet getOrigin() {
		return origin;
	}

}
