package movie;

public class Movie {


    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void watchMovie() {
        System.out.println(this.getTitle() + " is a movie");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'S' -> new ScienceFiction(title);
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);

        };
    }
}

