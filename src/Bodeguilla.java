public class Bodeguilla {
	//ATRIBUTOS
	String Codigo;
	String Nombre;
	String Marca;
	double Precio;
	int UnidCaja;
	int Stock;

	
	//CONSTRUCTORES
	public Bodeguilla() {
		super();
	}


	public Bodeguilla(String Codigo, String Nombre, String Marca, double Precio, int UnidCaja, int Stock) {
		super();
		this.Codigo = Codigo;
		this.Nombre = Nombre;
		this.Marca = Marca;
		this.Precio = Precio;
		this.UnidCaja = UnidCaja;
		this.Stock = Stock;
	}

	
	//GETTERS Y SETTERS

	public String getCodigo() {
		return Codigo;
	}


	public void setCodigo(String Codigo) {
		this.Codigo = Codigo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String Marca) {
		this.Marca = Marca;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double Precio) {
		this.Precio = Precio;
	}


	public int getUnidCaja() {
		return UnidCaja;
	}


	public void setUnidCaja(int UnidCaja) {
		this.UnidCaja = UnidCaja;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		this.Stock = Stock;
	}
	
	
	
	
	
	
	
	
}
