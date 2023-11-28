package project.prosit.Map;

import project.prosit.HashSet.Departement;
import project.prosit.List.Employe;

import java.util.TreeMap;

public class mainMap {
    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        Employe employe1 = new Employe(3, 1, "eya", "lamouri", "a");
        Employe employe2 = new Employe(2,3,"sam","lam","b");

        Departement departementA = new Departement(1,5,"a");
        Departement departementB = new Departement(2,10,"b");

        // Instruction 3
        affectationMap.ajouterEmployeDepartement(employe1, departementA);
        affectationMap.ajouterEmployeDepartement(employe2, departementB);
        affectationMap.afficherEmployesEtDepartements();
        System.out.println("--------------------------------------------");
        // Instruction 3 (ajouter le même employé à deux départements différents)
        affectationMap.ajouterEmployeDepartement(employe1, departementB);
        affectationMap.afficherEmployesEtDepartements();
        System.out.println("--------------------------------------------");
        // Instructions 4 et 5
        //affectationMap.supprimerEmploye(employe1);
        //affectationMap.supprimerEmployeEtDepartement(employe2, departementA);
        affectationMap.afficherEmployesEtDepartements();
        System.out.println("--------------------------------------------");
        // Instructions 6 et 7
        affectationMap.afficherEmployes();
        affectationMap.afficherDepartements();
        System.out.println("--------------------------------------------");
        // Instructions 8 et 9
        System.out.println("Rechercher employé : " + affectationMap.rechercherEmploye(employe2));
        System.out.println("Rechercher département : " + affectationMap.rechercherDepartement(departementA));
        System.out.println("--------------------------------------------");
        // Instruction 10
        TreeMap<Employe, Departement> employeDepartementTreeMap = affectationMap.trierMap();
        System.out.println("Affectations triées : " + employeDepartementTreeMap);

    }
}
