
public class EmployeeBoss extends Employee {

	public EmployeeBoss() {
		super("", "", 0, 0);

	}

	public EmployeeBoss(String nombre, String apellido, int edad, double salarioBase) {
		super(nombre, apellido, edad, salarioBase);
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase();
	}

}
