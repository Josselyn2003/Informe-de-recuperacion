import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n----- SISTEMA INMOBILIARIO -----");
            System.out.println("1. Agregar Casa");
            System.out.println("2. Agregar Departamento");
            System.out.println("3. Agregar Terreno");
            System.out.println("4. Mostrar todos los inmuebles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> agregarCasa();
                case 2 -> agregarDepartamento();
                case 3 -> agregarTerreno();
                case 4 -> mostrarInmuebles();
                case 5 -> System.out.println("¡Gracias por usar el sistema!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }

    static void agregarCasa() {
        System.out.println("\n-- AGREGAR CASA --");
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Área (m2): ");
        int area = scanner.nextInt();

        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();

        System.out.print("Número de pisos: ");
        int pisos = scanner.nextInt();

        System.out.print("¿Tiene patio? (true/false): ");
        boolean patio = scanner.nextBoolean();

        Casa casa = new Casa(direccion, ciudad, precio, area, disponible, pisos, patio);
        listaInmuebles.add(casa);

        System.out.println("✅ Casa agregada exitosamente.");
    }

    static void agregarDepartamento() {
        System.out.println("\n-- AGREGAR DEPARTAMENTO --");
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Área (m2): ");
        int area = scanner.nextInt();

        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();

        System.out.print("Piso: ");
        int piso = scanner.nextInt();

        System.out.print("¿Tiene ascensor? (true/false): ");
        boolean ascensor = scanner.nextBoolean();

        Departamento depa = new Departamento(direccion, ciudad, precio, area, disponible, piso, ascensor);
        listaInmuebles.add(depa);

        System.out.println("✅ Departamento agregado exitosamente.");
    }

    static void agregarTerreno() {
        System.out.println("\n-- AGREGAR TERRENO --");
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Área (m2): ");
        int area = scanner.nextInt();

        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        scanner.nextLine(); // limpiar buffer

        System.out.print("Tipo de suelo: ");
        String tipoSuelo = scanner.nextLine();

        System.out.print("¿Tiene servicios básicos? (true/false): ");
        boolean servicios = scanner.nextBoolean();

        Terreno terreno = new Terreno(direccion, ciudad, precio, area, disponible, tipoSuelo, servicios);
        listaInmuebles.add(terreno);

        System.out.println("✅ Terreno agregado exitosamente.");
    }

    static void mostrarInmuebles() {
        System.out.println("\n-- LISTA DE INMUEBLES --");
        if (listaInmuebles.isEmpty()) {
            System.out.println("No hay inmuebles registrados.");
        } else {
            for (Inmueble i : listaInmuebles) {
                System.out.println("---------------------------");
                i.mostrarInformacion();
            }
        }
    }
}
