package compteBancaire;

public class Agence {

    private Long id;
    public int numeroAgence;
    public int numeroGuichet;
    public int numeroCodeBanque;
    public int numeroCodeGuichet;
    public Adress adress;

    public Agence(Long id, int numeroAgence, int numeroGuichet, int numeroCodeBanque, int numeroCodeGuichet, Adress adress) {
        this.id = id;
        this.numeroAgence = numeroAgence;
        this.numeroGuichet = numeroGuichet;
        this.numeroCodeBanque = numeroCodeBanque;
        this.numeroCodeGuichet = numeroCodeGuichet;
        this.adress = adress;
    }

}


