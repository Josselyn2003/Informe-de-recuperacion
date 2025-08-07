public class Terreno extends Inmueble {
    private final String tipoSuelo;
    private final boolean serviciosBasicos;

    public Terreno(String direccion, String ciudad, double precio, int area, boolean disponible, String tipoSuelo, boolean serviciosBasicos) {
        super(direccion, ciudad, precio, area, disponible);
        this.tipoSuelo = tipoSuelo;
        this.serviciosBasicos = serviciosBasicos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de suelo: " + tipoSuelo);
        System.out.println("Servicios básicos: " + (serviciosBasicos ? "Sí" : "No"));
    }
}
