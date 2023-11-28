package project.prosit.List;

import java.util.Objects;

public class Employe implements Comparable<Employe> {
    int identifiant,grade;
    String nom,prenom,dep_name;

    public Employe(){}
    public Employe(int identifiant, int grade, String nom, String prenom, String dep_name) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.dep_name = dep_name;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return identifiant == employe.identifiant && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dep_name='" + dep_name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return this.identifiant-o.identifiant;
    }
}
