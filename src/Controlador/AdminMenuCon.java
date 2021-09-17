package Controlador;

import Modelo.Operaciones;
import Modelo.Producto;
import Vista.AdminMenu;
import Vista.BDProductos;
import Vista.Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemadeventas.Login;

public class AdminMenuCon implements ActionListener {

    private static final Logger LOG = Logger.getLogger(AdminMenuCon.class.getName());

    private final Login login;
    private final AdminMenu admin;
    private final Operaciones op;
    private DefaultTableModel modelo;
    private final String[] info;
    private final String[] c = {"Producto", "Contenido", "Costo", "Piezas"};
    //
    private Productos productos;

    public AdminMenuCon(Operaciones op, Login login, AdminMenu admin) {
        this.login = login;
        this.admin = admin;
        this.op = op;
        this.info = new String[4];
        this.modelo = new DefaultTableModel();
        Arrays.fill(info, "");
        for (String x : c) {
            modelo.addColumn(x);
        }

        admin.setJtCanasta(modelo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Productos":
                Productos();
                break;
            case "Salir":
                salir();
                break;
            case "Buscar":
                Buscar();
                break;
            case "Agregar":
                Agregar();
                break;
            case "Cobrar":
                Cobrar();
                break;
            case "Nueva Cuenta":
                Nueva_Cuenta();
                break;
        }
    }

    private void salir() {
        admin.dispose();
        login.setVisible(true);
    }

    private void Buscar() {
        String prod = admin.getProducto();
        if (!prod.isEmpty()) {
            Producto obj = op.getProducto(prod, admin.getBusqueda());
            if (obj.Existe()) {
                info[0] = obj.getNombre();
                info[1] = obj.getContenido() + " " + obj.getUM();
                info[2] = obj.getPrecio();
                admin.setProductoInfo(info);
            } else {
                JOptionPane.showMessageDialog(null, "Este Producto No Esta Disponible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo de busqueda vacio");
        }
    }

    private void Agregar() {
        if (!ArrayEmpty()) {
            int piezas = admin.getPiezas();
            if (piezas > 0) {
                double p = Double.parseDouble(info[2]) * piezas;
                info[2] = "" + p;
                info[3] = "" + piezas;
                modelo.addRow(info);
                admin.setJtCanasta(modelo);
                admin.Empty();
                Arrays.fill(info, "");
            } else {
                JOptionPane.showMessageDialog(null, "Este numero de piezas no esta diponible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        }
    }

    private void Cobrar() {
        double x = 0;
        int j = modelo.getRowCount();
        for (int i = 0; i < j; i++) {
            x += Double.parseDouble((String) modelo.getValueAt(i, 2));
        }
        admin.setTotal(x);
    }

    private void Nueva_Cuenta() {
        modelo = new DefaultTableModel();
        for (String x : c) {
            modelo.addColumn(x);
        }
        admin.setJtCanasta(modelo);
        admin.Empty();
        Arrays.fill(info, "");
    }

    public boolean ArrayEmpty() {
        for (int i = 0; i < info.length - 1; i++) {
            if (info[i].isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void Productos() {
        productos.setVisible(true);
        admin.dispose();
    }

    public void setV(Productos productos) {
        this.productos = productos;
    }

}
