
public class Main {

	public static void main(String[] args) {

		Employee manufactura = new EmployeeM("Juanito", "Pérez Rodríguez", 25, 45, 40);
		Employee apoyo = new EmployeeSupport("María", "Gonzáles López", 30, 20, 42);
		Employee jefe = new EmployeeBoss("Stefano", "Rossi De Luca", 50, 5000);

		Empresa.imprimirSalario(manufactura);
		Empresa.imprimirSalario(apoyo);
		Empresa.imprimirSalario(jefe);
	}

}
