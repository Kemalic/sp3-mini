public class Main {
    public static void main(String[] args) {
        StreamingService service = new StreamingService();
        service.loadMovies("movies.txt"); // Ensure the file path is correct

        for (Movie movie : service.getMovies()) {
            System.out.println(movie);
        }
    }
}
