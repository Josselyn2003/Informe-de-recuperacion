public class ParticipanteUniversidad extends Participante {
    private final String nombreUniversidad;

    public ParticipanteUniversidad(String nombre, int edad, String genero, boolean saludBuena, String nombreUniversidad) {
        super(nombre, edad, genero, saludBuena, "Universidad");
        this.nombreUniversidad = nombreUniversidad;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Universidad: " + nombreUniversidad;
    }
}
