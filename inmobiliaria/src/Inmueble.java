public class Inmueble {
    private String direccion;
    private String ciudad;
    private double precio;
    private int area;
    private boolean disponible;

    public Inmueble(String direccion, String ciudad, double precio, int area, boolean disponible) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.precio = precio;
        this.area = area;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getArea() { return area; }
    public void setArea(int area) { this.area = area; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void mostrarInformacion() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Precio: " + precio);
        System.out.println("Área: " + area + " m2");
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}
