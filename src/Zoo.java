public class Zoo {
    Animal[] animals; String name,city;
    final int nbrCages=3;
    public  Zoo(){

    }
    public Zoo( String name, String city /*, int nbrCages*/) {
        this.animals= new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("la zoo "+ name+" city :"+city+" nbrCages :"+ nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal " + animal.name + " already exists in the zoo.");
            return false;
        }

        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Animal " + animal.name + " added successfully to the zoo.");
                return true;
            }
        }

        System.out.println("No available cage to add animal " + animal.name + ".");
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
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                System.out.println("Animal " + animal.name + " exists in the zoo.");
                return i;
            }
        }
        System.out.println("Animal " + animal.name + " not found in the zoo.");
        return -1;
    }
    @Override
    public String toString(){
        return "zoo name "+name+" city :"+city+" nbrCages : "+nbrCages ;
    }

    public boolean removeAnimal(Animal animalToRemove) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animalToRemove.name.equals(animals[i].name)) {
                animals[i] = null;
                System.out.println("Animal " + animalToRemove.name + " removed from the zoo.");
                return true;
            }
        }
        System.out.println("Animal " + animalToRemove.name + " not found in the zoo.");
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
