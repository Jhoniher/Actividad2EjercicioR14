import java.util.Scanner;
public class EjercicioResuelto14 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double ventaD1, ventaD2, ventaD3, salario, totalVentas, porcentaje;
        System.out.println("Ingrese el valor de la venta del departamento 1: ");
        ventaD1=entrada.nextDouble();
        System.out.println("Ingrese el valor de la venta del departamento 2: ");
        ventaD2=entrada.nextDouble();
        System.out.println("Ingrese el valor de la venta del departamento 3: ");
        ventaD3=entrada.nextDouble();
        System.out.println("Ingrese el salario para cada departamento: ");
        salario=entrada.nextDouble();
        totalVentas=ventaD1+ventaD2+ventaD3;
        porcentaje=totalVentas*0.33;
        double devengado1=salario;
        double devengado2=salario;
        double devengado3=salario;
        if(ventaD1>porcentaje){
            devengado1+=salario*0.20;
        }
        if(ventaD2>porcentaje){
            devengado2+=salario*0.20;
        }
        if(ventaD3>porcentaje){
            devengado3+=salario*0.20;
        }
        System.out.println("El Salario de los vendedores del departamento 1 es: "+devengado1);
        System.out.println("El Salario de los vendedores del departamento 2 es: "+devengado2);
        System.out.println("El Salario de los vendedores del departamento 3 es: "+devengado3);
    }
}
