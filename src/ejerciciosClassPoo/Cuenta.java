package ejerciciosClassPoo;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	// constructor
	public Cuenta(String titular, double cantidad) {
		if(cantidad < 0) this.cantidad = 0;
		else this.cantidad = cantidad;
		
		this.titular = titular;
	}

	// Getters y Setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	// Metodos
	public void ingresar(double cantidad) {
		if(cantidad <= 0) return;
		this.cantidad += cantidad;
	}
	
	public void retirar(double cantidad) {
		if(cantidad > this.cantidad) this.cantidad = 0;
		else this.cantidad -= cantidad;
	}
}
