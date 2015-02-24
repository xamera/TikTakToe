
/**
 * Grafiken für TicTakToe
 * 
 * @author Keanu und Xaver
 * @version Baum 432.0
 */
public class TicTakToeGrafiken
{
    private int[][] feld;
    
    public TicTakToeGrafiken() {
        feld=new int [3][3];
    } 
    
    public void printFelder() {
       for(int zeile = 0; zeile < 3 ;) {
           for(int spalte = 0; spalte < 3 ;) {
               if(feld[zeile][spalte]==0) {
                   System.out.print("□");
               }
               else if(feld[zeile][spalte]==1) {
                   System.out.print("✘");
               }
               else if(feld[zeile][spalte]==2) {
                   System.out.print("●");
               }
               spalte++;
           }
           System.out.println();
           zeile++;
       }
    }
    
    //public boolean besetzteFeld(int spieler,int zeile,int spalte)
    public void besetzteFeld(int spieler,int zeile,int spalte)
    {
        //boolean besetzt=false;
        if(feld[zeile-1][spalte-1] == 0) {
            if(0 < zeile && zeile < 4 && 0 < spalte && spalte < 4) {
                feld[zeile-1][spalte-1] = spieler;
                feld[zeile-1][spalte-1] = spieler;
                feld[zeile-1][spalte-1] = spieler;
                //besetzt = true;
            }
            else {
                System.out.println("Bei TicTakToe gibt es 3 Zeilen und 3 Spalten nicht mehr und nicht weniger");
            }
        }
        else {
            System.out.println("Dieses Feld ist schon besetzt");
        }
        //return besetzt;
    }
    
    public int unbelegteFelder() {
        int belegteFelder = 0;
        if(feld[0][0]==0)
        belegteFelder++;
        if(feld[0][1]==0)
        belegteFelder++;
        if(feld[0][2]==0)
        belegteFelder++;
        if(feld[1][0]==0)
        belegteFelder++;
        if(feld[1][1]==0)
        belegteFelder++;
        if(feld[1][2]==0)
        belegteFelder++;
        if(feld[2][0]==0)
        belegteFelder++;
        if(feld[2][1]==0)
        belegteFelder++;
        if(feld[2][2]==0)
        belegteFelder++;
        return belegteFelder;
    }
    
    public int spielGewinner() {
        int rueck = 0;
        boolean spieler1 = false;
        boolean spieler2 = false;
             if(feld[0][0]==1 && feld[0][1]==1 && feld[0][2]==1)
            spieler1=true;
        else if(feld[1][0]==1 && feld[1][1]==1 && feld[1][2]==1)
            spieler1=true;
        else if(feld[2][0]==1 && feld[2][1]==1 && feld[2][2]==1)
            spieler1=true;
        else if(feld[0][0]==1 && feld[1][0]==1 && feld[2][0]==1)
            spieler1=true;
        else if(feld[0][1]==1 && feld[1][1]==1 && feld[2][1]==1)
            spieler1=true;
        else if(feld[0][2]==1 && feld[1][2]==1 && feld[2][2]==1)
            spieler1=true;
        else if(feld[0][0]==1 && feld[1][1]==1 && feld[2][2]==1)
            spieler1=true;
        else if(feld[0][2]==1 && feld[1][1]==1 && feld[2][0]==1)
            spieler1=true;
        else if(feld[0][0]==2 && feld[0][1]==2 && feld[0][2]==2)
            spieler2=true;
        else if(feld[1][0]==2 && feld[1][1]==2 && feld[1][2]==2)
            spieler2=true;
        else if(feld[2][0]==2 && feld[2][1]==2 && feld[2][2]==2)
            spieler2=true;
        else if(feld[0][0]==2 && feld[1][0]==2 && feld[2][0]==2)
            spieler2=true;
        else if(feld[0][1]==2 && feld[1][1]==2 && feld[2][1]==2)
            spieler2=true;
        else if(feld[0][2]==2 && feld[1][2]==2 && feld[2][2]==2)
            spieler2=true;
        else if(feld[0][0]==2 && feld[1][1]==2 && feld[2][2]==2)
            spieler2=true;
        else if(feld[0][2]==2 && feld[1][1]==2 && feld[2][0]==2)
            spieler2=true;
            
        if(spieler1 == false && spieler2 == false)
            rueck = 0;
        else if(spieler1 == true && spieler2 == false)
            rueck = 1;
        else if(spieler1 == false && spieler2 == true)
            rueck = 2;
        
        return rueck;
    }
    
    public boolean spielEnde() {
        boolean spielGehtWeiter = false;
        if(unbelegteFelder() != 0)
            spielGehtWeiter = true;
        if(spielGewinner()==1)
            spielGehtWeiter = false;
        if(spielGewinner()==2)
            spielGehtWeiter = false;
        return spielGehtWeiter;
    }
}



























