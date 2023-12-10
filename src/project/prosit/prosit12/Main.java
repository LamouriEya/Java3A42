package project.prosit.prosit12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1,18,"alex"));
        students.add(new Etudiant(4,21,"eya"));
        students.add(new Etudiant(3,15,"sami"));

        StudentManagement studentManagement = new StudentManagement();

        System.out.println("display les etudiants :");
        studentManagement.displayStudents(students,student -> System.out.println(student));

        System.out.println("display with filter ");
        studentManagement.displayStudentsByFilter(students,student ->( student.getId()>1)
                , student -> System.out.println(student));

        System.out.println("student name list");
        System.out.println(studentManagement.returnStudentsNames(students,Etudiant::getNom));

        System.out.println("create a new student");
        Supplier<Etudiant>  etudiantSupplier = ()-> new Etudiant(5,26,"Eva");
        Etudiant newEtudiant = studentManagement.createStudent(etudiantSupplier);
        System.out.println(newEtudiant);
        
    }
}
