import java.io.*;
import java.util.*;

public class Factura implements Facturacion {

	private int numero;
	private String nombre;
	private String apellido;
	private ArrayList<Lineafactura> Lineas;
	private double total;
	
	
	//constructor
	public Factura() {
		super();
	}

	public Factura(int numero, String nombre, String apellido, ArrayList<Lineafactura> lineas, double total) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		Lineas = lineas;
		this.total = total;
	}

	//GETTERS SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<Lineafactura> getLineas() {
		return Lineas;
	}

	public void setLineas(ArrayList<Lineafactura> lineas) {
		Lineas = lineas;
	}
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	// METODOS
	public void print() {
		System.out.println(this.numero);
		System.out.println(this.nombre);
		System.out.println(this.apellido);
		System.out.println("codigo  --  cantidad  --  total");
		for(int i=0;i<Lineas.size();i++) {
			System.out.println(this.Lineas.get(i).getCodigo()+ "-" + this.Lineas.get(i).getCantidad() + "-" + this.Lineas.get(i).getTotalLinea());
		}
		System.out.println(this.total);
	}

	public void añadirLinea() {
		
	}
	
	public double calculototal() {
		return this.total+(this.total*Facturacion.iva);
	}
	
}
