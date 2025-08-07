package peliculasapp;

import javax.swing.*;

public class FormularioPeliculas extends JFrame {
    public JPanel panelPrincipal;
    public JTextField txtNombre;
    public JComboBox<String> cbGenero;
    public JCheckBox chkApta;
    public JButton btnGuardar;
    public JButton btnModificar;
    public JButton btnEliminar;
    public JButton btnConsultar;

    public FormularioPeliculas() {
        setTitle("Gestión de Películas");
        setContentPane(panelPrincipal);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar la ventana
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioPeliculas form = new FormularioPeliculas();
            form.setVisible(true);
        });
    }
}
