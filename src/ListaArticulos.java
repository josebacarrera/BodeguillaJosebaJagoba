import java.util.*;
import java.io.*;
public class ListaArticulos {

	private ArrayList<Articulo> ListaArticulos;

	//CONSTRUCTORES
	public ListaArticulos() {
		super();
		ListaArticulos = ListaArticulos;
	}

	public ListaArticulos(ArrayList<Articulo> ListaArticulos) {
		super();
		this.ListaArticulos = ListaArticulos;
	}
	//GETTERS Y SETTERS
	public ArrayList<Articulo> getListaArticulos() {
		return ListaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> ListaArticulos) {
		this.ListaArticulos = ListaArticulos;
	}

	//LLAMADA TXT
	public  void fill_data() throws IOException {
		
		File file=new File("Datos/articulos.txt");
		Scanner sc=new Scanner(file);
		String linea;
		String[] parteslinea;
		
		int i=0;
		
	while (sc.hasNextLine()) {
	
	linea=sc.nextLine();
	parteslinea = linea.split("::");
	
	Articulo nuevo = new Articulo();
	nuevo.setCodigo(parteslinea[0]);
	nuevo.setNombre(parteslinea[1]);
	nuevo.setMarca(parteslinea[2]);
	nuevo.setPrecio(Double.parseDouble(parteslinea[3]));
	nuevo.setStock(Integer.parseInt(parteslinea[4]));
	//this.ListaArticulos.add(nuevo);
	
	if (ListaArticulos.startswith("REFR")) {
		nuevo.setSabor(parteslinea[5]);
		nuevo.setZumo(Boolean.parseBoolean(parteslinea[6]));
		nuevo.setGas(Boolean.parseBoolean(parteslinea[7]));
		nuevo.setAzucar(Integer.parseInt(parteslinea[8]));
		ListaArticulos.add(nuevo);
	}
	
	if (ListaArticulos.startswith("VINO")) {
		nuevo.setColor(parteslinea[9]);
		nuevo.setOrigen(parteslinea[10]);
		nuevo.setAnio(Integer.parseInt(parteslinea[11]));
		nuevo.setUva(parteslinea[12]);
		ListaArticulos.add(nuevo);
	}
	
	if (ListaArticulos.startswith("CERV")) {
		nuevo.setOrigen(parteslinea[13]);
		String aux[] = new String[3];
		aux[0]=parteslinea[14];
		aux[1]=parteslinea[15];
		aux[3]=parteslinea[16];
		nuevo.setCereales(parteslinea[17]);
		nuevo.setAlcohol(Integer.parseInt(parteslinea[18]));
		ListaArticulos.add(nuevo);
	}
	
	
		}
	}
	

	
	//METODOS
	
	/*String[] Reponer()
	// devuelve un array de los codigos de articulos que hay que reponer (stock<50).
	Articulo masCaro()
	//devuelve el articulo mas caro
	double precio(String codigo)
	// //dado un codigo, devuelve su precio

    */
		
	//}	
}
