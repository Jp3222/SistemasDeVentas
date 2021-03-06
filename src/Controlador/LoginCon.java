package Controlador;

import Modelo.Const.ConstSistem;
import Modelo.Empleado;
import Modelo.Operaciones;
import Vista.AdminMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import sistemadeventas.Login;

public class LoginCon extends KeyAdapter implements ActionListener {

    private final Evento evt;

    public LoginCon(Operaciones operaciones, Login login, AdminMenu Admin) {
        evt = new Evento(operaciones);
        evt.setLogin(login);
        evt.setAdmin(Admin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        evt.login();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 10:
                evt.login();
                break;
        }
    }

}

@SuppressWarnings("ClassWithoutLogger")
class Evento {

    private Login login;
    private AdminMenu Admin;
    private final Operaciones op;
    private Empleado empleado;

    Evento(Operaciones operaciones) {
        op = operaciones;

    }

    public void login() {
        Hilo1 relog = Hilo1.getNodo();
        if (!relog.Abrir()) {
            JOptionPane.showMessageDialog(login, "Aun no es Hora de abrir");
            return;
        }
        empleado = op.getEmpleado(login.getUsuario());
        if (empleado.Existe()) {
            if (iniciar(empleado.getUser(), empleado.getPass())) {
                switch (empleado.getCargo()) {
                    case "Gerente":
                        Admin = new AdminMenu(op, login);
                        Admin.setEmpleado(empleado);
                        Admin.setLogin(login);
                        Admin.setVisible(true);
                        break;
                    case "Empleado":

                        break;
                }
                login.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(login, "Este Usuario No existe");
        }

    }

    public boolean iniciar(String nom, String pass) {
        if (!nom.isEmpty() && !pass.isEmpty()) {
            login.getJtfUsuario().setBorder(ConstSistem.BordeCorrecto());
            login.getJpfContrase??a().setBorder(ConstSistem.BordeCorrecto());
            if (nom.equals(login.getUsuario()) && pass.equals(login.getPassWord())) {
                login.getJtfUsuario().setBorder(ConstSistem.BordeCorrecto());
                login.getJpfContrase??a().setBorder(ConstSistem.BordeCorrecto());
                return true;
            } else {
                login.getJtfUsuario().setBorder(ConstSistem.BordeInCorrecto());
                login.getJpfContrase??a().setBorder(ConstSistem.BordeInCorrecto());
                JOptionPane.showMessageDialog(login, "Contrase??a y/o Usuario incorrectos");
            }
        } else {
            login.getJtfUsuario().setBorder(ConstSistem.BordeInCorrecto());
            login.getJpfContrase??a().setBorder(ConstSistem.BordeInCorrecto());
            JOptionPane.showMessageDialog(login, "Campos Vacios");
        }
        return false;
    }

    public void setAdmin(AdminMenu admin) {
        this.Admin = admin;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

}
