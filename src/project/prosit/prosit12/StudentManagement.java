package project.prosit.prosit12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> etudiants, Consumer<Etudiant> con) {
        etudiants.forEach(con);
    }
    //Consumer :: methode d'affichage
    @Override
    public void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        etudiants.stream()
                .filter(pre)
                .forEach(con);
    }
    //Predicate :: methode de test, renvoie un booléen
    @Override
    public String returnStudentsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun) {
        return etudiants.stream()
                .map(fun)
                .collect(Collectors.joining(", "));
    }
    //Function :: Une interface fonctionnelle représentant une méthode qui prend un
    //type d'entrée et renvoie un type de sortie.
    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }
    //Supplier :: renvoie un type specifique ( bl get() )
    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com) {
        return etudiants.stream() // convert list to a stream
                .sorted(com)
                .collect(Collectors.toList());
    }
    //Comparator :: compare deux objets pour determiner leur ordre

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants) {
        return etudiants.stream();
    }
}
