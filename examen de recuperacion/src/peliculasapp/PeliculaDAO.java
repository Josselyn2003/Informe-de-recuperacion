package peliculasapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    public void guardarPelicula(Pelicula p) {
        Connection conn = Conexion.conectar();
        try {
            String sql = "INSERT INTO peliculas (nombre, genero, apta_para_todo_publico) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getGenero());
            stmt.setBoolean(3, p.isApta());
            stmt.executeUpdate();
            System.out.println("Película guardada correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Pelicula> listarPeliculas() {
        List<Pelicula> lista = new ArrayList<>();
        Connection conn = Conexion.conectar();
        try {
            String sql = "SELECT * FROM peliculas";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pelicula p = new Pelicula(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("genero"),
                        rs.getBoolean("apta_para_todo_publico")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void actualizarPelicula(Pelicula p) {
        Connection conn = Conexion.conectar();
        try {
            String sql = "UPDATE peliculas SET nombre=?, genero=?, apta_para_todo_publico=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getGenero());
            stmt.setBoolean(3, p.isApta());
            stmt.setInt(4, p.getId());
            stmt.executeUpdate();
            System.out.println("Película actualizada correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarPelicula(int id) {
        Connection conn = Conexion.conectar();
        try {
            String sql = "DELETE FROM peliculas WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Película eliminada correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
