package peliculasapp;

public class Pelicula {
    private int id;
    private String nombre;
    private String genero;
    private boolean apta;

    // Constructor
    public Pelicula(int id, String nombre, String genero, boolean apta) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.apta = apta;
    }

    public Pelicula(String nombre, String genero, boolean apta) {
        this.nombre = nombre;
        this.genero = genero;
        this.apta = apta;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public boolean isApta() { return apta; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setApta(boolean apta) { this.apta = apta; }
}
