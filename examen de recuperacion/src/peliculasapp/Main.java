package peliculasapp;

public class Main {
    public static void main(String[] args) {
        string url="jdbc:msyql://localhost:3306/examen de recuperacion"

        javax.swing.SwingUtilities.invokeLater(() -> {
            FormularioPeliculas form = new FormularioPeliculas();
            form.setVisible(true);
        });
    }
}
