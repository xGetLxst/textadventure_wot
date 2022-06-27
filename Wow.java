import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

    private static void printMap(MapElement[][] map) {
        for(int n = 7; n >=0 ; n--) {
          for(int m = 0; m < 8; m++) {
            System.out.print(map[m][n].getSymbol()); 
          } 
            System.out.println(); 
        }
    }

    private static MapElement[][] createMap() {

       MapElement[][] map = new MapElement[8][8]; 
        map[0][0] = new Field("Dein Zuhause.");

        for(int n = 0; n < 8; n++) {
          for(int m = 0; m < 8; m++) {
            map[m][n] = new Field ("Hier ist Nichts.");
          } 
        }

        for(int n = 0; n < 8; n++) {
            map[7][n] =  new Field ("Hier ist das Meer.");
            map[n][7] = new Field("Hier ist das Meer.");
        }

        map[1][1] = new Field("Hier ist der Waldweg.");
        map[1][2] = new Field("Hier ist der Wald.");
        map[1][3] = new Field("Hier ist der Wald.");
        map[1][4] = new Field("Hier ist der Wald.");

        map[2][1] = new Field("Hier ist der Waldweg.");
        map[2][2] = new Field("Hier ist der Waldweg.");
        map[2][3] = new Field("Der Marktplatz");
        map[2][4] = new Field("Hier ist der Wald.");

        map[3][1] = new Field("Hier ist der Waldweg.");
        map[3][2] = new Field("Hier ist der Waldweg.");
        map[3][3] = new Field("Hier ist der Waldweg.");
        map[3][4] = new Field("Hier ist der Wald.");

        map[4][1] = new Field("Missionsgebiet: Koboldhöhle");
        map[4][2] = new Field("Hier ist der Wald.");
        map[4][3] = new Field("Hier ist der Wald.");
        map[4][4] = new Field("Hier ist der Wald.");

        map[5][1] = new Field("Hier ist das Meer.");
        map[5][2] = new Field("Hier ist das Meer.");
        map[5][3] = new Field("Hier ist das Meer.");
        map[5][4] = new Field("Hier ist das Meer.");

      return map;
    }


    private static void Spielbeginn() {

      System.out.println("Hallo" + ", willkommen in der World of Warcraft. Du befindest dich auf der Insel Idris.");
        System.out.println("Verwende die Tasten 'W', 'A', 'S' und 'D' um dich zu bewegen, wenn du ein Blick in dein Inventar werfen möchtest, verwende hierzu 'I'.");
        System.out.println("Mit 'Q' verlässt du das Spiel.");
        System.out.println("Starte deine Reise mit 'T'");
        System.out.println();
        
    }
  
    public static void main(String []args) throws IOException {
        MapElement[][] map = createMap();

        Spielbeginn();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String befehl;

   
        Spieler DuSpieler = new Spieler(0, "Du", 14, 6);
        Person bobby = new Person(1, "Bobby", 153, "m");
        Kobold boeserKobold = new Kobold(2, "Böser Kobold", 3, 4);
       
        map[0][0] = DuSpieler;
        map[6][1] = boeserKobold;
        map[2][4] = bobby;
        
        printMap(map);

        int x = 0;
        int y = 0;

        while ((befehl = br.readLine()) != null) {
            switch (befehl.toLowerCase()) {
            case "w":
            y++;
            System.out.println("*Du hast einen Schritt in Richtung Norden gemacht* " + "Ich befinde mich jetzt bei P(" + x + "|" + y + ").");
            System.out.println("Feld: " +  map[x][y].getDisplayName());
            break;
            case "d":
            x++;
            System.out.println("*Du hast einen Schritt in Richtung Osten gemacht* " + "Ich befinde mich jetzt bei P(" + x + "|" + y + ").");
            System.out.println("Feld: " + map[x][y].getDisplayName());
            break;
            case "s":
            y--;
            System.out.println("*Du hast einen Schritt in Richtung Süden gemacht*" + "Ich befinde mich jetzt bei P(" + x + "|" + y + ").");
            System.out.println("Feld: " + map[x][y].getDisplayName());
            break;
            case "a":
            x--;
            System.out.println("*Du hast einen Schritt in Richtung Westen gemacht*" + "Ich befinde mich jetzt bei P(" + x + "|" + y + ").");
            System.out.println("Feld: " + map [x][y].getDisplayName());
            break;
            case"q":
            System.out.println("Willst du wirklich aufgeben? Y/N");
            String bestaetigung = br.readLine();
            switch (bestaetigung.toLowerCase()) {
                case "y":
                System.out.println("Du bist gestorben, starte das Spiel erneut um weiter zu spielen.");
                System.exit(0);
                break;
                case "n":
                System.out.println("Weiter geht die Reise!");
                break;
            }
            
            case "t":
            System.out.println("Hast du die Steuerung verstanden? Verwende Y zum bestätigen.");
            String bestaetigung2 = br.readLine();
            switch (bestaetigung2.toLowerCase()) {
            case "y":
            System.out.println("Okey! " + "Bewege dich zum Markt, um deine erste Mission zu erhalten. " + "Der Markt befindet sich bei den Koordinaten P(2|3).");
            break;
            }
            break;
            case "":
            System.out.println("Du schläfst gleich ein, bewege dich, um deine Reise fortzusetzen.");
            break;
            case "i":
            System.out.println("Du bist noch am Anfang des Spiels, deshalb befindet sich in deinem Inventar nur ein einziger Gegenstand; ein Holzschwert.");
            break;
            default:
            System.err.println("Mach keinen Unsinn! Du fällst noch hin..");

            }
        }
    }   
    
}
