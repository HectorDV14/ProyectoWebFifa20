package fifa20;

public class Evaluar {
	
	
	
	public static String evaluarDato(int dato) {
		if(dato>=0 && dato<=49) {
			return "rojo";
		}else if(dato>=50 && dato<=69) {
			return "naranja";
		}else if(dato>=70 && dato<=79) {
			return "amarillo";
		}else if(dato<=80 && dato>=89) {
			return "verde";
		}else {
			return "verdeOscuro";
		}
	}
}
