import java.util.*;
import java.io.*;
public class Refresco extends Bodeguilla{
	//ATRIBUTOS
	String Sabor;
	boolean Zumo;
	boolean Gas;
	int Azucar;

	//CONSTRUCTORES
	public Refresco() {
		super();
	}

	public Refresco(String Sabor, boolean Zumo, boolean Gas, int Azucar) {
		super();
		this.Sabor = Sabor;
		this.Zumo = Zumo;
		this.Gas = Gas;
		this.Azucar = Azucar;
	}
	
	//GETTERS Y SETTERS

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
	
	
	
	
	
}
