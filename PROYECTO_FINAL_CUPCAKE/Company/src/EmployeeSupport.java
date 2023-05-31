
public class EmployeeSupport extends Employee {

	private int horasSemanales;

	public EmployeeSupport() {
		super("", "", 0, 0);
		this.horasSemanales = 0;
	}

	public EmployeeSupport(String nombre, String apellido, int edad, double salarioBase, int horasSemanales) {
		super(nombre, apellido, edad, salarioBase);
		this.horasSemanales = horasSemanales;
	}

	@Override
	public double calcularSalario() {
		double salario = this.getSalarioBase() * this.horasSemanales;
		double compensacion = salario * 0.5;
		return salario + compensacion;
	}

	@Override
	public String toString() {
		double salario = (salarioBase * horasSemanales) * 1.5;
		return super.toString() + "\nTipo de empleado: Apoyo\nHoras semanales: " + horasSemanales + "\nSalario total: " + salario;
				
	}

}
