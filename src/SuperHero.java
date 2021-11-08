public class SuperHero extends Person {
    private String alterEgo; //For our taxpayer name - "Clark Kent"

    public SuperHero(String governmentName, String alterEgo){
        super(governmentName);
        this.alterEgo = alterEgo;
    }

    public String getName(){
        return alterEgo;
    }

    public String getSecretIdentity(){
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());

        System.out.println("theManOfSteel.getSecretIdentity() = " + theManOfSteel.getSecretIdentity());

    }



}
