public class Candy {
        public String name;
        public String size;

        public void talkaboutCandy(){
            System.out.printf("Ahh, a %s! I see you also got the %s size of it. Looks good! :) %n", this.name, this.size);
        }

    public String stringReturnCandy(){
        return "Oh, a " + this.name + "! I see you got the " + this.size + " of it";
    }

        public Candy(String name){
            this.name = name;
            this.size = "unknown";

        }

        public Candy(String name, String size){
            this.name = name;
            this.size = size;
        }

        public static void main(String[] args) {

            Candy unknownCandy = new Candy("funky candy");

            System.out.println("unknownCandy.name = " + unknownCandy.name);
            System.out.println("unknownCandy.size = " + unknownCandy.size);
            unknownCandy.talkaboutCandy();
            System.out.println(unknownCandy.stringReturnCandy());

            Candy funsizeSnickers = new Candy("Snickers", "fun-size");

            System.out.println("funsizeSnickers.name = " + funsizeSnickers.name);
            System.out.println("funsizeSnickers.size = " + funsizeSnickers.size);
            funsizeSnickers.talkaboutCandy();
            System.out.println(funsizeSnickers.stringReturnCandy());


        }
}
