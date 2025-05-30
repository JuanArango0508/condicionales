import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado, diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExtra = 0;
        double totalValorHorasExtras = 0; 

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el dia de descanso: ( Lunes - Viernes )");
        diaDescanso = sc.nextLine();
        System.out.println("Ingrese el valor de la hora:" );
        valorHora = sc.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas:" );
        horasTrabajadas = sc.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        if (salarioBruto <= 2*valorSalarioMinimo) {
            auxilioTransporte = 200000;
            bonificacionEmpleado = salarioBruto*0.1;
        } else {
            auxilioTransporte = 0;
            bonificacionEmpleado = 0; 
        }
        deduccionPension = salarioBruto*0.04;
        deduccionSalud = salarioBruto*0.04;
        if (horasTrabajadas > 96) {
            cantidadHorasExtras = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 1.25;
            totalValorHorasExtras = cantidadHorasExtras * valorHoraExtra; 
        }
        if (horasTrabajadas < 24) {
            System.out.println("Aún no le puedo pagar; trabaje más");
        } else {
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacionEmpleado + totalValorHorasExtras;
            System.out.println("Nombre del empleado: " +nombreEmpleado);
            System.out.println("Documento: " +documentoEmpleado);
            System.out.println("Día de descanso: " + diaDescanso);
            System.out.println("Salario bruto: " +salarioBruto);
            System.out.println("El salario neto del empleado es: "+salarioNeto);
            System.out.println("");

        }
            
        
    }
}
