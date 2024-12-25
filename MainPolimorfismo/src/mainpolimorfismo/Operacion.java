package mainpolimorfismo;

abstract class Operacion {
    public abstract void realizarOperacion(int numero, int limite);

    public int sumarTabla(int numero, int limite) {
        int suma = 0;
        for (int i = 1; i <= limite; i++) {
            suma += numero * i;
        }
        return suma;
    }

    public void mostrarTablaInvertida(int numero, int limite) {
        System.out.println("Tabla de multiplicar invertida del " + numero + ":");
        for (int i = limite; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i)); 
       }
    }
}