package project.prosit.HashSet;

import project.prosit.HashSet.Departement;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    HashSet<Departement> tabD;
    public DepartementHashSet(){
        tabD= new HashSet<Departement>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        tabD.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement dep: tabD){
            if (dep.getDep_name().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return tabD.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        tabD.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : tabD) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
// implements Comparable dans la classe Departement puis implementer la metheode compareTo selon l'id
        return new TreeSet<>(tabD);
    }
}
