public class ParticipanteSindicato extends Participante {
    private final String tipoSindicato;

    public ParticipanteSindicato(String nombre, int edad, String genero, boolean saludBuena, String tipoSindicato) {
        super(nombre, edad, genero, saludBuena, "Sindicato");
        this.tipoSindicato = tipoSindicato;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Tipo de Sindicato: " + tipoSindicato;
    }
}
