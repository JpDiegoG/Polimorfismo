package mainpolimorfismo;

class TablaMultiplicar extends Operacion {
    @Override
    public void realizarOperacion(int numero, int limite) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}