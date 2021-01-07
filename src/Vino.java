import java.util.*;
import java.io.*;
public class Vino extends Bodeguilla {
	//ATRIBUTOS
	String Color;
	String Origen;
	int Anio;
	String Uva;

	//CONSTRUCTORES
	public Vino() {
		super();
	}

	public Vino(String Color, String Origen, int Anio, String Uva) {
		super();
		this.Color = Color;
		this.Origen = Origen;
		this.Anio = Anio;
		this.Uva = Uva;
	}

	//GETTERS Y SETTERS
	
	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String Origen) {
		this.Origen = Origen;
	}

	public int getAnio() {
		return Anio;
	}

	public void setAnio(int Anio) {
		this.Anio = Anio;
	}

	public String getUva() {
		return Uva;
	}

	public void setUva(String Uva) {
		this.Uva = Uva;
	}
	

	
}

