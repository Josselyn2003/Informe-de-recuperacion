public class Departamento extends Inmueble {
    private final int piso;
    private final boolean tieneAscensor;

    public Departamento(String direccion, String ciudad, double precio, int area, boolean disponible, int piso, boolean tieneAscensor) {
        super(direccion, ciudad, precio, area, disponible);
        this.piso = piso;
        this.tieneAscensor = tieneAscensor;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Piso: " + piso);
        System.out.println("Tiene ascensor: " + (tieneAscensor ? "Sí" : "No"));
    }
}
