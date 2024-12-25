
package polimorfismo;

import java.util.Scanner;


public class Polimorfismo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de hasta que tabla desea generar (empieza desde la tabla del 2 y termina hasta el numero que elija): ");
        int maxNumero = scanner.nextInt();

        if (maxNumero < 2) {
            System.out.println("El número debe ser positivo y ser mayor que 2.");
            return;
        }

        TablaMultiplicar[] tablas = new TablaMultiplicar[maxNumero - 1];
        int sumaTotal = 0;

        for (int i = 2; i <= maxNumero; i++) {
            tablas[i - 2] = new TablaMultiplicar(i);
        }

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar tablas en orden ascendente");
            System.out.println("2. Mostrar tablas en orden descendente");
            System.out.println("3. Mostrar suma de los resultados de cada tabla");
            System.out.println("4. Mostrar tablas invertidas (de 10 a 1)");
            System.out.println("5. Mostrar suma total de los resultados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (TablaMultiplicar tabla : tablas) {
                        tabla.mostrarTabla();
                    }
                    break;

                case 2:
                    for (int i = tablas.length - 1; i >= 0; i--) {
                        tablas[i].mostrarTabla();
                    }
                    break;

                case 3:
                    for (TablaMultiplicar tabla : tablas) {
                        System.out.println("Suma de resultados de la tabla del " + tabla.numero + ": " + tabla.sumarResultados());
                    }
                    break;

                case 4:
                    for (int i = 2; i <= maxNumero; i++) {
                        TablaInvertida tablaInvertida = new TablaInvertida(i);
                        tablaInvertida.mostrarTabla();
                    }
                    break;

                case 5:
                    sumaTotal = 0;
                    for (TablaMultiplicar tabla : tablas) {
                        sumaTotal += tabla.sumarResultados();
                    }
                    System.out.println("Suma total de los resultados: " + sumaTotal);
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }   
}
