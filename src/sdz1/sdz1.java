package sdz1;

public class sdz1 {
    public static void main(String[] args) {
        double netDansLaPoche = 0;
        int jourPrester = 20;
        final int tjm = 460;
        final double impot = 0.03;
        final double charges = 0.77;
        int fraisKilo = 400;
        final int chiffreAffairesMois = tjm * jourPrester;
        final int salaireDeBasseBrut = 140 * jourPrester;
        final double reductionImpot = (salaireDeBasseBrut * charges) * impot;
        final double salaireApresImpot = (salaireDeBasseBrut * charges) - reductionImpot;
        final int pourcentagePortage = (chiffreAffairesMois * 6) / 100;
        netDansLaPoche = salaireApresImpot - (chiffreAffairesMois - pourcentagePortage - fraisKilo);

        System.out.println("Chiffre d'affaire du mois: " + chiffreAffairesMois);
        System.out.println("Le net final dans la poche: " + netDansLaPoche);
    }
}
