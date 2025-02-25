package hello;

enum Direction {
    north, east, south, west;
}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}

class Telephone {
    int pixel;
    Marque marque;
    String couleur;
    String os;

    public Telephone(int pixel, Marque marque, String couleur, String os) {
        this.pixel = pixel;
        this.marque = marque;
        this.couleur = couleur;
        this.os = os;
    }

    public Telephone(int pixel, Marque marque, String os) {
        this(pixel, marque, "unknown", os);
    }
}

public class testosterone {
    public static void main(String[] args) {
        Telephone sonic = new Telephone(50, new Marque("Motorola"), "red", "android");
        System.out.println(sonic.couleur);
        System.out.println(sonic.marque.nom);
        System.out.println(sonic.os);
        System.out.println(sonic.pixel);
    }

}




