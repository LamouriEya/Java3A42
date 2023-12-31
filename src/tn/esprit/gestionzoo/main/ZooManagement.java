package tn.esprit.gestionzoo.main;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.* ;
public class ZooManagement {
    public static void main(String[] args) throws ZooFullException {
        /** int nbrCages =20 ;
        String zooName="my zoo";
        System.out.println(zooName +" comporte "+nbrCages+" cages");



        Scanner put  = new Scanner(System.in);
        System.out.println("entrer le nombre des cages");
        int nbr = put.nextInt();
        System.out.println("entrer le nom de zoo");
        String name = put.next();

        System.out.println(name +" comporte "+nbr+" cages");

        //****************************
        Animal lion = new Animal();
        lion.family= "lion"; lion.age=26; lion.name="lion";lion.isMammal=false;

        Zoo myZoo= new Zoo();
        myZoo.name="myZoo";
        myZoo.city="tunis";

        Zoo myZoo2= new Zoo("zoo2","tunis");
        //**********************

        Animal cat = new Animal("choo","chouchou",2,true);
        Animal dog = new Animal("dog","Leo",4,true);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());//reinitialiser toString

        dog.displayAnimal();

        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(cat);
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(cat);

        myZoo2.zooAnimals();
        myZoo2.searchAnimal(lion);
        myZoo2.searchAnimal(dog);

        //myZoo2.removeAnimal(dog);
        myZoo2.zooAnimals();
        System.out.println(myZoo2.isZooFull());
        Zoo newZoo = new Zoo("zoo","tunis");
        System.out.println(newZoo.isZooFull());
        
        System.out.println(newZoo.comparerZoo(newZoo,myZoo2));
         */
        /*
        Zoo myZoo= new Zoo("zoo","tunis");
        Animal cat = new Animal("choo","chouchou",2,true);
        Animal dog = new Animal("dog","Leo",4,true);
        myZoo.displayZoo();
        cat.setAge(-2);
        cat.displayAnimal();
        myZoo.addAnimal(cat);
        myZoo.addAnimal(dog);
        myZoo.setName("");
        myZoo.displayZoo();
        */
/*
        Dolphin D = new Dolphin("dolphini", "didi", 4, false, "sea", 20);
        System.out.println(D);
        Penguin p = new Penguin("penni", "fifi", 4, false, "sea", 600);
        System.out.println(p);
        //Aquatic a = new Aquatic("aqui", "kiki", 4, false, "sea");
        //System.out.println(a);
        //Aquatic aa = new Aquatic("aqui", "quiqui", 4, false, "sea");
        //System.out.println(a);
        Terrestrial t = new Terrestrial("terres", "titi", 2, false, 4);
        System.out.println(t);

        D.swim();
        p.swim();
        //a.swim();
        Zoo myZoo= new Zoo("zoo","tunis");
        myZoo.addAquaticAnimal(D);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(D);
        for(int i=0 ; i<myZoo.getAquaticAnimals().length;i++){
            Aquatic[] tab= myZoo.getAquaticAnimals();
            tab[i].swim();
        }
        myZoo.displayNumberOfAquaticsByType();

        System.out.println( D.equals(p));
        Penguin p1 = new Penguin("penni", "fifi", 4, false, "sea", 600);
        Penguin p2 = new Penguin("penni", "fifi", 4, false, "sea", 200);
        Penguin p3 = new Penguin("penni", "fifi", 4, false, "sea", 1600);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        System.out.println(myZoo.maxPenguinSwimmingDepth());

 */
        Zoo zoo1=new Zoo("nourou","xxxx");
        try{
            zoo1.addAnimal(new Animal("doggy", "dog", 2, false));
            zoo1.addAnimal(new Animal("doggy1", "dog1", 2, false));

            zoo1.addAnimal(new Animal("doggy2", "dog2", 2, false));

            zoo1.addAnimal(new Animal("doggy23", "dog3", -2, false));
        }catch (ZooFullException e){
            System.out.println(e.getMessage());
        }catch (InvalidAgeException i){
            System.out.println("Invalid age exception"+i.getMessage());
        }
        System.out.println(zoo1);
        zoo1.zooAnimals();

        Terrestrial t = new Terrestrial("terres", "titi", 2, false, 4);
        //Aquatic a = new Aquatic("aqui", "kiki", 4, false, "sea") ;
        Penguin p = new Penguin("penni", "fifi", 4, false, "sea", 600);
        t.eatPlantAndMeet(Food.BOTH);
        p.eatMeat(Food.MEAT);
    }
}
