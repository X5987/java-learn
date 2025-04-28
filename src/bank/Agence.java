package bank;

public class Agence {

    protected Long idAgence;
    public int numeroAgence;
    public int numeroGuichet;
    public int numeroCodeBanque;
    public int numeroCodeGuichet;
    public Adress adress;

    public Agence(Long idAgence, int numeroAgence, int numeroGuichet, int numeroCodeBanque, int numeroCodeGuichet, Adress adress) {
        this.idAgence = idAgence;
        this.numeroAgence = numeroAgence;
        this.numeroGuichet = numeroGuichet;
        this.numeroCodeBanque = numeroCodeBanque;
        this.numeroCodeGuichet = numeroCodeGuichet;
        this.adress = adress;
    }

    public void afficherAgence() {
        System.out.println("INFORMATION AGENCE: ");
        System.out.println("Numero d'agence: " + this.numeroAgence);
        System.out.println("Numero de guichet: " + this.numeroGuichet);
        System.out.println("Numero de code banque: " + this.numeroCodeBanque);
        System.out.println("Numero de code guichet: " + this.numeroCodeGuichet);
        System.out.println("----------------------------");
        this.adress.afficherAdress();
    }

}


