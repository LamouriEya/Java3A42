import java.util.TreeSet;

public class MainDep {
    public static void main(String[] args) {
        // Create some Departement instances
        Departement departement1 = new Departement(1, 50,"IT Department");
        Departement departement2 = new Departement(2, 30,"HR Department" );
        Departement departement3 = new Departement(3,40, "Marketing Department");

        // Create an instance of DepartementHashSet
        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Test ajouterDepartement
        departementHashSet.ajouterDepartement(departement1);
        departementHashSet.ajouterDepartement(departement2);
        departementHashSet.ajouterDepartement(departement3);

        // Test displayDepartement
        System.out.println("Liste des départements:");
        departementHashSet.displayDepartement();
        System.out.println();

        // Test rechercherDepartement
        String searchDepartment = "HR Department";
        boolean isDepartmentFound = departementHashSet.rechercherDepartement(searchDepartment);
        System.out.println("Le département '" + searchDepartment + "' existe : " + isDepartmentFound);
        System.out.println();
        // Test rechercherDepartement 2
        System.out.println(departement1 +" existe ? : "+ departementHashSet.rechercherDepartement(departement1));

        // Test trierDepartementById
        System.out.println("Liste des départements triée par ID:");
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        for (Departement departement : sortedDepartements) {
            System.out.println(departement);
        }
        System.out.println("---------------------------------------------------");
        // Supprimer un element
        departementHashSet.supprimerDepartement(departement1);
        departementHashSet.displayDepartement();
    }
}
