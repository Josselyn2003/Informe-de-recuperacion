public class ParticipanteEmpresa extends Participante {
    private String tipoEmpresa;

    public ParticipanteEmpresa(String nombre, int edad, String genero, boolean saludBuena, String tipoEmpresa) {
        super(nombre, edad, genero, saludBuena, "Empresa");
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Tipo de Empresa: " + tipoEmpresa;
    }
}
