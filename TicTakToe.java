import java.util.Scanner;
/**
 * Ein kleines Tic Tak Toe Spiel.
 * 
 * @author Xaver und Keanu
 * @version 23. 02. 2015
 */
public class TicTakToe {
    
    private Scanner scannerobjekt = new Scanner(System.in);
    private int player;
    private TicTakToeGrafiken spiel = new TicTakToeGrafiken();
   
    public void ticTakToe() {
        System.out.print('\u000C');
        System.out.println("**************************");
        System.out.println("*Willkommen bei TicTakToe*");
        System.out.println("*   Spieler 1 setzt ✘✘  *");
        System.out.println("*   Spieler 2 setzt ●●  *");
        System.out.println("*        Viel Spaß       *");
        System.out.println("**************************");
        while(spiel.spielEnde())
        {
            System.out.println();
            spiel.printFelder();
            System.out.println();
            if((spiel.unbelegteFelder() % 2)==0)
                System.out.println("Spieler 2 ist am Zug");
            else
                System.out.println("Spieler 1 ist am Zug");
            System.out.println("Bitte gib die Zeile ein in die du dich setzten willst: ");
            int setzeZeile = zahlEinlesen();
            System.out.println("Bitte gib die Spalte ein in die du dich setzten willst: ");
            int setzeSpalte = zahlEinlesen();
            spiel.besetzteFeld(spielerAmZug(),setzeZeile,setzeSpalte);
        }
        System.out.println();
        spiel.printFelder();
        if(spiel.spielGewinner() == 0)
        {
            System.out.println();
            System.out.println("Das Spiel endet in einem Unentschieden");
        }
        if(spiel.spielGewinner() == 1)
        {
            System.out.println();
            System.out.println("Das Spiel endet mit einem Sieg von Spieler 1");
        }
        if(spiel.spielGewinner() == 2)
        {
            System.out.println();
            System.out.println("Das Spiel endet mit einem Sieg von Spieler 2");
        }
    }
    
    private int zahlEinlesen() {
        boolean unfertig=true;
        int rueckgabe=0;
        while(unfertig)
        {
            if(scannerobjekt.hasNextInt()) {
                rueckgabe = scannerobjekt.nextInt();
                unfertig = false;
            }
            else {
                System.out.println("Das ist keine gültige Zahl");
                System.out.println("Bitte nochmal eingeben: ");
            }
        }
        return rueckgabe;
    }
    
    private int spielerAmZug() {
        int rueck = spiel.unbelegteFelder() % 2;
        if(rueck == 0)
        rueck = 2;
        return rueck;
    }
}

















