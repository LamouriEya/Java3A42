package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return "Terrestrial animal name is "+getName()+" his family "+getFamily()+" age : "+getAge()+" isMammal : "+isMammal()+" nbr de legs: "+nbrLegs ;
    }
}
