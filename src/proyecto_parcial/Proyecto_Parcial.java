package proyecto_parcial;
import java.util.Scanner;
public class Proyecto_Parcial {
    public static void main(String[] args) {
        /*
        1.Crear un programa en Java que permita ingresar el nombre del empleado, 
        horas trabajadas y su tarifa por hora. Determinar el sueldo bruto, descuento 
        (seguro de pensión onp) y el sueldo neto a pagar neto de un empleado.
        */
        Scanner sc = new Scanner(System.in);
        
        //DATOS DE PRUEBA
        String empleado;
        int horast;
        double tarifa_hora, sueldo_bruto, descuento, sueldo_neto;
        
        //SOLICITUD DE DATOS CON VALORES INICIALIZADOS
        System.out.println("Ingrese nombre del Empleado: ");
        empleado = sc.next();
        System.out.println("Ingrese horas trabajadas: ");
        horast = sc.nextInt();
        
        //OPERACIONES
        tarifa_hora = 50;
        sueldo_bruto = horast * tarifa_hora;
        descuento = sueldo_bruto * 0.13;
        sueldo_neto = sueldo_bruto - descuento;
        
        //RESULTADOS DE SUELDO DEL EMPLEADO
        System.out.println("EMPLEADO ("+empleado+")");
        System.out.println("CON: "+horast+" HORAS TRABAJADAS");
        System.out.println("CUENTA CON UN SUELDO BRUTO DE: " + sueldo_bruto);
        System.out.println("DESCUENTO X ONP: " + descuento);
        System.out.println("SUELDO NETO FINAL: " + sueldo_neto);
    } 
}
