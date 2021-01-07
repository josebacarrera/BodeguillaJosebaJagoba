import java.util.*;
import java.io.*;
public class BodeguillaList {

	private ArrayList<Bodeguilla> listaBodeguilla;


	//CONSTRUCTORES
	public BodeguillaList() {
		super();
		listaBodeguilla = listaBodeguilla;
	}

	public BodeguillaList(ArrayList<Bodeguilla> listaBodeguilla) {
		super();
		this.listaBodeguilla = listaBodeguilla;
	}
	//GETTERS Y SETTERS

	public ArrayList<Bodeguilla> getListaBodeguilla() {
		return listaBodeguilla;
	}

	public void setListaBodeguilla(ArrayList<Bodeguilla> listaBodeguilla) {
		this.listaBodeguilla = listaBodeguilla;
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
		
		Bodeguilla nuevo = new Bodeguilla();
		nuevo.setCodigo(parteslinea[0]);
		nuevo.setNombre(parteslinea[1]);
		nuevo.setMarca(parteslinea[2]);
		nuevo.setPrecio(Double.parseDouble(parteslinea[3]));
		nuevo.setUnidCaja(Integer.parseInt(parteslinea[4]));
		nuevo.setStock(Integer.parseInt(parteslinea[5]));
		
		this.listaBodeguilla.add(nuevo);
		
			}
		}
		
		//METODOS
		
		
}
