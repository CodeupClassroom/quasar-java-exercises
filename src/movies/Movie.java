package movies;

public class Movie {
    //    It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }

    public void setName(String movieName) {
        this.name = movieName;
    }

    public void setCategory(String movieCategory) {
        this.category = movieCategory;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

}
