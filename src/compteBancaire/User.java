package compteBancaire;

class Launcher {
    public static void main(String[] args) {

        User user = new User("Doe", "John",

                "0600000000", "user1@gmail.com", "01/01/2000", "01/01/2021", "01/01/2021", "01/01/2021",

                Genre.HOMME,

                new Adress(1L, "13", "rue de la paix", "Paris", "75000", "France"),

                new Agence(1L, 12345, 12345, 12345, 12345,
                        new Adress(1L, "13", "rue de la paix", "Paris", "75000", "France")),

                new CompteCourant(2014.22, 1L, "123456789", "123456789", "123456789", 1L)
        );

        System.out.println("nom prenom : " + user.nom  + " " + user.prenom);
        System.out.println("telephone : " + user.telephone);
        user.adress.afficherAdress();

        System.out.println("numeroGuichet : " + user.agence.numeroGuichet);
        System.out.println("numeroAgence : " + user.compteCourant.idAgence);

        System.out.println("user: " + user.compteCourant.userId + " -- solde: " + user.compteCourant.soldeView() + "€");
        user.compteCourant.incrementMontant(500);

        System.out.println("Le solde actuel après ajout de 500€ est: " + user.compteCourant.soldeView() + "€");

        user.compteCourant.decrementMontant(1000.55);
        System.out.println("Transfert d'argent dans votre PEL depuis le compte courant de 1000.55€, votre solde est de: " + user.compteCourant.soldeView() + "€");

    }
}

public class User {

    private Long id;

    protected String nom;
    protected String prenom;
    protected String telephone;
    private final String email;
    private final String dateDeNaissance;
    private String dateDeCreation;
    private String dateDeModification;
    private final String dateDeFermeture;

    private Genre genre;
    protected Adress adress;
    public Agence agence;
    public Compte compte;
    public CompteCourant compteCourant;

    public User(String nom, String prenom,
                String telephone, String email, String dateDeNaissance,
                String dateDeCreation, String dateDeModification, String dateDeFermeture,
                Genre genre,
                Adress adress,
                Agence agence,
                CompteCourant compteCourant) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDeCreation = dateDeCreation;
        this.dateDeModification = dateDeModification;
        this.dateDeFermeture = dateDeFermeture;
        this.genre = genre;
        this.adress = adress;
        this.agence = agence;
        this.compteCourant = compteCourant;
    }


}
