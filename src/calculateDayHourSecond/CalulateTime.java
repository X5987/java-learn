package calculateDayHourSecond;
import telephone.Telephone;
import telephone.TypeEcran;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



class CalulateTime {

    public static void main(String[] args) {




    }

    class Exercice {

        public static void scannerPrompt() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bonjour veuillez entrer 5 numéros : ");
            String ligne = scanner.nextLine();

            int[] tableauDeNum = new int[5];
            System.out.println(Arrays.toString(tableauDeNum));
            int numeroValid = 0;
            int index = 0;
            while (index < 5) {
                try {
                    numeroValid = Integer.parseInt(ligne);
                    tableauDeNum[index] += numeroValid;
                    System.out.println("Continuez vous avez: " + index + " numeros valides");
                    index++;
                    ligne = scanner.nextLine();
                } catch (NumberFormatException badUserData) {
                    System.out.println("Veuillez entrer un nombre valide...");
                    ligne = scanner.nextLine();
                }
            }

            System.out.println("Vous avez : " + Arrays.toString(tableauDeNum) + " numeros valides");
            scanner.close();
        }

        public static boolean isValid(int number) {
            return (number < 10 || number > 1000);
        }

        public static boolean hasSameLastDigit(int num1, int num2, int num3) {
            if (isValid(num1) || isValid(num2) || isValid(num3)) {
                return false;
            }
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;
            int lastDigit3 = num3 % 10;
            return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3);
        }

        public static boolean hasSharedDigit(int num1, int num2) {
            if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
                return false;
            }
            int[] digits1 = {num1 / 10, num1 % 10};
            System.out.println("digits1: " + num1 / 10);
            System.out.println("digits1: " + num1 % 10);
            int[] digits2 = {num2 / 10, num2 % 10};
            for (int digit1 : digits1) {
                for (int digit2 : digits2) {
                    if (digit1 == digit2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1;
            }
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) { //  prend uniquement les chiffres pairs
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }

        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }
            if (number <= 9) {
                return number * 2;
            }
            String nombreStr = String.valueOf(number);
            int premierChiffre = Character.getNumericValue(nombreStr.charAt(0));
            int dernierChiffre = Character.getNumericValue(nombreStr.charAt(nombreStr.length() - 1));
            return premierChiffre + dernierChiffre;
        }
    }

    class CalculteTelephone extends Telephone {
        public CalculteTelephone(int prix, String couleur,
                                 TypeEcran ecran, String nom, int pixel, Long id, String nomDeMarque,
                                 String modele, Date dateDeFabrication, String numDeSerie) {
            super(prix, couleur, ecran, nom, pixel, id, nomDeMarque, modele, dateDeFabrication, numDeSerie);
        }
    }

    class CalculteInteret {

        static void calculInteret() {
            int[] months = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            int i = 0;
            int somme = 100;
            final int pourcentage = 100;
            double taux = 4;
            double interetCumule = 0;

            while (months.length != i) {
                double interest = (somme * taux / pourcentage) * months[i];
                double total = somme + interest;
//                 if (interest > 20) {
//                     System.out.println("Interet supérieur à 20€ contactez votre banque");
//                   break;
//                 }
                System.out.println("Pour " + total + "€ taux de " + taux + "%, interet: " + interest + "€");
                i++;
                interetCumule += interest;
                if (months.length == i) {
                    System.out.println("Total interet cumulé: " + interetCumule + "€");
                }

            }
        }

    }

    class Voiture {
        public String couleur; // Non-static : chaque voiture a sa propre couleur
        public static int totalVoitures = 0; // Static : partagé par toutes les voitures

        public Voiture(String couleur) {
            this.couleur = couleur;
            totalVoitures++; // Incrémente la variable static
        }

        public static void afficherTotal() {
            System.out.println("Total voitures : " + totalVoitures);
        }
    }

}