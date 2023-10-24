package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family , name;
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }
        else{
            System.out.println("age must be +");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void displayAnimal(){
        System.out.println("l animal' "+ name+" est de la famille :"+family+" age: :"+ age+" isMammal :"+isMammal);
    }
}
