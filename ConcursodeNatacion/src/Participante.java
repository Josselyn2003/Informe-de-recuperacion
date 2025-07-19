public class Participante {
    protected String nombre;
    protected int edad;

    protected String genero;
    protected boolean saludBuena;
    protected String tipoEntidad;

    public Participante(String nombre, int edad, String genero, boolean saludBuena, String tipoEntidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.saludBuena = saludBuena;
        this.tipoEntidad = tipoEntidad;
    }

    public boolean puedeParticipar() {
        return edad >= 18 && edad <= 25 && saludBuena;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero + ", Salud: " +
                (saludBuena ? "Buena" : "Mala") + ", Tipo de Entidad: " + tipoEntidad;
    }
}
