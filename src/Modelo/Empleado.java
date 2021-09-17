package Modelo;

import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleado extends Persona {

    private String user;
    private String cargo;
    private String pass;
    private boolean Existe;
    private String[] info;

    public Empleado() {
        cargo = "";
        pass = "";
        info = new String[7];
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;

    }

    public String getCargo() {
        return cargo;

    }

    public void setCargo(String cargo) throws SQLException {
        this.cargo = cargo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;

    }

    public void setExiste(boolean Existe) {
        this.Existe = Existe;
    }

    public boolean Existe() {
        return Existe;
    }

    public void setInfo(String[] info) {
        this.info = info;
        user = info[0];
        setNom(info[1]);
        setAPaterno(info[2]);
        setAMaterno(info[3]);
        setEdad(info[4]);
        cargo = info[5];
        pass = info[6];
    }

    public String[] getInfo() {
        return info;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.cargo);
        hash = 47 * hash + Objects.hashCode(this.pass);
        hash = 47 * hash + (this.Existe ? 1 : 0);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.Existe != other.Existe) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        return Objects.equals(this.pass, other.pass);
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", pass=" + pass + '}' + super.toString();
    }

}
