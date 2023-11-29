package ejerciciosClassPoo;

public class Persona {
	private static int INFRAPRESO = -1;
	private static int IDEAL = 0;
	private static int SOBREPESO = 1;

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;

	// constructor
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {

		if (altura > 3)
			altura /= 100;
		if (altura < 0)
			altura = 0;
		if (peso < 0)
			peso = 0;

		comprobarSexo(sexo);
		generaDNI();

		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	// Setters, no getters por que no queremos que accedan a estos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	// metodos
	public int calcularMC() {
		double imc = this.peso / this.altura;
		if (imc < 20)
			return Persona.INFRAPRESO;
		if (imc <= 25)
			return Persona.IDEAL;
		else
			return Persona.SOBREPESO;
	}

	public boolean esMayorDeEdad() {
		return (this.edad >= 18);
	}

	public void comprobarSexo(char sexo) {
		if (sexo != 'H' && sexo != 'M')
			this.sexo = 'H';
		else
			this.sexo = sexo;
	}

	public void generaDNI() {
		// Generar un número aleatorio de 8 cifras
		int numeroDNI = (int) (Math.random() * 100000000);

		// Calcular el resto de dividir el número por 23
		int resto = numeroDNI % 23;

		// Obtener la letra correspondiente al resto
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraDNI = letrasDNI.charAt(resto);

		// Concatenar el número y la letra para formar el DNI completo
		this.DNI = String.valueOf(numeroDNI) + letraDNI;
	}
}
