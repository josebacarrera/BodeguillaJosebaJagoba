import java.util.*;
import java.io.*;
public class ListaArticulos {

	private ArrayList<Articulo> listaArticulos;

	//CONSTRUCTORES
	public ListaArticulos() {
		super();
		listaArticulos = listaArticulos;
	}

	public ListaArticulos(ArrayList<Articulo> listaArticulos) {
		super();
		this.listaArticulos = listaArticulos;
	}
	//GETTERS Y SETTERS
	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
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
	
	if (ListaArticulos.contains("Refresco") {
		nuevo.set
	}
	
	if (ListaArticulos.contains("Vino") {
		nuevo.set
	}
	
	if (ListaArticulos.contains("Cerveza") {
		nuevo.set
	}
	this.listaArticulos.add(nuevo);
	
		}
	}
		//METODOS


		
		
}
