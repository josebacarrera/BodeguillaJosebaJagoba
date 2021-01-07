public class Refresco extends Bodeguilla{
	//ATRIBUTOS
	String sabor;
	boolean zumo;
	boolean gas;
	int azucar;



	//CONSTRUCTORES
	public Refresco() {
		super();
	}

	public Refresco(String sabor, boolean zumo, boolean gas, int azucar) {
		super();
		this.sabor = sabor;
		this.zumo = zumo;
		this.gas = gas;
		this.azucar = azucar;
	}
	
	//GETTERS Y SETTERS

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public boolean isGas() {
		return gas;
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}
	
	
	
	
	
}
