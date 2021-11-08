package movies;

import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
//    3.
//    - Give the user a list of options for viewing all the movies or viewing movies by category.
//    - Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//    - If a category is selected, only movies from that category should be displayed.
//    - Your application should continue to run until the user chooses to exit.


    public static void main(String[] args) {
        System.out.println("Hello welcome to my movie application!");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("");

        System.out.println("Enter your choice: ");
        Input in = new Input();
        String userInput = in.getString();

        if (userInput.equals("0")) {
            System.out.println("Goodbye!");
        } else if (userInput.equals("1")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
            }
            repeat();
        } else if (userInput.equals("2")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("animated")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("3")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("drama")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("4")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("horror")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("5")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("scifi")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        }
    }

    private static void repeat(){
        System.out.println("----------");
        System.out.println("NAVIGATION");
        System.out.println("0-exit 1-all 2-animated 3-drama 4-horror 5-scifi");

        System.out.println("Enter your choice: ");
        Input in = new Input();
        String userInput = in.getString();

        if (userInput.equals("0")) {
            System.out.println("Goodbye!");
        } else if (userInput.equals("1")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
            }
            repeat();
        } else if (userInput.equals("2")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if(pMovie.getCategory().equals("animated")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                }else{
                    continue;
                }
            }
            repeat();
        }else if (userInput.equals("3")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("drama")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("4")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("horror")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("5")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals("scifi")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        }

    }
}
