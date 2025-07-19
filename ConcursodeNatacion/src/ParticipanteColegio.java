public class ParticipanteColegio extends Participante {
    private final String nombreColegio;

    public ParticipanteColegio(String nombre, int edad, String genero, boolean saludBuena, String nombreColegio) {
        super(nombre, edad, genero, saludBuena, "Colegio");
        this.nombreColegio = nombreColegio;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Colegio: " + nombreColegio;
    }
}
