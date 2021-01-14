import java.util.*;
import java.io.*;

public class Vino extends Articulo {
	// ATRIBUTOS
	private String Color;
	private String Origen;
	private int Anio;
	private String Uva;

	// CONSTRUCTORES

	public Vino(String Codigo, String Nombre, String Marca, double Precio, int Stock) {
		super(Codigo, Nombre, Marca, Precio, Stock);

	}

	public Vino(String Codigo, String Nombre, String Marca, double Precio, int Stock, String Color, String Origen,
			int Anio, String Uva) {
		super(Codigo, Nombre, Marca, Precio, Stock);
		this.Color = Color;
		this.Origen = Origen;
		this.Anio = Anio;
		this.Uva = Uva;
	}

	// GETTERS Y SETTERS

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
	
	public void mostrardatos() {
		int i;
		System.out.println(this.Codigo + "-" + this.Nombre + "-"+ this.Marca + "-"+ this.Precio + "-"+ this.Stock + "-"+ this.Color + "-"+ this.Origen + "-"+ this.Anio + "-"+ this.Uva);
		
	}
	/*
	 * //METODOS void verCaracteristicas() boolean saludable() //tener origen rioja
	 * 
	 * 
	 */
	public void Saludable() {
		boolean sano=false;
		if(getOrigen()=="Rioja") {
			sano=true;
	}
}
}
