package compteBancaire;

public class Adress {

    private Long id;
    private String numero;
    private String rue;
    private String codePostal;
    private String ville;
    private String pays;

    public Adress(Long id, String numero, String rue, String codePostal, String ville, String pays) {
        this.id = id;
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public void afficherAdress() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Rue: " + this.rue);
        System.out.println("Code postal: " + this.codePostal);
        System.out.println("Ville: " + this.ville);
        System.out.println("Pays: " + this.pays);
    }
}
