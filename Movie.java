import java.util.ArrayList;

public class Movie {
    private String title;
    private int year;
    private ArrayList<String> categories;
    private double rating;

    public Movie(String title, int year, ArrayList<String> categories, double rating) {
        this.title = title;
        this.year = year;
        this.categories = categories;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", categories=" + categories +
                ", rating=" + rating +
                '}';
    }
}
