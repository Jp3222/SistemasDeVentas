package Modelo;

import java.util.Objects;

public class Producto {

    private String ID;
    private String Nombre;
    private String Marca;
    private String Contenido;
    private String UM;
    private String Precio;
    private String Moneda;
    private String[] info;
    private boolean existe;

    public Producto() {
        this.ID = "";
        this.Nombre = "";
        this.Marca = "";
        this.Contenido = "";
        this.UM = "";
        this.Precio = "";
        this.Moneda = "";
        this.info = new String[7];
        this.existe = false;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getUM() {
        return UM;
    }

    public void setUM(String UM) {
        this.UM = UM;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public boolean Existe() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.ID);
        hash = 37 * hash + Objects.hashCode(this.Nombre);
        hash = 37 * hash + Objects.hashCode(this.Marca);
        hash = 37 * hash + Objects.hashCode(this.Contenido);
        hash = 37 * hash + Objects.hashCode(this.UM);
        hash = 37 * hash + Objects.hashCode(this.Precio);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Marca, other.Marca)) {
            return false;
        }
        if (!Objects.equals(this.Contenido, other.Contenido)) {
            return false;
        }
        if (!Objects.equals(this.UM, other.UM)) {
            return false;
        }
        if (!Objects.equals(this.Precio, other.Precio)) {
            return false;
        }
        return true;
    }

    public void setInfo(String[] info) {
        this.info = info;
        this.ID = info[0];
        this.Nombre = info[1];
        this.Marca = info[2];
        this.Contenido = info[3];
        this.UM = info[4];
        this.Precio = info[5];
        this.Moneda = info[6];

    }

    public String[] getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", Nombre=" + Nombre + ", Marca=" + Marca + ", Contenido=" + Contenido + ", UM=" + UM + ", Precio=" + Precio + '}';
    }

}
