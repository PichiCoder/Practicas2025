package objetosDos.ej1RedSocial;

public class Tweet implements Publicacion{
	private String body;
	
	public Tweet (String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
	
	@Override
	public boolean equals(Object t) {
		return this == t;
	}
	
	public boolean isBodyLengthOk () {
		return (body.length() >= 1 && body.length() <= 280);
	}

}
