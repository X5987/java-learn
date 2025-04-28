package movie;

public class TypeMovie extends Movie {
    public String type;

    public TypeMovie(String title, String type) {
        super(title);
        this.type = type;
    }

    @Override
    public void watchMovie() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(super.getTitle() + " is a " + type + " movie in TypeMovie class");
    }
}
