package controller;

import java.util.Scanner;

/* In deze serie opdrachten zijn verschillende methodes uitgeschreven.
 * Methode 1 toont 4 lijnen van 4 asterisks
 * Methode 2 print een gekozen woord 5 keer
 * Methode 3 is een methode om eerlijk geld te verdelen tussen meerdere personen.
 * Als geld niet verder verdeelt kan worden, blijft het restant in de pot zitten.
 * Methode 4 is een functie voor het berekenen van wisselgeld. Het rond af op 0,05 nauwkeurig.
 * Met vriendelijke groet, Danny Kwant */
public class MathEnMethodenController {

    static Scanner input = new Scanner(System.in);

    // Public methoden
    public static void toonSterrenVierkant() {

        System.out.println(" * * * * ");
        System.out.println(" * * * * ");
        System.out.println(" * * * * ");
        System.out.println(" * * * * ");

    }

    public static void toonWoordVijfKeer(String mpWoord) {

        for (int i = 0; i < 5; i++) {
            System.out.print(mpWoord);
        }

    }

    public static void eerlijkVerdelen(int aantalEuromunten, int aantalPersonen) {
        int overgeblevenEuroMunten = aantalEuromunten % aantalPersonen;
        int muntenPerPersoon = (aantalEuromunten - overgeblevenEuroMunten) / aantalPersonen;
        System.out.printf("Als je %d euromunten verdeeld over %d mensen dan krijgt ieder %d munten en blijven er %d in de pot over.", aantalEuromunten, aantalPersonen, muntenPerPersoon, overgeblevenEuroMunten);

    }

    public static double berekenWisselgeld(double mpTeBetalen, double mpBetaald) {
        double wisselgeld = mpBetaald - mpTeBetalen;
        return Math.round(wisselgeld * 20.0) / 20.0;
    }

    public static void main(String[] args) {

        // Methode 1
        toonSterrenVierkant();

        // Methode 2
        toonWoordVijfKeer("Snert");

        // Methode 3
        System.out.print("Hoeveel euromunten wil je verdelen? ");
        int aantalEuromunten = input.nextInt();
        System.out.print("Over hoeveel personen wil je het verdelen?");
        int aantalPersonen = input.nextInt();
        eerlijkVerdelen(aantalEuromunten, aantalPersonen);

        // Methode 4
        System.out.print("Hoeveel moet je betalen? ");
        double mpTeBetalen = input.nextDouble();
        System.out.print("Hoeveel heb je gegeven? ");
        double mpBetaald = input.nextDouble();

        System.out.printf("Je krijgt %.2f terug.%n", berekenWisselgeld(mpTeBetalen, mpBetaald));

    }

}
