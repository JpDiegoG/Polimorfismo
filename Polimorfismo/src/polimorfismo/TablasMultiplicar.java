package polimorfismo;

import java.util.Scanner;

// Clase base: TablaMultiplicar
class TablaMultiplicar {
    protected int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    // Método para mostrar la tabla de forma ascendente
    public void mostrarTabla() {
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Método para calcular la suma de los resultados
    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
}
