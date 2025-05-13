package objetos.dos.ej18_fileoo2;

public class NombreDecorator extends FileDecorator {

	public NombreDecorator(File archivo) {
		super(archivo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.prettyPrint() + this.archivo.getNombre(); // ultimo cambio
	}
}
