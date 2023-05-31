
public class EmployeeM extends Employee {
	private int horasSemanales;

	public EmployeeM() {
		super("", "", 0, 0);
		this.horasSemanales = 0;
	}

	public EmployeeM(String nombre, String apellido, int edad, double salarioBase, int horasSemanales) {
		super(nombre, apellido, edad, salarioBase);
		this.horasSemanales = horasSemanales;
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() * this.horasSemanales;
	}

	@Override
	public String getTipo() {
		return "Manufactura";
	}

	@Override
	public String toString() {
		return "EmpleadoManufactura{" + "horasSemanales=" + horasSemanales + "} " + super.toString();
	}
}
