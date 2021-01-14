public abstract class Articulo {
	//ATRIBUTOS
	protected String Codigo;
	protected String Nombre;
	protected String Marca;
	protected double Precio;
	protected int Stock;

	
	//CONSTRUCTORES
	public Articulo() {
		super();
	}


	public Articulo(String Codigo, String Nombre, String Marca, double Precio, int Stock) {
		super();
		this.Codigo = Codigo;
		this.Nombre = Nombre;
		this.Marca = Marca;
		this.Precio = Precio;
		this.Stock = Stock;
	}
	
	

	//GETTERS Y SETTERS
	
	public String getCodigo() {
		return Codigo;
	}


	public void setCodigo(String codigo) {
		Codigo = codigo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}

	// METODOS ABSTRACTOS
	
	public abstract void mostrarDatos();	
	public abstract void saludable();
		
	
	
}
