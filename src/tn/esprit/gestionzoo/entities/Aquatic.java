package tn.esprit.gestionzoo.entities;

public abstract class  Aquatic  extends Animal implements Carnivore<Food>{
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal , String habitat){
        super( family,  name,  age,  isMammal);
        this.habitat=habitat;
    }


    @Override
    public String toString(){
        return "Aquatic animal name is "+getName()+" his family "+getFamily()+" age : "+getAge()+" isMammal : "+isMammal()+" habitat: "+habitat ;
    }

    public abstract void  swim();

    @Override
    public boolean equals(Object obj){
        if (getName().equals(((Aquatic)obj).getName()) && getAge()==((Aquatic) obj).getAge()
                && this.habitat.equals(((Aquatic) obj).habitat)){

            return true ;
        }
        else {
            return false;
        }
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("aquatic eat meat"+meat);
    }
}
