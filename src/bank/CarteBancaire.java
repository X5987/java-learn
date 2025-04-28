package bank;

public class CarteBancaire {
    protected typeCarte typeCarte;
    protected String emiseDate;
    protected String expireDate;
    private Long BIC;
    private Long IBAN;
    private short codeCVC;
    private short codeAtm;
    protected boolean estActive;
    protected double plafondPaiement;
    protected double plafondRetrait;
    private Long userId;

    public CarteBancaire(typeCarte typeCarte, String emiseDate, String expireDate, Long BIC, Long IBAN, short codeCVC, short codeAtm, boolean estActive, double plafondPaiement, double plafondRetrait, Long userId) {
        this.typeCarte = typeCarte;
        this.emiseDate = emiseDate;
        this.expireDate = expireDate;
        this.BIC = BIC;
        this.IBAN = IBAN;
        this.codeCVC = codeCVC;
        this.codeAtm = codeAtm;
        this.estActive = estActive;
        this.plafondPaiement = plafondPaiement;
        this.plafondRetrait = plafondRetrait;
        this.userId = userId;
    }

    public void afficherCarte() {
        System.out.println("Type de carte: " + this.typeCarte);
        System.out.println("Date d'emission: " + this.emiseDate);
        System.out.println("Date d'expiration: " + this.expireDate);
        System.out.println("BIC: " + this.BIC);
        System.out.println("IBAN: " + this.IBAN);
        System.out.println("Code CVC: " + this.codeCVC);
        System.out.println("Code ATM: " + this.codeAtm);
        System.out.println("Est active: " + this.estActive);
        System.out.println("Plafond de paiement: " + this.plafondPaiement);
        System.out.println("Plafond de retrait: " + this.plafondRetrait);
        System.out.println("User ID: " + this.userId);
    }

}

