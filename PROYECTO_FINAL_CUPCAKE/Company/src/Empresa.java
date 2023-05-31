
public class Empresa {

	public static void imprimirSalario(Employee employee) {
        System.out.println("El salario de " + employee.getNombre() + " " + employee.getApellido() + " es: $" + employee.calcularSalario());
    }

}
