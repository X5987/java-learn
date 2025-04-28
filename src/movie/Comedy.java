package movie;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println(super.getTitle() + " is an " + this.getClass().getSimpleName() + " movie");
    }
}
