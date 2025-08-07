public class Casa extends Inmueble {
    private final int numeroPisos;
    private final boolean tienePatio;

    public Casa(String direccion, String ciudad, double precio, int area, boolean disponible, int numeroPisos, boolean tienePatio) {
        super(direccion, ciudad, precio, area, disponible);
        this.numeroPisos = numeroPisos;
        this.tienePatio = tienePatio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de pisos: " + numeroPisos);
        System.out.println("Tiene patio: " + (tienePatio ? "Sí" : "No"));
    }
}
