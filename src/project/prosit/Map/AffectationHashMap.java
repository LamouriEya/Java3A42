package project.prosit.Map;

import project.prosit.HashSet.Departement;
import project.prosit.List.Employe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class AffectationHashMap {
    private HashMap<Employe,Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        System.out.println("Affectations: ");
        for (Map.Entry<Employe,Departement> entry : affectations.entrySet()){
            System.out.println(entry.getKey().getNom()+" -> "+ entry.getValue().getDep_name());
        }
    }
    public void supprimerEmploye (Employe e){
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e,Departement d){
        if (affectations.containsKey(e) && affectations.get(e).getDep_name().equals(d.getDep_name())) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes(){
        System.out.println("Liste des employés :");
        for (Employe employe : affectations.keySet()) {
            System.out.println(employe.getNom());
        }
    }
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println(departement.getDep_name());
        }
    }
    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }
    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
