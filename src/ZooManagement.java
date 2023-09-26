import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        int nbrCages =20 ;
        String zooName="my zoo";
        System.out.println(zooName +" comporte "+nbrCages+" cages");

        /**

        Scanner put  = new Scanner(System.in);
        System.out.println("entrer le nombre des cages");
        int nbr = put.nextInt();
        System.out.println("entrer le nom de zoo");
        String name = put.next();

        System.out.println(name +" comporte "+nbr+" cages");
    */
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
    }
}
