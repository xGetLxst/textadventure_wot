import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

  private static Spieler duSpieler;

  private static void printMap(Map map) {
    for (int y = 2; y >= 0; y--) {
      for (int x = 0; x <= 2; x++) {
        System.out.print(map.getPositions()[x][y].getElement().getSymbol());         
      }
      System.out.println();
    }
  }

  

  private static void Spielbeginn() {

    System.out.println("Hallo" + ", willkommen in der World of Warcraft. Du befindest dich auf der Insel Idris.");
    System.out.println(
        "Verwende die Tasten 'W', 'A', 'S' und 'D' um dich zu bewegen, wenn du ein Blick in dein Inventar werfen möchtest, verwende hierzu 'I'.");
    System.out.println("Mit 'Q' verlässt du das Spiel.");
    System.out.println("Starte deine Reise mit 'T'");
    System.out.println();

  }

  public static void main(String[] args) throws IOException {
    Map map = new Map(3, 3);

    Spielbeginn();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String befehl;

    duSpieler = new Spieler(0, "Du", 14, 6);
    Person bobby = new Person(1, "Bobby", 153, "m");
    Kobold boeserKobold = new Kobold(2, "Böser Kobold", 3, 4);

    map.placeElement(0,0, duSpieler);
    map.placeElement(2,1, boeserKobold);
    map.placeElement(2,2, bobby);
    

    printMap(map);

    int x = 0;
    int y = 0;

    while ((befehl = br.readLine()) != null) {
      switch (befehl.toLowerCase()) {
        
      case "w":
          if(y == map.getmaxY() -1){
            System.out.println("Hier ist der Rand der Insel.");
            break;
          }
          y++;
          duSpieler.MoveUp();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Norden gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map.getPositions()[x][y].getElement().getDisplayName());
          break;
        case "d":
        if(x == map.getmaxX() -1){
          System.out.println("Hier ist der Rand der Insel.");
          break;
        }
          x++;
          duSpieler.MoveRight();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Osten gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map.getPositions()[x][y].getElement().getDisplayName());
          break;
        case "s":
        if(y == 0){
          System.out.println("Hier ist der Rand der Insel.");
          break;
        }
          y--;
          duSpieler.MoveDown();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Süden gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map.getPositions()[x][y].getElement().getDisplayName());
          break;
        case "a":
        if(x == 0){
          System.out.println("Hier ist der Rand der Insel.");
          break;
        }
          x--;
          duSpieler.MoveLeft();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Westen gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map.getPositions()[x][y].getElement().getDisplayName());
          break;
        case "q":
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
              System.out.println("Okey! " + "Bewege dich zum Markt, um deine erste Mission zu erhalten. "
                  + "Der Markt befindet sich bei den Koordinaten P(2|3).");
              break;
          }
          break;
        case "":
          System.out.println("Du schläfst gleich ein, bewege dich, um deine Reise fortzusetzen.");
          break;
        case "i":
          System.out.println(
              "Du bist noch am Anfang des Spiels, deshalb befindet sich in deinem Inventar nur ein einziger Gegenstand; ein Holzschwert.");
          break;
        default:
          System.err.println("Mach keinen Unsinn! Du fällst noch hin..");

      }
    }
  }

}
