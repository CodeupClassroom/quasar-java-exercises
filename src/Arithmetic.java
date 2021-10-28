public class Arithmetic {

    //static fields
    //a static property:
    public static double pi = 3.14159;

    //static methods:
    public static int add(int x, int y){
      return x + y;
    };

    public static void main(String[] args) {
        //Do not walk down this road w/ static:
        Arithmetic myMath = new Arithmetic();

        System.out.println(myMath.pi); //still would 'work' - but INCORRECT

        System.out.println("Arithmetic.pi = " + Arithmetic.pi);

        System.out.println("Arithmetic.add(2,2) = " + Arithmetic.add(2, 2));

        System.out.println("Math.PI = " + Math.PI); //We've accessed some of this functionality before :D
        //Now we know how to write it ourselves

    }

}
