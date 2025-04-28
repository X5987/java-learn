package bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Launcher {
    public static void main(String[] args) {
//        User newUser = new User(1L);
//        User.userInformation();
//        User.userAccount("John");
//        newUser.usercheque();
//        System.out.println(newUser.toString());
//
//        LPAUser lpaUser = new LPAUser(1L, "CACA", "PIPI", "0651940502");
//        System.out.println(lpaUser);

        CompteCourant compteCourant = new CompteCourant("123456789", "123456789",
                1L, 2014.22, 0);

        System.out.println(compteCourant);
        compteCourant.afficherCompte();

        List<String> noms = new ArrayList<>();
        noms.add("Alice");
        noms.add("Bob");
        noms.add("clude");
        noms.add("clarance");
        noms.add("dédé");
        noms.add("eddy");
        noms.add("fifi");
        noms.add("gégé");

        System.out.println(noms);
    }


}


public class User {

    protected Long id;

    protected String nom;
    protected String prenom;
    protected String telephone;
    private String email;
    private Date dateDeNaissance;
    private Date dateDeCreation;
    protected Date dateDeModification;
    private Date dateDeFermeture;

    private bank.Genre genre;
    protected bank.Adress adress;
    public Agence agence;
    public Compte compte;
    public CompteCourant compteCourant;

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String nom, String prenom, String telephone, String email, Date dateDeNaissance,
                Date dateDeCreation, Date dateDeModification, Date dateDeFermeture) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDeCreation = dateDeCreation;
        this.dateDeModification = dateDeModification;
        this.dateDeFermeture = dateDeFermeture;
    }

    public User(Long id, String nom, String prenom, String telephone, String email, Date dateDeNaissance,
                Date dateDeCreation, Date dateDeModification, Date dateDeFermeture,
                Genre genre, Adress adress, Agence agence, CompteCourant compteCourant) {
        this.id = id;
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

    public void afficherUser() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Telephone: " + this.telephone);
        System.out.println("Email: " + this.email);
        System.out.println("Date de naissance: " + this.dateDeNaissance);
        System.out.println("Date de creation: " + this.dateDeCreation);
        System.out.println("Date de modification: " + this.dateDeModification);
        System.out.println("Date de fermeture: " + this.dateDeFermeture);
        System.out.println("Genre: " + this.genre);
    }

    public static void userAccount(String prenom) {
        prenom = "John";
        System.out.println(prenom);
        System.out.println("userAccount");
    }

    public void usercheque() {
        System.out.println("usercheque");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", dateDeCreation=" + dateDeCreation +
                ", dateDeModification=" + dateDeModification +
                ", dateDeFermeture=" + dateDeFermeture +
                ", genre=" + genre +
                ", adress=" + adress +
                ", agence=" + agence +
                ", compte=" + compte +
                ", compteCourant=" + compteCourant +
                '}';
    }

    public static void userInformation() {

        User user = new User(1L, "Doe", "John", "0651940502", "user1@gmail.com",
                new Date(2025, 3, 10), new Date(2025, 3, 10),
                new Date(2025, 3, 10), new Date(2025, 3, 10),
                Genre.HOMME,
                new Adress(1L, "14", "rue des fonds bruns", "95640", "Eragny", "France"),

                new Agence(1L, 12345, 12345, 12345, 12345,
                        new Adress(2L, "13", "rue de la paix", "75020", "Paris", "France")),
                new CompteCourant("123456789", "123456789", 1L, 2014.22, 0)
        );

        user.afficherUser();
        System.out.println("----------------------------------------------------------------------------------------------");
        user.adress.afficherAdress();
        System.out.println("----------------------------------------------------------------------------------------------");
        user.agence.afficherAgence();
        System.out.println("----------------------------------------------------------------------------------------------");

        System.out.println("user: " + user.id + " -- solde: " + user.compteCourant.soldeView() + "€");
        user.compteCourant.incrementMontant(500);

        System.out.println("Le solde actuel après ajout de 500€ est: " + user.compteCourant.soldeView() + "€");

        user.compteCourant.decrementMontant(1000.55);
        System.out.println("Transfert d'argent dans votre PEL depuis le compte courant de 1000.55€, votre solde est de: " + user.compteCourant.soldeView() + "€");
    }
}


