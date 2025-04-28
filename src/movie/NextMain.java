package movie;

public class NextMain {

    public static void main(String[] args) {

        Object unknownObject = Movie.getMovie("S", "Airplane");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        }else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchMovie();
        }else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchMovie();
        }



    }
}
