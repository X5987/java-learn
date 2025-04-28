package movie;

public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println(super.getTitle() + " is an " + this.getClass().getSimpleName() + " movie");
    }
}
