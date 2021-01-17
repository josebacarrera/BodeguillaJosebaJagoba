import java.util.*;
import java.io.*;
public class Cerveza extends Articulo  {
	//ATRIBUTOS
	private String Origen;
	private String[] Cereales;
	private double Alcohol;
	
	//CONSTRUCTORES
	public Cerveza(String Codigo, String Nombre, String Marca, double Precio, int Stock) {
		super(Codigo, Nombre, Marca, Precio, Stock);
		
	}

	public Cerveza(String Codigo, String Nombre, String Marca, double Precio, int Stock,String Origen, String[] Cereales,double Alcohol) {
		super(Codigo, Nombre, Marca, Precio, Stock);
		this.Origen = Origen;
		this.Cereales = new String[3];
		this.Cereales=Cereales;
		this.Alcohol = Alcohol;
	}

	//GETTERS Y SETTERS
	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public String[] getCereales() {
		return Cereales;
	}

	public void setCereales(String[] cereales) {
		Cereales = cereales;
	}

	public double getAlcohol() {
		return Alcohol;
	}

	public void setAlcohol(double alcohol) {
		Alcohol = alcohol;
	}
	
	public void mostrarDatos() {
		int i;
		boolean salu=false;
		String aux="(" +  Cereales[0];
		for(int j=1;j< this.Cereales.length;j++) {
			aux=aux + "," + Cereales[j];
		}
		System.out.println(this.Codigo + "-" + this.Nombre + "-" + this.Marca + "-"+ this.Precio + "-"+ this.Stock + "-"+ this.Origen + "-"+ this.Alcohol +"-" + aux + ")");
	}

	public void saludable() {
		if(getOrigen().contains("Belgium")) {
			String aux="(" +  Cereales[0];
			for(int j=1;j< this.Cereales.length;j++) {
				aux=aux + "," + Cereales[j];
			}
			System.out.println(this.Codigo + "-" + this.Nombre + "-" + this.Marca + "-"+ this.Precio + "-"+ this.Stock + "-"+ this.Origen + "-"+ this.Alcohol +"-" + aux + ")");
		}
	}
	
	
}

