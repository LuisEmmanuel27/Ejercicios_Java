package ejerciciosClassPoo;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	private int longitud = 8;
	private String password;
	
	// constructor por defecto
	public Password() {}
	
	// constructor en caso de que se de el tamaño de contraseña
	public Password(int longitud) {
		this.longitud = longitud;
	}
	
	// Getters y Setters solicitados
	public int getLongitud() {
		return longitud;
	}

	public String getPassword() {
		return password;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// metodos
	public boolean esFuerte(String password) {
	    String regex = "(.*[A-Z]){3,}.*"; // Más de 2 mayúsculas
	    regex += "(.*[a-z]){2,}.*"; // Más de 2 minúsculas
	    regex += "(.*\\d){6,}.*"; // Más de 5 números

	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(password);

	    return matcher.matches();
	}
	
	public String generarPassword(){
		int tam = getLongitud();
		
		if(tam <= 0) {
			System.out.println("Error, falta una longitud para la constrasena");
			return null;
		}else {
			String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			Random random = new Random();
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0 ; i < tam ; i++){
				int randomIndex = random.nextInt(caracteresPermitidos.length());
				char randomChar = caracteresPermitidos.charAt(randomIndex);
				sb.append(randomChar);
			}
			
			return sb.toString();
		}
	}
	
}
