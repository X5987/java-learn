package bank;

public class Cheque{
    protected String numeroChequier;

    public Cheque(String numeroChequier) {
        this.numeroChequier = numeroChequier;
    }

    public void afficherCheque() {
        System.out.println("Numero de cheque: " + this.numeroChequier);
    }
}
