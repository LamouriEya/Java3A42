import java.util.*;

public class SocieteArrayList implements LGestion<Employe>{

    List<Employe> tabE ;
    public SocieteArrayList(){
        tabE=new ArrayList<Employe>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {

        tabE.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe employe:tabE){
            if(employe.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {

        return tabE.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        tabE.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(tabE);
    }

    @Override
    public void trierEmployeParId() {
// implements comparable in Employe class puis implementer la methode compareTo
        Collections.sort(tabE);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> nomDepartementComparator= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getDep_name().compareTo(o2.getDep_name());
            }
        };

        Comparator<Employe> gradComparator= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()-o2.getGrade();
            }
        };

        Collections.sort(tabE,nomDepartementComparator.thenComparing(gradComparator));

    }
}
