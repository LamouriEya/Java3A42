package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collector;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

    public class Level3 {

        public static void main(String[] args) {
            List<Teacher> teachers = Data.employees();

            /* TO DO 1: Retourner une chaîne de caractères qui contient tous les noms des enseignants en majuscule séparés par # */
            String names = teachers.stream()
                    .map(Teacher::getName)
                    .map(String::toUpperCase)
                    .reduce((name1, name2) -> name1 + "#" + name2)
                    .orElse("");
            System.out.println("TO DO 1: Noms des enseignants en majuscule séparés par #: " + names);

            /* TO DO 2: Retourner un ensemble d'enseignants Java dont le salaire > 80000 */
            Set<Teacher> teachers1 = teachers.stream()
                    .filter(teacher -> teacher.getSubject() == Subject.JAVA && teacher.getSalary() > 80000)
                    .collect(Collectors.toSet());
            System.out.println("TO DO 2: Ensemble d'enseignants Java dont le salaire > 80000: " + teachers1);

            /* TO DO 3: Retourner un TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
            TreeSet<Teacher> teachers2 = teachers.stream()
                    .collect(Collectors.toCollection(() ->
                            new TreeSet<>(Comparator.comparing(Teacher::getName)
                                    .thenComparingInt(Teacher::getSalary))));
            System.out.println("TO DO 3: TreeSet d'enseignants triés par nom et salaire: " + teachers2);

            /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
            Map<Integer, List<Teacher>> map = teachers.stream()
                    .collect(Collectors.groupingBy(teacher -> teacher.getSubject().ordinal()));
            System.out.println("TO DO 4: Map regroupant les enseignants par module: " + map);

            /* TO DO 5: Retourner une Map qui regroupe les noms des enseignants par salaire */
            Map<Integer, String> map1 = teachers.stream()
                    .collect(Collectors.groupingBy(Teacher::getSalary,
                            Collectors.mapping(Teacher::getName, Collectors.joining(", "))));
            System.out.println("TO DO 5: Map regroupant les noms des enseignants par salaire: " + map1);
        }
    }