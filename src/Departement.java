import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id,nbrEmplye;
    private String dep_name;
    public Departement(){

    }

    public Departement(int id, int nbrEmplye, String dep_name) {
        this.id = id;
        this.nbrEmplye = nbrEmplye;
        this.dep_name = dep_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmplye() {
        return nbrEmplye;
    }

    public void setNbrEmplye(int nbrEmplye) {
        this.nbrEmplye = nbrEmplye;
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
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(dep_name, that.dep_name);
    }



    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbrEmplye=" + nbrEmplye +
                ", dep_name='" + dep_name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
