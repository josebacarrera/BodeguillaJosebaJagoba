import java.io.IOException;
import java.util.Scanner;
public class Main {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			// declarar
			Scanner sc = new Scanner(System.in);
			int opc;

			
			// crear una lista 
			ListaArticulos bodeguilla = new ListaArticulos();
			
			
			bodeguilla.fill_data();
			
			

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
					
					break;

				case 2:
					
					break;

				case 3:
					
					break;
					
				case 4:
					
					break;
					
				case 5:
					
					break;
					
				case 6:
					
					break;

				case 7:
					System.out.println("FIN DE LA BODEGUILLA");
					break;
				}
			} while (opc !=7);

		
	}

}
