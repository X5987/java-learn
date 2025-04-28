package bank;

public class CompteCourant extends Compte {
    protected double solde;
    protected double montant;

    public CompteCourant(String numeroCompte, String numeroCarte, Long idAgence) {
        this(numeroCompte, numeroCarte, idAgence, 4000, 50);
    }

    public CompteCourant(String numeroCompte, String numeroCarte, Long idAgence, double solde, double montant) {
        super(numeroCompte, numeroCarte, idAgence);
        this.solde = solde;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "solde=" + solde +
                ", montant=" + montant +
                "} " + super.toString();
    }


    @Override
    public void afficherCompte() {
        super.afficherCompte();
        System.out.println("va te faire foutre");
    }

    /**
     * Ajoute un montant au montant actuel.
     * @param increment Le montant à ajouter.
     */
    public void incrementMontant(double increment) {
        this.montant += increment;
    }

    /**
     * Soustrait un montant du montant actuel.
     * @param decrement Le montant à soustraire.
     */
    public void decrementMontant(double decrement) {
        this.montant -= decrement;
    }

    /**
     * Met à jour le solde avec le montant actuel, arrondi à deux chiffres après la virgule.
     * @return Le nouveau solde.
     */
    public double soldeView() {
        this.solde = Math.round(montant * 100.0) / 100.0;
        return this.solde;
    }
}
