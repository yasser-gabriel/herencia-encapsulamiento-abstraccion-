
public class App {
    public static void main(String[] args) throws Exception {
        
         Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("juan perez", "123", 48000.00);
        empleados[1] = new EmpleadoMedioTiempo("maria Lopez", "123", 15.0,20);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());
        }
    }

}