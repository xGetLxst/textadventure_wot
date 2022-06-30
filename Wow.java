import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

  private static Spieler duSpieler;

  private static void printMap(Map map) {
    System.out.println("--------- KARTE ----------");
    System.out.println("");

    for (int y = 8; y >= 0; y--) {
      for (int x = 0; x <= 8; x++) {
        
        if(duSpieler.getX() == x && duSpieler.getY() == y) {
          System.out.print(duSpieler.getSymbol());
        } else {
          System.out.print(map.getPositions()[x][y].getElement().getSymbol());
        }
      }
      System.out.println();
    }
      System.out.println("");
      System.out.println("--------------------------");
  }

  private static void Spielbeginn() {

    System.out.println("Hallo" + ", willkommen in der World of Warcraft. Du befindest dich auf der Insel Idris.");
    System.out.println(
        "Verwende die Tasten 'W', 'A', 'S' und 'D' um dich zu bewegen, wenn du ein Blick in dein Inventar werfen möchtest, verwende hierzu 'I'.");
    System.out.println("Mit 'Q' verlässt du das Spiel.");
    System.out.println("Zu Beginn des Spiels, hast du eine Karte erhalten, mit der du dich besser zurecht finden kannst.");
    System.out.println("'~' stellt das Meer dar.");
    System.out.println("'$' stellt die Bäume bzw. den Wald dar.");
    System.out.println("'x' stellt den Weg dar.");
    System.out.println("'#' stellt die Ruinen von Idris dar.");
    System.out.println("'?' stellt das unbekannte Gebiet dar, dort solltest du zunächst erstmal nicht hingehen.");
    System.out.println("Andere Buchstaben & ähnliches sind NPC's mit denen du reden oder kämpfen kannst. Viel Spaß bei deiner Reise!");
    System.out.println("Starte deine Reise mit 'T'");
    System.out.println();
  }

  public static void main(String[] args) throws IOException {
    Map map = new Map(8, 8);

    Spielbeginn();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String befehl;

    duSpieler = new Spieler(0, "Du", 14, 6);
    Person bobby = new Person(1, "Bobby", 153, "m");
    Kobold boeserKobold = new Kobold(2, "Böser Kobold", 3, 4);


    map.placeElement(6,1, boeserKobold);
    map.placeElement(2,4, bobby);
    

    printMap(map);

    int x = 0;
    int y = 0;

    while ((befehl = br.readLine()) != null) {
      switch (befehl.toLowerCase()) {
        
      case "w":
          if(y == map.getmaxY() -1){
            System.out.println("HALLO HIER IST DAS MEER WILLST DU SCHWIMMEN ODER WAS?!!");
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
          System.out.println("HALLO HIER IST DAS MEER WILLST DU SCHWIMMEN ODER WAS?!!");
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
          System.out.println("HALLO HIER IST DAS MEER WILLST DU SCHWIMMEN ODER WAS?!!");
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
          System.out.println("HALLO HIER IST DAS MEER WILLST DU SCHWIMMEN ODER WAS?!!");
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
