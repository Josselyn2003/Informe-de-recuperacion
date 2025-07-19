import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Participante> participantes = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú del Concurso de Natación ---");
            System.out.println("1. Registrar nuevo participante");
            System.out.println("2. Ver todos los participantes");
            System.out.println("3. Ver participantes que pueden participar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarParticipante();
                case 2 -> mostrarParticipantes(false);
                case 3 -> mostrarParticipantes(true);
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

    public static void registrarParticipante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt(); scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("¿Salud buena? (true/false): ");
        boolean saludBuena = scanner.nextBoolean(); scanner.nextLine();

        System.out.println("Tipo de entidad:");
        System.out.println("1. Colegio\n2. Universidad\n3. Empresa\n4. Sindicato");
        int tipo = scanner.nextInt(); scanner.nextLine();

        Participante nuevo = null;

        switch (tipo) {
            case 1 -> {
                System.out.print("Nombre del colegio: ");
                String colegio = scanner.nextLine();
                nuevo = new ParticipanteColegio(nombre, edad, genero, saludBuena, colegio);
            }
            case 2 -> {
                System.out.print("Nombre de la universidad: ");
                String uni = scanner.nextLine();
                nuevo = new ParticipanteUniversidad(nombre, edad, genero, saludBuena, uni);
            }
            case 3 -> {
                System.out.print("Tipo de empresa (Pública o Privada): ");
                String tipoEmp = scanner.nextLine();
                nuevo = new ParticipanteEmpresa(nombre, edad, genero, saludBuena, tipoEmp);
            }
            case 4 -> {
                System.out.print("Tipo de sindicato: ");
                String sindicato = scanner.nextLine();
                nuevo = new ParticipanteSindicato(nombre, edad, genero, saludBuena, sindicato);
            }
            default -> System.out.println("Tipo inválido.");
        }

        if (nuevo != null) {
            participantes.add(nuevo);
            System.out.println("¡Participante registrado con éxito!");
        }
    }

    public static void mostrarParticipantes(boolean soloValidos) {
        for (Participante p : participantes) {
            if (!soloValidos || p.puedeParticipar()) {
                System.out.println(p.getInfo());
            }
        }
    }
}
