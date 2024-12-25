
package mainpolimorfismo;

import java.util.Scanner;


public class MainPolimorfismo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número máximo
        System.out.print("Ingresa el número hasta el cual deseas ver las tablas (ejemplo: 5): ");
        int maxNumero = scanner.nextInt();

        // Solicitar el límite de la tabla
        System.out.print("Ingresa el límite de cada tabla (ejemplo: 10): ");
        int limite = scanner.nextInt();

        Operacion operacion = new TablaMultiplicar();
        int sumaTotal = 0;

        // Mostrar tablas de multiplicar y calcular suma total
        for (int i = 2; i <= maxNumero; i++) {
            operacion.realizarOperacion(i, limite);
            int sumaTabla = operacion.sumarTabla(i, limite);
            System.out.println("Suma de los resultados: " + sumaTabla + "\n");
            sumaTotal += sumaTabla;
        }

        // Preguntar si desea ver las tablas invertidas
        System.out.print("¿Quieres ver las tablas invertidas? (sí/no): ");
        scanner.nextLine(); // Consumir la línea pendiente
        String respuesta = scanner.nextLine();

        // Mostrar tablas invertidas si la respuesta es afirmativa
        if (respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si")) {
            System.out.println("\nMostrando las tablas invertidas:\n");
            for (int i = 2; i <= maxNumero; i++) {
                operacion.mostrarTablaInvertida(i, limite);
                System.out.println(); // Separador entre tablas
            }
        }

        // Mostrar la suma total de todas las tablas
        System.out.println("La suma total de todas las tablas de multiplicar es: " + sumaTotal);
        scanner.close();
    }
}