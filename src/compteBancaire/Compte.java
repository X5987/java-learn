package compteBancaire;

public class Compte {

    private Long id;
    protected Long userId;
    protected String numeroCompte;
    protected String numeroCarte;
    protected String numeroChequier;
    protected Long idAgence;

    public Compte(Long userId, String numeroCompte, String numeroCarte, String numeroChequier, Long idAgence) {
        this.userId = userId;
        this.numeroCompte = numeroCompte;
        this.numeroCarte = numeroCarte;
        this.numeroChequier = numeroChequier;
        this.idAgence = idAgence;
    }

}

