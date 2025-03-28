package objetosDos.ejerciciosRefactoring;

public class Ejercicio2_1 {
	
	public abstract class Empleado{
	    private String nombre;
	    private String apellido;
	    private double sueldoBasico = 0;

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public double getSueldoBasico() {
	        return sueldoBasico;
	    }

	    public abstract double montoPorHsTrabajadas();

	    public abstract double montoPorCantidadDeHijos();

	    public abstract double descuento();

	    public double sueldo() {
	        return this.getSueldoBasico()
	        + this.montoPorHsTrabajadas()
	        + this.montoPorCantidadDeHijos()
	        - this.descuento();
	    }
	}

	public class EmpleadoTemporario extends Empleado {
	    private double horasTrabajadas = 0;
	    private int cantidadHijos = 0;

	    // ......

	    public double montoPorHsTrabajadas(){
	        return this.horasTrabajadas * 500;
	    }

	    public double montoPorCantidadDeHijos() {
	        return this.cantidadHijos * 1000;
	    }

	    public double descuento() {
	        return this.getSueldoBasico() * 0.13;
	    }

	}

	public class EmpleadoPlanta extends Empleado {
	    private int cantidadHijos = 0;

	    // ......

	    public double montoPorHsTrabajadas(){
	        return 0;
	    }

	    public double montoPorCantidadDeHijos() {
	        return this.cantidadHijos * 2000;
	    }

	    public double descuento() {
	        return this.getSueldoBasico() * 0.13;
	    }
	    
	}

	public class EmpleadoPasante extends Empleado {
	    
	    // ......

	    public double montoPorHsTrabajadas(){
	        return 0;
	    }

	    public double montoPorCantidadDeHijos() {
	        return 0;
	    }

	    public double descuento() {
	        return this.getSueldoBasico() * 0.13;
	    }
	}
	
}
