package sistemadeventas;

import Modelo.Operaciones;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class SistemaDeVentas {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> Inicio());

    }

    private static void Inicio() {
        Operaciones operaciones = new Operaciones();
        Login login = new Login(operaciones);
        login.setVisible(true);
    }

}

class Ejemplo {

    String x[];
    String nom;

    public Ejemplo(String nom) {
        this.x = new String[1000];
        this.nom = nom;
    }

    public String[] getX() {
        return x;
    }

    public void setX(String[] x) {
        this.x = x;
    }

    @Override
    @SuppressWarnings({"deprecation", "FinalizeDeclaration"})
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Boorando" + nom);
    }

}
