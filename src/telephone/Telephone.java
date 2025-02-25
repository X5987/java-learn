package telephone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Lanceur {
    public static void main(String[] args) {

//        Telephone telephone = new Telephone(1000, "noir", TypeEcran.OLED, "Samsung", 1000,
//                1L, "Samsung", "Galaxy S10", new Date(), "1234567890");
//
//        System.out.println("id: " + telephone.id);
//        System.out.println("date Fabrication: " + telephone.dateDeFabrication);
//        System.out.println("modele: " + telephone.modele);
//
//        System.out.println("nom: " + telephone.nom);
//        System.out.println("prix: " + telephone.prix);
//        System.out.println("ecran: " + telephone.ecran);
//
//        Car car = new Car();
//        car.move();
//        new Vehicle().move();
//        System.out.println(new Vehicle().longos);
//        System.out.println(new Vehicle().floatos);
//
//
//        List<String> names = Arrays.asList("Jean", "Paul");
//        names.forEach((name) -> {
//            System.out.println(name);
//        });
//
//        Box<Integer> boxo = new Box<Integer>();
//        boxo.set(10);
//        System.out.println(boxo.get()); // 10
  //      MyThread thread = new MyThread();
  //      thread.start();

        double firstNbr = 10;
        System.out.println((firstNbr /= 1.5));

    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread en exécution.");
    }
}

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
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

enum TypeEcran {
    LCD, OLED;
}

class Telephone extends Marque {
    int pixel;
    String nom;
    TypeEcran ecran;
    String couleur;
    int prix;

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
