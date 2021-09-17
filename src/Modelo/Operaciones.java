package Modelo;

import Modelo.Const.ConstBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Operaciones {

    private final BD conexion = BD.getInstancia("root", "", "jdbc:mysql://localhost/ajp");

    public Operaciones() {

    }

    public Empleado getEmpleado(String user) {
        Empleado obj = new Empleado();
        try {
            ResultSet rs = conexion.Buscar("*", "usuarios", "user = '" + user + "'");
            if (rs.next()) {
                obj.setExiste(true);
                obj.setInfo(info(rs, 7));
                return obj;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public Producto getProducto(String txt, int x) {
        Producto obj = new Producto();
        try {
            ResultSet rs = null;
            switch (x) {
                case 0:
                    rs = conexion.Buscar("*", "productos", "id = '" + txt + "'");
                    break;
                case 1:
                    rs = conexion.Buscar("*", "productos", "nombre = '" + txt + "'");
                    break;
            }
            if (rs.next()) {
                obj.setExiste(true);
                obj.setInfo(info(rs, 7));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getCause());
            ex.printStackTrace();
        }
        return obj;
    }

    private String[] info(ResultSet rs, int n) throws SQLException {
        String obj[] = new String[n];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = rs.getString((i + 1));
        }
        return obj;
    }

    public DefaultTableModel Tabla() throws SQLException {
        return conexion.CrearTabla(ConstBD.getDias(), "agenda", "");
    }

}
