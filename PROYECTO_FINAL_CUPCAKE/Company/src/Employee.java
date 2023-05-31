
abstract class Employee implements Capture {
	private String nombre;
	private String apellido;
	private int edad;
	public double salarioBase;

	public Employee() {
		// Constructor sin parámetros
	}

	public Employee(String nombre, String apellido, int edad, double salarioBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();
	// Implementación de los métodos de la interfaz Capture

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getTipo() {
		return "";
	}

	@Override
	public String toString() {
		return "Empleado{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", edad=" + edad
				+ ", salarioBase=" + salarioBase + ", tipo=" + getTipo() + '}';
	}
}
