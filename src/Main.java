import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			// declarar
			Scanner sc = new Scanner(System.in);
			int opc;

			
			// crear una lista 
			ListaArticulos articulo = new ListaArticulos();
			
			
			articulo.fill_data();
			
			

			// menu
			do {

				System.out.println("ESCOGE UNA OPCION");
				System.out.println("1. Hacer una venta \r\n"
						+ "2. Listar todos los art�culos\r\n"
						+ "3. Ver los articulos saludables \r\n"
						+ "4. Sacar una lista de art�culos con precio equivalente\r\n"
						+ "5. Ver el art�culo m�s caro\r\n"
						+ "6.Ver los art�culos con poco stock\r\n"
						+ "7.Salir");

				opc = Integer.parseInt(sc.nextLine());

			
				switch (opc) {

				case 1:
					/*
					int numero;
					String nombre,apellido,dato;
					String[] datos;
					
					dato ="";
					datos =null;
					System.out.println("Numero de factura: ");
					numero=Integer.parseInt(sc.nextLine());
					System.out.println("Nombre: ");
					nombre=sc.nextLine();
					System.out.println("Apellido: ");
					apellido=sc.nextLine();
					Factura fact=new Factura(numero,nombre,apellido);
					while(dato.equalsIgnoreCase("FIN")==false) {
						System.out.println("Codigo del producto y cantida ");
						System.out.println("si no desea nada mas escriba FIN");
						dato = sc.nextLine().toUpperCase();
						if(dato.equalsIgnoreCase("FIN")==false) {
							datos=dato.split("-");
						}
						if(lilistarDatos.quitarStock(datoParts[0].Integer.parseInt(datoParts[1]))==true){
							
						(fact.a�adirLinea(datoParts[0].Integer.parseInt(datosParts[1]);
							
							Integer.parseInt(datoParts[1]) * listarDatos.salneurria(datoParts[0]));
						}

						else {System.out.println("No hay tanto stock");
						}
							
						fact.print();
						
					
					int numero;
					String nombre,apellido,dato;
					String[] datos;
					
					dato ="";
					datos =null;
					System.out.println("Numero de factura: ");
					numero=Integer.parseInt(sc.nextLine());
					System.out.println("Nombre: ");
					nombre=sc.nextLine();
					System.out.println("Apellido: ");
					apellido=sc.nextLine();
					Factura fact=new Factura(numero,nombre,apellido);
					while(dato.equalsIgnoreCase("FIN")==false) {
						System.out.println("Codigo del producto y cantida ");
						System.out.println("si no desea nada mas escriba FIN");
						dato = sc.nextLine().toUpperCase();
						if(dato.equalsIgnoreCase(anotherString)) {
							
						}
					}*/
					
					
					break;

				case 2:
					articulo.ListarDatos();
					break;

				case 3:
					articulo.ProductoSaludable();
					break;
					
				case 4:
					articulo.precioEquivalente();
					break;
					
				case 5:
					articulo.Mascaro();
					break;
					
				case 6:
					articulo.PocoStock();
					break;

				case 7:
					System.out.println("FIN DE LA BODEGUILLA");
					break;
				}
			}while(opc!=7);

	}

}
