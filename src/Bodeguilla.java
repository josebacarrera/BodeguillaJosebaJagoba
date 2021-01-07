public class Bodeguilla {
	//ATRIBUTOS
	String codigo;
	String nombre;
	String marca;
	double precio;
	int unidCaja;
	int stock;

	
	//CONSTRUCTORES
	public Bodeguilla() {
		super();
	}


	public Bodeguilla(String codigo, String nombre, String marca, double precio, int unidCaja, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.unidCaja = unidCaja;
		this.stock = stock;
	}

	
	//GETTERS Y SETTERS

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getUnidCaja() {
		return unidCaja;
	}


	public void setUnidCaja(int unidCaja) {
		this.unidCaja = unidCaja;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	
	
	
}
