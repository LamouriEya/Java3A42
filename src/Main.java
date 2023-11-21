public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employe emp1=new Employe(60,5,"eya","lamouri","info");
        societe.ajouterEmploye(new Employe(1,1,"eya13","lamouri","info"));
        societe.ajouterEmploye(new Employe(2,2,"eya23","lamouri","informatique"));
        societe.ajouterEmploye(new Employe(3,3,"eya33","lamouri","math"));
        societe.ajouterEmploye(emp1);
        societe.displayEmploye();
        System.out.println("eya existe "+societe.rechercherEmploye("eya"));
        System.out.println("asma exist "+societe.rechercherEmploye("asma"));
        System.out.println("employe exist "+societe.rechercherEmploye(emp1));

        //societe.supprimerEmploye(emp1);
        //societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();


    }
}

