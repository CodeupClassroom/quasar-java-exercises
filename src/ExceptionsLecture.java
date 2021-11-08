public class ExceptionsLecture {

    public static void main(String[] args) {

        //Below: examples of checked vs unchecked!
//        throw new RuntimeException("Unchecked - won't trigger the need for try/catch or otherwise");
//
//        try {
//        throw new Exception("Oh no! I'm outside of a try-catch block :( that means I'll have to be added to the method signature!");
//    } catch (Exception e){
//        System.out.println("Everything is okay - we're handling this!");
//    }

        //First examples of lecture:

//        System.out.println("Hello world");
//        try {
//            throw new Exception("Hey, something bad happened.");
//        } catch (Exception e){
//            e.printStackTrace();
//
//        }

        //A deeper example: with try catch

//        try{
//            System.out.println("Let me see if I can divide by zero");
//            int result = 1 / 0;
//            System.out.println("I did it! Math is now MINE!");
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        //An even deeper example - a bigger try catch
//        try{
//            throw new Exception("Something went wrong!\n Error!\n Error!\n");
//            throw new RuntimeException("Runtime Exception! Check the stack trace for details");

//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        } catch(NullPointerException e) {
//            System.out.println("NullPointer exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e){
//            System.out.println("RuntimeException fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e){
//            System.out.println("Generic exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("This will always run");
//        }

            //Final example: Let's trigger an array out of bounds and deal with it programmatically
//        }

            try {
                String[] days = {"Monday", "Tuesday"};

                System.out.println(days[2]);

            }

            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Most specific");
                e.printStackTrace();
                e.getMessage();
            } catch (RuntimeException e){
                System.out.println("Sorta specific :/");
                e.printStackTrace();
            } catch (Exception e){
                System.out.println("Least specific :O");
            }


    }

}
