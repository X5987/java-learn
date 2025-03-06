package telephone;
import java.util.Date;

class launcher {
    public static void main(String[] args) {
    }
}

abstract class Marque {
    Long id;
    String nomDeMarque;
    String modele;
    Date dateDeFabrication;
    String numDeSerie;

    public Marque(Long id, String nomDeMarque, String modele, Date dateDeFabrication, String numDeSerie) {
        this.id = id;
        this.nomDeMarque = nomDeMarque;
        this.modele = modele;
        this.dateDeFabrication = dateDeFabrication;
        this.numDeSerie = numDeSerie;
    }
}

public class Telephone extends Marque {
    public int pixel;
    public String nom;
    public TypeEcran ecran;
    public String couleur;
    public int prix;

    public Telephone(int prix, String couleur, TypeEcran ecran, String nom, int pixel,
                     Long id, String nomDeMarque, String modele, Date dateDeFabrication, String numDeSerie) {

        super(id, nomDeMarque, modele, dateDeFabrication, numDeSerie);
        this.prix = prix;
        this.couleur = couleur;
        this.ecran = ecran;
        this.nom = nom;
        this.pixel = pixel;
    }
}

class Vehicle {

    Byte bytos = 10;
    Short sholty = 20;
    int intos = 50;
    Long longos = 50000L + 10 * (bytos + sholty + intos);

    float floatos = 5.25f;

    public void move() {
        System.out.println("Véhicule en mouvement.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Voiture roule sur la route.");
    }
}
