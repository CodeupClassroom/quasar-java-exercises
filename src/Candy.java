import java.util.Arrays;

public class Candy {
        public String name;
        public String size;
        public String[] descriptors;


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

        public Candy(String name, String size, String[] descriptors){
            this.name = name;
            this.size = size;
            this.descriptors = descriptors;
        }



        public static Candy[] addCandy(Candy[] oldArray, Candy newCandy){
            Candy[] newarrPlusOne = Arrays.copyOf(oldArray, oldArray.length+1); //copy oldarr to the new one and add an additional index of length

            newarrPlusOne[newarrPlusOne.length-1] = newCandy;

            return newarrPlusOne;
        }

        public static void main(String[] args) {

//            Candy unknownCandy = new Candy("funky candy");
//
//            System.out.println("unknownCandy.name = " + unknownCandy.name);
//            System.out.println("unknownCandy.size = " + unknownCandy.size);
//            unknownCandy.talkaboutCandy();
//            System.out.println(unknownCandy.stringReturnCandy());
//
//            Candy funsizeSnickers = new Candy("Snickers", "fun-size");
//
//            System.out.println("funsizeSnickers.name = " + funsizeSnickers.name);
//            System.out.println("funsizeSnickers.size = " + funsizeSnickers.size);
//            funsizeSnickers.talkaboutCandy();
//            System.out.println(funsizeSnickers.stringReturnCandy());

            //Below: arr exer1 based example

//            Candy unknownCandy = new Candy("funky candy");
//            Candy funsizeSnickers = new Candy("Snickers", "fun-size");
//            Candy fullsizeKitKat = new Candy("Kit-Kat", "full-size");
//
//            Candy[] myBag = {unknownCandy, funsizeSnickers, fullsizeKitKat};
//
//            for(Candy singleCandy : myBag){ //Let's iterate through the old bag first
//                System.out.println(singleCandy.name);
//            }
//
//            //Let's use our method to add in a new candy we got:
//
//            Candy newCandy = new Candy("Hershey's Kiss", "kiss-size");
//
//            Candy[] newBag = Candy.addCandy(myBag, newCandy);
//
//            for(Candy singleCandy : newBag){//Ah! Now let's see if our new candy is in this array
//                System.out.println(singleCandy.name);
//            }


            //Below: descriptors work for 2nd warmUp

            Candy funsizeSnickers = new Candy("Snickers", "fun-size", new String[] {"treenut allergy", "chocolate-covering", "classic"});
            Candy fullsizeKitKat = new Candy("Kit-Kat", "full-size", new String[] {"wafer", "chocolate-covering", "classic"});

            System.out.println(Arrays.toString(fullsizeKitKat.descriptors));

            Candy[] myBag = {funsizeSnickers, fullsizeKitKat};

            for(Candy singleCandy : myBag){
//                String descriptors = Arrays.toString(singleCandy.descriptors);
//                descriptors = descriptors.substring(1, descriptors.length() - 1);
                System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, Arrays.toString(singleCandy.descriptors));


            }




        }
}
