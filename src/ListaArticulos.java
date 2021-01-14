import java.util.*;
import java.io.*;
public class ListaArticulos {

	private ArrayList<Articulo> ListaArticulos=new ArrayList<Articulo>();

	//CONSTRUCTORES
	public ListaArticulos() {
		super();
		
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
		
		String Codigo;
		String Nombre;
		String Marca;
		double Precio;
		int Stock;
		
		// Atributos
		
		
		// Atributos refrescos
		
		String Sabor;
		Boolean Zumo,Gas;
		int Azucar;
		
		// Atributos Vino
		
		String Color;
		String OrigenVino;
		int Anio;
		String Uva;
		
		// Atributos Cerveza
		 
		String OrigenCerveza;
		String[] Cereales;
		int Alcohol;
		
	while (sc.hasNextLine()) {
	
	linea=sc.nextLine();
	parteslinea = linea.split("::");
	
	Codigo=parteslinea[0];
	Nombre=parteslinea[1];
	Marca=parteslinea[2];
	Precio=Double.parseDouble((parteslinea[3]).replace(",","."));
	Stock= Integer.parseInt(parteslinea[4]);
	
	
		
 	if (Codigo.startsWith("FRES")) {
 		
 		Sabor=parteslinea[5];
 		Zumo=Boolean.parseBoolean(parteslinea[6]);
 		Gas=Boolean.parseBoolean(parteslinea[7]);
 		Azucar=Integer.parseInt(parteslinea[8]);
 		Refresco r=new Refresco(Codigo, Nombre, Marca,Precio,Stock,Sabor,Zumo,Gas,Azucar);
 		
		ListaArticulos.add(r);
	}
	
 	else if (Codigo.startsWith("WINE")) {
		
		Color=(parteslinea[5]);
		OrigenVino=(parteslinea[6]);
		Anio=(Integer.parseInt(parteslinea[7]));
		Uva=(parteslinea[8]);
		Vino v=new Vino(Codigo,Nombre,Marca,Precio,Stock,Color,OrigenVino,Anio,Uva);
		ListaArticulos.add(v);
	}
	
 	else if (Codigo.startsWith("BEER")) {
	
		OrigenCerveza=parteslinea[5];
		String aux[] = new String[3];
		aux[0]=parteslinea[6];
		aux[1]=parteslinea[7];
		aux[2]=parteslinea[8];
		Cereales=(aux);
		Alcohol=(int) Double.parseDouble(parteslinea[9]);
		Cerveza c=new Cerveza(Codigo,Nombre,Marca,Precio,Stock,OrigenCerveza, Cereales, Alcohol);
		ListaArticulos.add(c);
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
	
	}
	
	public void ListarDatos() {
		
		for(int i = 0;i<ListaArticulos.size();i++) {
			ListaArticulos.get(i).mostrarDatos();
		}
		
	}
	
	public void Mascaro() {
		double max=0;
		for(int i=0;i<ListaArticulos.size();i++) {
			if(max<ListaArticulos.get(i).getPrecio()) {
				max=ListaArticulos.get(i).getPrecio();
			}
		}
		for(int i=0;i<ListaArticulos.size();i++) {
			if(ListaArticulos.get(i).getPrecio()==max) {
				System.out.println("El producto mas caro es: " + ListaArticulos.get(i).getNombre());
			}
		}
	}
	
	public void ProductoSaludable() {
		for(int i=0;i<ListaArticulos.size();i++) {
			if(ListaArticulos.get(i).getCodigo().startsWith("FRES")) {
				ListaArticulos.get(i).saludable();
				ListaArticulos.get(i).mostrarDatos();
			}
			if(ListaArticulos.get(i).getCodigo().startsWith("WINE")) {
				ListaArticulos.get(i).mostrarDatos();
			}
			if(ListaArticulos.get(i).getCodigo().startsWith("BEER")) {
				ListaArticulos.get(i).mostrarDatos();
			}
		}
	}
	
	public void PocoStock() {
		int mostrar=0;
		for(int i=0;i<ListaArticulos.size();i++) {
			if(ListaArticulos.get(i).getStock()<50) {
				ListaArticulos.get(i).mostrarDatos();
			}	
		}	
	}


}
	

