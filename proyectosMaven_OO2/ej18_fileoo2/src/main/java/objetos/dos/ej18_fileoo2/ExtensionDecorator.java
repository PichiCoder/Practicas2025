package objetos.dos.ej18_fileoo2;

public class ExtensionDecorator extends FileDecorator {
	
	public ExtensionDecorator(File archivo) {
		super(archivo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return " ." + this.archivo.getExtension();
	}
}
