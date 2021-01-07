public class Vino extends Bodeguilla {
	//ATRIBUTOS
	String color;
	String origen;
	int anio;
	String uva;

	//CONSTRUCTORES
	public Vino() {
		super();
	}

	public Vino(String color, String origen, int anio, String uva) {
		super();
		this.color = color;
		this.origen = origen;
		this.anio = anio;
		this.uva = uva;
	}

	//GETTERS Y SETTERS
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getUva() {
		return uva;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}
	

	
}

