import java.util.*;
import java.io.*;

public class Lineafactura {


private String codigo;
private int cantidad;
private double totalLinea;

public Lineafactura() {
super();

}

public Lineafactura(String codigo, int cantidad, double totalLinea) {
super();
this.codigo = codigo;
this.cantidad = cantidad;
this.totalLinea = totalLinea;
}

public String getCodigo() {
return codigo;
}

public void setCodigo(String codigo) {
this.codigo = codigo;
}

public int getCantidad() {
return cantidad;
}

public void setCantidad(int cantidad) {
this.cantidad = cantidad;
}

public double getTotalLinea() {
return totalLinea;
}

public void setTotalLinea(double totalLinea) {
this.totalLinea = totalLinea;
}






}