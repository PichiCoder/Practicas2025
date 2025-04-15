package objetos.dos.ej7Patrones;

public class Sumando extends Estado{

	@Override
	public void handleSetValor(double unValor, Calculadora c) {
		c.setValorAcumulado(c.getValorAcumulado() + unValor);
		c.setEstado(new Inicial());
	}

}
