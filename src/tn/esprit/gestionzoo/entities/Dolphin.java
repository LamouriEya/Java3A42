package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed ;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public String toString(){
        return "the dolphin name is "+getName()+" his family "+getFamily()+" age : "+getAge()+" isMammal : "+isMammal()+" habitat: "+habitat +" his swimmingSpeed is "+swimmingSpeed ;
    }

    public void swim(){
        System.out.println("the dolphin is swiming");
    }

    @Override
    public void eatMeat(Food meat) {

    }
}
