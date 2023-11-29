package ejerciciosTestsPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejerciciosClassPoo.Password;

public class TestPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un tamano para el array de passwords: ");
		int longArr = scanner.nextInt();
		
		System.out.println("Ingresa el tamano de los passwords: ");
		int longPass = scanner.nextInt();
		
		List<String> arrPass = arrPasswords(longArr, longPass);
	    List<Boolean> arrStrong = arrIsStrong(arrPass, longArr);

	    System.out.println("Passwords generados:");
	    System.out.println(arrPass);

	    System.out.println("Passwords fuertes:");
	    System.out.println(arrStrong);
	    
	    scanner.close();
	    
	    //Password pass = new Password(30);
	    //System.out.println(pass.generarPassword());
	    
	    //pass.setLongitud(35);
	    //System.out.println(pass.esFuerte(pass.generarPassword()));
	}
	
	public static List<String> arrPasswords(int longArr, int longPass){
		List<String> arrPasswords = new ArrayList<>();
		
		for(int i = 0; i < longArr ; i++){			
			Password password = new Password(longPass);
			arrPasswords.add(password.generarPassword());
		}
		
		System.out.println(arrPasswords);
		return arrPasswords;
	}
	
	public static List<Boolean> arrIsStrong(List<String> arrPass, int longArr) {
	    List<Boolean> arrStrong = new ArrayList<>();
	    for (int i = 0; i < longArr; i++) {
	        Password password = new Password();
	        arrStrong.add(password.esFuerte(arrPass.get(i).toString()));
	    }
	    return arrStrong;
	}
}
