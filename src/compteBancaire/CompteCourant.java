package compteBancaire;

public class CompteCourant extends Compte {
    protected double solde;
    protected double montant;

    public CompteCourant(double montant, Long userId, String numeroCompte, String numeroCarte, String numeroChequier, Long idAgence) {
        super(userId, numeroCompte, numeroCarte, numeroChequier, idAgence);
        this.montant = montant;
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
