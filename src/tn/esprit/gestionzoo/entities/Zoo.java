package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;

public class Zoo {
    Animal[] animals;
    private String name,city;
    final int nbrCages=2;
    public  Zoo(){

    }
    public Zoo( String name, String city /*, int nbrCages*/) {

        this.animals= new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        }
        else {
            System.out.println("name can't be empty");
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo(){
        System.out.println("la zoo "+ name+" city :"+city+" nbrCages :"+ nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()){
            System.out.println("No available cage to add animal " + animal.getName() + ".");
            return false;
        }
        else {
            if (searchAnimal(animal) != -1) {
                System.out.println("Animal " + animal.getName() + " already exists in the zoo.");
                return false;
            }

            for (int i = 0; i < nbrCages; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    System.out.println("Animal " + animal.getName() + " added successfully to the zoo.");
                    return true;
                }
            }
        }
        return false;
    }

    public void zooAnimals() {
        System.out.println("Animals in " + name + " Zoo:");
        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimal();
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animal.getName().equals(animals[i].getName())) {
                System.out.println("Animal " + animal.getName() + " exists in the zoo.");
                return i;
            }
        }
        System.out.println("Animal " + animal.getName() + " not found in the zoo.");
        return -1;
    }
    @Override
    public String toString(){
        return "zoo name "+name+" city :"+city+" nbrCages : "+nbrCages ;
    }

    public boolean removeAnimal(Animal animalToRemove) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animalToRemove.getName().equals(animals[i].getName())) {
                animals[i] = null;
                System.out.println("Animal " + animalToRemove.getName() + " removed from the zoo.");
                return true;
            }
        }
        System.out.println("Animal " + animalToRemove.getName() + " not found in the zoo.");
        return false;
    }

    boolean isZooFull(){

        if(animals[nbrCages-1]!=null){
            return true;
        }
        return false;
    }
    int AnimalsZooNn(){
        int nb=0;
        for (Animal animal : animals) {
            if (animal != null) {
                nb++;
            }
        }
        return nb;
    }
    Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.AnimalsZooNn()==z2.AnimalsZooNn()){
            System.out.println("animals number same");
        }
        if(z1.AnimalsZooNn()>z2.AnimalsZooNn()){
            return z1;
        }
        else{
            return z2;
        }

    }



}
