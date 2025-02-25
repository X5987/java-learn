package vehicules;

class Lancher {
    public static void main(String[] args) {

        int result = RecursionInJava.factorial(10);
        System.out.println(result);
    }
}

class RecursionInJava {
    public static int factorial(int n) {
                if (n == 1) return 1;
                else return n * factorial (n-1);
    }
}

class Personne {
    String nom;

    public Personne(String nom) {
        this.nom = nom;
    }
}

abstract class Vehicule {
    String couleur;
    int taille;
    int ageManufacture;
    String nomModel;
    String marque;
    boolean moteur = false;

    public static void sum(int a, int b) {
        System.out.println("la somme est : " + (a + b));
    }

    public Vehicule(String couleur, int taille, int ageManufacture, String nomModel, String marque) {
        this.couleur = couleur;
        this.taille = taille;
        this.ageManufacture = ageManufacture;
        this.nomModel = nomModel;
        this.marque = marque;
    }

    void demarrer() {
        this.moteur = true;
        System.out.println("Le moteur du " + this.marque + " à démarré " + this.moteur);
    }

    void demarrerPiston() {
        System.out.println("Les pistons sont actif.");
    }
}

class Voiture extends Vehicule {
    public Voiture(String couleur, int taille, int ageManufacture, String nomModel, String marque) {
        super(couleur, taille, ageManufacture, nomModel, marque);
        demarrer();
        System.out.println(demarrers());
        demarrerPiston();
    }


    boolean demarrers() {
        System.out.println("Le moteur du " + this.marque + " à cassé ");
        System.out.println("ccccc");
        return true;
    }

    @Override()
    void demarrerPiston() {
        System.out.println("Les pistons de la voiture sont actif.");
    }
}

class Bateau extends Vehicule {
    public Bateau(String couleur, int taille, int ageManufacture, String nomModel, String marque) {
        super(couleur, taille, ageManufacture, nomModel, marque);
        super.demarrer();
        super.demarrerPiston();
    }
}

