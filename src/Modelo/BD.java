package Modelo;

package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BD {

    private static final Logger LOG = Logger.getLogger(BD.class.getName());
    private static BD Instancia;

    public static BD getInstancia(String user, String password, String url) {
        if (Instancia == null) {
            return new BD(url, user, password);
        }
        return Instancia;
    }

    private Connection cn;
    private PreparedStatement ps;
    private Statement st;

    private BD(String url, String user, String password) {
        try {
            this.cn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion establecida");
        } catch (SQLException ex) {
            System.err.println("Error en la conexion\n" + ex.getMessage());
        }
    }

    public void Insertar(String tabla, String[] object) throws SQLException {
        String g = "";
        for (String string : object) {
            g += "'" + string + "',";
        }

        g = g.substring(0, g.length() - 1);
        st = cn.createStatement();
        st.executeUpdate("insert into " + tabla + " values (" + g + ")");
    }

    public void Eliminar(String tabla, String where) throws SQLException {
        st = cn.createStatement();
        st.executeUpdate("Delete from " + tabla + " where " + where);
    }

    public void Actualizar(String tabla, String campo, String newdate, String where) throws SQLException {
        st = cn.createStatement();
        st.executeUpdate("update " + tabla + " set " + campo + " = '" + newdate + "' where " + where);
    }

    public ResultSet Buscar(String object, String table, String where) throws SQLException {
        ps = cn.prepareStatement("select " + object + " from " + table + " where " + where);
        return ps.executeQuery();
    }

    public ResultSet Buscar(String object, String table) throws SQLException {
        ps = cn.prepareStatement("select " + object + " from " + table);
        return ps.executeQuery();
    }

    public DefaultTableModel CrearTabla(String[] c, String tabla, String where) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        for (String string : c) {
            modelo.addColumn(string);
        }
        ResultSet rs;
        if (where.isEmpty()) {
            rs = Buscar("*", "contactos");
        } else {
            rs = Buscar("*", "contactos", where);
        }
        String datos[] = new String[c.length];
        while (rs.next()) {
            for (int i = 0; i < datos.length; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
        }

        return modelo;
    }
    
    

}
