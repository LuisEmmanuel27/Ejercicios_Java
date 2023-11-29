package ejerciciosTestsPoo;

import java.util.Scanner;

import ejerciciosClassPoo.Persona;

public class TestPersona {

	public static void main(String[] args) {

		// Para leer valores por teclado necesitamos:
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa el nombre de la persona: ");
		String nombre = scanner.nextLine();

		System.out.println("Ingresa la edad de la persona: ");
		int edad = scanner.nextInt();

		System.out.println("Ingresa el sexo de la persona (H/M): ");
		char sexo = scanner.next().charAt(0);

		System.out.println("Ingresa la altura de la persona (m.cm): ");
		double altura = scanner.nextDouble();

		System.out.println("Ingresa el peso de la persona (kg): ");
		double peso = scanner.nextDouble();

		Persona testPersona = new Persona(nombre, edad, sexo, peso, altura);

		MC(testPersona);
		mayorEdad(testPersona);

		System.out.println(testPersona.toString());

		scanner.close();
	}

	public static void MC(Persona testPersona) {
		int mc = testPersona.calcularMC();

		if (mc < 0)
			System.out.println("Estas muy por debajo de tu peso ideal");
		if (mc == 0)
			System.out.println("Estas en tu peso ideal");
		else
			System.out.println("Tienes sobrepeso");
	}

	public static void mayorEdad(Persona testPersona) {
		if (testPersona.esMayorDeEdad())
			System.out.println("La persona es mayor de edad");
		else
			System.out.println("La persona no es mayor de edad");
	}
}
