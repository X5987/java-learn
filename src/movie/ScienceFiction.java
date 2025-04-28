// ScienceFiction.java
package movie;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("→ Des aliens apparaissent");
        System.out.println("→ Les héros ripostent");
        System.out.println("→ BOUM, planète détruite !");
    }
}
