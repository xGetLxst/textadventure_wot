import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

  private static Spieler duSpieler;

  private static void printMap(MapPosition[][] map) {
    for (int y = 8; y >= 0; y--) {
      for (int x = 0; x < 8; x++) {
        System.out.print(map[x][y].getElement().getSymbol());         
      }
      System.out.println();
    }
  }

  private static MapPosition[][] createMap() {

    MapPosition[][] map = new MapPosition[8][9];
    map[0][0] = new MapPosition(new Field("Dein Zuhause."));

    for (int y = 0; y <= 8; y++) {
      for (int x = 0; x < 8; x++) {
        map[x][y] = new MapPosition(new Field("Hier ist Nichts."));
      }
    }

    for (int n = 0; n < 8; n++) {
      map[7][n] = new MapPosition(new Field("Hier ist das Meer."));
      map[n][8] = new MapPosition(new Field("Hier ist das Meer."));
    }

    map[0][1] = new MapPosition(new Meer());
    map[0][2] = new MapPosition(new Meer());
    map[0][3] = new MapPosition(new Meer());
    map[0][4] = new MapPosition(new Meer());
    map[0][5] = new MapPosition(new Meer());
    map[0][6] = new MapPosition(new Meer());
    map[0][7] = new MapPosition(new Meer());
    map[0][8] = new MapPosition(new Meer());

    map[1][0] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[1][1] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[1][2] = new MapPosition(new Wald());
    map[1][3] = new MapPosition(new Wald());
    map[1][4] = new MapPosition(new Wald());
    map[1][5] = new MapPosition(new Wald());
    map[1][6] = new MapPosition(new Wald());
    map[1][7] = new MapPosition(new Wald());
    map[1][8] = new MapPosition(new Wald());

    map[2][0] = new MapPosition(new Meer());
    map[2][1] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[2][2] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[2][3] = new MapPosition(new Field("Der Marktplatz"));
    map[2][4] = new MapPosition(new Field("Hier ist der Markt."));
    map[2][5] = new MapPosition(new Wald());
    map[2][6] = new MapPosition(new Wald());
    map[2][7] = new MapPosition(new Wald());
    map[2][8] = new MapPosition(new Wald());

    map[3][0] = new MapPosition(new Meer());
    map[3][1] = new MapPosition(new Wald());
    map[3][2] = new MapPosition(new Wald());
    map[3][3] = new MapPosition(new Wald());
    map[3][4] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[3][5] = new MapPosition(new Wald());
    map[3][6] = new MapPosition(new Wald());
    map[3][7] = new MapPosition(new Wald());
    map[3][8] = new MapPosition(new Wald());

    map[4][0] = new MapPosition(new Meer());
    map[4][1] = new MapPosition(new Wald());
    map[4][2] = new MapPosition(new Wald());
    map[4][3] = new MapPosition(new Wald());
    map[4][4] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[4][5] = new MapPosition(new Wald());
    map[4][6] = new MapPosition(new Wald());
    map[4][7] = new MapPosition(new Wald());
    map[4][8] = new MapPosition(new Wald());

    map[5][0] = new MapPosition(new Meer());
    map[5][1] = new MapPosition(new Field("Missionsgebiet: Die Koboldshöhle."));
    map[5][2] = new MapPosition(new Field("Missionsgebiet: Die Koboldshöhle."));
    map[5][3] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[5][4] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[5][5] = new MapPosition(new Wald());
    map[5][6] = new MapPosition(new Ruinen());
    map[5][7] = new MapPosition(new Ruinen());
    map[5][8] = new MapPosition(new Meer());

    map[6][0] = new MapPosition(new Meer());
    map[6][1] = new MapPosition(new Field("Missionsgebiet: Die Koboldshöhle."));
    map[6][2] = new MapPosition(new Field("Missionsgebiet: Die Koboldshöhle."));
    map[6][3] = new MapPosition(new Wald());
    map[6][4] = new MapPosition(new Wald());
    map[6][5] = new MapPosition(new Wald());
    map[6][6] = new MapPosition(new Ruinen());
    map[6][7] = new MapPosition(new Ruinen());
    map[6][8] = new MapPosition(new Meer());

    map[7][0] = new MapPosition(new Meer());
    map[7][1] = new MapPosition(new Meer());
    map[7][2] = new MapPosition(new Meer());
    map[7][3] = new MapPosition(new Meer());
    map[7][4] = new MapPosition(new Meer()); 
    map[7][5] = new MapPosition(new Meer());
    map[7][6] = new MapPosition(new Meer());
    map[7][7] = new MapPosition(new Meer());
    map[7][8] = new MapPosition(new Meer());

    return map;
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
    MapPosition[][] map = createMap();

    Spielbeginn();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String befehl;

    duSpieler = new Spieler(0, "Du", 14, 6);
    Person bobby = new Person(1, "Bobby", 153, "m");
    Kobold boeserKobold = new Kobold(2, "Böser Kobold", 3, 4);

    map[0][0].setSpieler(duSpieler);
    map[6][1].setElement(boeserKobold);
    map[2][4].setElement(bobby);;

    printMap(map);

    int x = 0;
    int y = 0;

    while ((befehl = br.readLine()) != null) {
      switch (befehl.toLowerCase()) {
        case "w":
          y++;
          duSpieler.MoveUp();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Norden gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map[x][y].getElement().getDisplayName());
          break;
        case "d":
          x++;
          duSpieler.MoveRight();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Osten gemacht* " + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map[x][y].getElement().getDisplayName());
          break;
        case "s":
          y--;
          duSpieler.MoveDown();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Süden gemacht*" + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map[x][y].getElement().getDisplayName());
          break;
        case "a":
          x--;
          duSpieler.MoveLeft();
          printMap(map);
          System.out.println("*Du hast einen Schritt in Richtung Westen gemacht*" + "Ich befinde mich jetzt bei P(" + x
              + "|" + y + ").");
          System.out.println("Feld: " + map[x][y].getElement().getDisplayName());
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
