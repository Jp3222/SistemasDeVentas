package Modelo;

import java.util.Objects;

class Persona {

    private String nom;
    private String APaterno;
    private String AMaterno;
    private String Edad;

    Persona() {
        this.nom = "";
        this.APaterno = "";
        this.AMaterno = "";
        this.Edad = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.APaterno);
        hash = 79 * hash + Objects.hashCode(this.AMaterno);
        hash = 79 * hash + Objects.hashCode(this.Edad);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.APaterno, other.APaterno)) {
            return false;
        }
        if (!Objects.equals(this.AMaterno, other.AMaterno)) {
            return false;
        }
        return Objects.equals(this.Edad, other.Edad);
    }

   

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", APaterno=" + APaterno + ", AMaterno=" + AMaterno + ", Edad=" + Edad + '}';
    }

}
