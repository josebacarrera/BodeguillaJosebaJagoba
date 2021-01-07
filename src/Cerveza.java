import java.util.*;
import java.io.*;
public class Cerveza extends Articulo {
	//ATRIBUTOS
	private String Origen;
	private String[] Cereales;
	private int Alcohol;
	
	//CONSTRUCTORES
	public Cerveza() {
		super();
	}

	public Cerveza(String origin, String[] cereals, int alcohol) {
		super();
		this.Origen = Origen;
		this.Cereales = Cereales;
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

	public int getAlcohol() {
		return Alcohol;
	}

	public void setAlcohol(int alcohol) {
		Alcohol = alcohol;
	}
	

	//METODOS
	/*
	void VerCaracteristicas ()
	boolean Saludable ()
	// have origin belgium
	void BebidaMuyAlcoholica()
	//If  the alcohol is higher than 6, raise the price 5%

	*/
}
