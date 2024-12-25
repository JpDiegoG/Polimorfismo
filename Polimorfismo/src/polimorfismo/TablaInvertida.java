package polimorfismo;

class TablaInvertida extends TablaMultiplicar {

    public TablaInvertida(int numero) {
        super(numero);
    }
    @Override
    public void mostrarTabla() {
        System.out.println("Tabla del " + numero + " (descendente):");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}