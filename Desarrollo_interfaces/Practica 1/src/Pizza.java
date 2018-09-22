import java.util.Arrays;

public class Pizza {
	String nombre;
	String base;
	String toppings[];
	public Pizza(String nombre, String base, String[] toppings) {		
		this.nombre = nombre;
		this.base = base;
		this.toppings = toppings;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	@Override
	public String toString() {
		return "Pizza [nombre=" + nombre + ", base=" + base + ", toppings=" + Arrays.toString(toppings) + "]";
	}	
}
