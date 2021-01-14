import java.util.*;
import java.io.*;

public class Refresco extends Articulo {
	// ATRIBUTOS
	private String Sabor;
	private boolean Zumo;
	private boolean Gas;
	private int Azucar;

	// CONSTRUCTORES

	public Refresco(String Codigo, String Nombre, String Marca, double Precio, int Stock, String sabor,
			boolean zumo, boolean gas, int azucar) {
		super(Codigo, Nombre, Marca, Precio, Stock);
		Sabor = sabor;
		Zumo = zumo;
		Gas = gas;
		Azucar = azucar;
	}
	// GETTERS Y SETTERS

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String Sabor) {
		this.Sabor = Sabor;
	}

	public boolean isZumo() {
		return Zumo;
	}

	public void setZumo(boolean Zumo) {
		this.Zumo = Zumo;
	}

	public boolean isGas() {
		return Gas;
	}

	public void setGas(boolean Gas) {
		this.Gas = Gas;
	}

	public int getAzucar() {
		return Azucar;
	}

	public void setAzucar(int Azucar) {
		this.Azucar = Azucar;
	}

	public void mostrardatos() {
		int i;
		System.out.println(this.Codigo + "-"+ this.Nombre + "-"+ this.Marca + "-"+ this.Precio + "-"+ this.Stock + "-"+ this.Sabor + "-"+ this.Zumo + "-"+ this.Gas + "-"+ this.Azucar);
		
	}
	// METODOS
	/*
	 * void verCaracteristicas() boolean saludable() //tener menos de 25 de azucar
	 * 
	 * 
	 */
	public void Saludable() {
		boolean sano=false;
		if(getAzucar()<25) {
			sano=true;
	}
}
}
