package bank;

public class Compte{

    private Long id;
    protected String numeroCompte;
    protected String numeroCarte;
    protected Long idAgence;

    public Compte() {
    }

    public Compte(String numeroCompte, String numeroCarte, Long idAgence) {
        this.numeroCompte = numeroCompte;
        this.numeroCarte = numeroCarte;
        this.idAgence = idAgence;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numeroCompte='" + numeroCompte + '\'' +
                ", numeroCarte='" + numeroCarte + '\'' +
                ", idAgence=" + idAgence +
                '}';
    }


    public void afficherCompte() {
        System.out.println("Compte{" +
                "id=" + id +
                ", numeroCompte='" + numeroCompte + '\'' +
                ", numeroCarte='" + numeroCarte + '\'' +
                ", idAgence=" + idAgence +
                '}');
    }
}

