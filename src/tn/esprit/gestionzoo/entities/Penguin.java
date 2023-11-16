package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth ;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString(){
        return "the penguin name is "+getName()+" his family "+getFamily()+" age : "+getAge()+" isMammal : "+isMammal()+" habitat: "+habitat +" his swimmingDepth is "+swimmingDepth ;
    }

    @Override
    public void swim() {
        System.out.println("penguin swim");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("penguin eat meat"+meat);
    }
}
