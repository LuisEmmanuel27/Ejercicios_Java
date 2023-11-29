package ejerciciosTestsPoo;

import ejerciciosClassPoo.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuentaTest = new Cuenta("Luis", 3000);
		
		System.out.println(cuentaTest.getCantidad());
		System.out.println(cuentaTest.getTitular());
		System.out.println(cuentaTest.toString());
		
		cuentaTest.ingresar(250.50);
		System.out.println(cuentaTest.getCantidad());
		
		cuentaTest.retirar(2000);
		System.out.println(cuentaTest.getCantidad());
		
		cuentaTest.retirar(3000);
		System.out.println(cuentaTest.getCantidad());
	}

}
