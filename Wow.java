import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

  private static Spieler duSpieler;

  private static void printMap(Map map) {
    System.out.println("--------- KARTE ----------");
    System.out.println();

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
      System.out.println();
      System.out.println("--------------------------");
  }

  private static void spielbeginn() {

    System.out.println("Hallo" + ", willkommen in der World of Warcraft. Du befindest dich auf der Insel Idris.");
    System.out.println(
        "Verwende die Tasten 'W', 'A', 'S' und 'D' um dich zu bewegen, wenn du ein Blick in dein Rucksack werfen möchtest, verwende hierzu 'I'.");
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

  private static void missionAnnahme(int x, int y, int bobX, int bobY) throws IOException{


    if(x == bobX && y == bobY) {
      System.out.println("*Es kommt eine Person auf dich zu, die sehr alt aussieht*");
      System.out.println("Hey du, ich bin Bobby, magst du mir bei etwas helfen? Y/N");
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String befehln = br.readLine();

        switch (befehln.toLowerCase()) {
        case "n":
        System.out.println("Okey, na gut.. Komm wieder wenn du Zeit hast.");
        break;
        case "y":
        System.out.println("Du bist aber nett, du siehst so Mutig und stark aus.. Magst du den Kobold für mich töten? Ich bin viel zu alt ");
        System.out.println("und er hat mir meinen Rollstuhl geklaut :(. Y/N");
        break;
  }
    String befehln2 = br.readLine();

        switch (befehln2.toLowerCase()) {
        case "y":
        System.out.println("Danke dir. *Du hast eine Mission erhalten; Töte den Kobold*");
        System.out.println();
        System.out.println("*Du gehst weg und plötzlich wirst du von hinten angetippt*");
        System.out.println("*Du drehst dich um und triffst auf ein junges Mädchen*");
        System.out.println("Hi, mein name ist Katie, ich hab' eben bei deinem Gespräch mit Bobby zufälliger Weise zugehört und der Kobold hat auch etwas von mir genommen.. Alsooo helfe ich dir, damit du den Kobold so schnell wie möglich los wirst. Es gibt in den alten Ruinen von Idris ein Schwert.. Zumindestens laut Legende, es ist grünfarbig, genauso wie der Kobold! Es wurde geschaffen um den Kobold zu besiegen, vielleicht findest du es ja. Viel Glück Fremder!");
        break;
        case "n":
        System.out.println("Okey, na gut.. Komm wieder wenn du Zeit hast.");
        break;
      }
    }
  }

  private static void schwertAufnahme(int x, int y, int swX, int swY, Map map) throws IOException{

    if(x == swX && y == swY) {
      MapElement schwert = map.getPositions()[swX][swY].getElement();
      duSpieler.setWaffe1(schwert);
      System.out.println("*Dir wird leicht Schwindelig, du merkst hier ist etwas anders. Du schaust dich um und findest eine alte Truhe, du gehst hin um sie zu öffnen und erhälst folgendes: Das Koboldi-Schwert*");
    }
  }

  private static void koboldTreff(int x, int y, int kobX, int kobY) throws IOException{

    if(x == kobX && y == kobY) {
      System.out.println("*Du hörst ein fieses Lachen und du siehst einen kleinen Schatten der hin und her springt*");
      System.out.println("Duu.. du hättest nicht kommen sollen, der alte Mann hat dich wohl geschickt was?");
      System.out.println("Ach du bist so naiv, hehehe. Willst du mich etwa herausfordern? Y/N");
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String befehlen = br.readLine();
      
        switch (befehlen.toLowerCase()) {
        case "n":
        System.out.println("*Als du gehen wolltest, hat dich der Kobold überfallen und du bist gestorben*");
        System.out.println("Starte deine Reise erneut um den Kobold zu besiegen!");
        System.exit(0);
        break;
        case "y":
        System.out.println("HAHHAH Dann zeig mal was du kannst, kleiner Bengel");
        System.out.println("*Der Kobold springt hinter einem Stein hervor und landet vor deinen Füßen*");
        System.out.println("Was machst du? 1/2");
        System.out.println("1: Du attackierst ihn");
        System.out.println("2: Du rennst weg.");
        break;
    }
      String befehlen2 = br.readLine();

        switch (befehlen2.toLowerCase()) {
        
        case "2":
        System.out.println("*Als du rennen wolltest, hat dich der Kobold überfallen und du bist gestorben*");
        System.out.println("Starte deine Reise erneut um den Kobold zu besiegen!");
        System.exit(0);
        break;
        case "1":

        if(duSpieler.getWaffe1() != null) {
        System.out.println("*Du hast den Kobold mit deinem Schwert getroffen, er hat seine Hand verloren*");
        System.out.println("*Er schaut dich mit einem Todesblick an* Dich mache ich kalt!");
        System.out.println("*Der böse Kobold versucht dich anzugreifen* Was machst du? 1/2");
        System.out.println("1: Du versuchst seinen Schlag abzuwehren");
        System.out.println("2: Du startest einen Gegenangriff");
        } else {
          System.out.println("Da du nur einen Knüppel hattest, wurdest du gnadenlos vom Kobold fertig gemacht. Starte das Spiel neu, um den Kobold zu besiegen.");
          System.exit(0);
        }
        break;
    }
      String befehlen3 = br.readLine();
    
        switch (befehlen3.toLowerCase()) {
        
        case "1":
        System.out.println("*Du konntest den Kobold erfolgreich abwehren, der Kampf geht weiter* Was machst du? 3/4");
        System.out.println("'Tackle' (3): Du führst einen Fußkick aus und schwingst danach dein Schwert um den Kampf ein Ende zu setzen");
        System.out.println("'Heldenhieb' (4): Du springst in Richtung Kobold und führst dein Schwert über deinem Kopf und schlägst auf den Kobold ein");

        String befehlen5 = br.readLine();

        switch(befehlen5.toLowerCase()) {
          case "3":
          System.out.println("*Du hast deinen Tackle erfolgreich ausgeführt* Der Kobold liegt am Boden, die Insel wurde gerettet. Idris feiert eine riesen Veranstaltung und du bist der Held, über den alle berichten. Generationen werden von dir schwärmen. Danke für's spielen!");
          System.exit(0);
          break;

          case "4":
          System.out.println("*Du hast deinen Heldenhieb erfolgreich ausgeführt* Der Kobold wurde besiegt, die Insel wurde gerettet. Idris feiert eine riesen Veranstaltung und du bist der Held, über den alle berichten. Generationen werden von dir schwärmen. Danke für's spielen!");
          System.exit(0);
          break;

        }
        break;

        case "2":
        System.out.println("*Dein Gegenangriff hat den Kobold enorm geschwächt*");
        System.out.println("Der Kobold liegt am Boden, du könntest ihn töten. Wirst du ihn verschonen, mit der Bedingung,");
        System.out.println("dass er die Inselbewohner in Ruhe lässt und ihn alles zurück gibt, oder wirst du ihn töten, damit es endgültig ein Ende gibt? 1/2");
        System.out.println("1: Du verschonst ihn");
        System.out.println("2: Du tötest ihn");
        break;
    }
      String befehlen4 = br.readLine();
        
      switch(befehlen4.toLowerCase()) {
      
      case "1":
      System.out.println("*Du hast den Kobold verschont & er ist dir sehr Dankbar. Idris veranstaltet eine Feier, um dich zu ehren, dass du sie von ihren Leid befreit hast. Der Kobold wurde zum Freund und hilft den Leuten wo er kann, du hast ihn gerettet. Danke für's Spielen!");
      System.exit(0);
      break;

      case "2":
      System.out.println("Du hast die Insel von ihrem Leid befreit, du bist der Held von Idris und von Generation zu Generation wird von dir erzählt. Idris veranstaltet eine Feier, um dich zu ehren, dass du ihnen Freiheit geschenkt hast. Danke für's Spielen!");
      System.exit(0);
      break;
    }
      String befehlen5 = br.readLine();

      switch(befehlen5.toLowerCase()) {

    }
  }  
}
  
  public static void main(String[] args) throws IOException {
    Map map = new Map(9, 9);

    spielbeginn();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String befehl;

    duSpieler = new Spieler(0, "Du", 14, 6);
    Person bobby = new Person(1, "Markt", 153, "m");
    Kobold boeserKobold = new Kobold(2, "Missionsgebiet: Die Koboldshöhle", 3, 4);
    Schwert schwert = new Schwert (3 ,"Koboldi-Schwert");

    map.placeElement(6,1, boeserKobold);
    map.placeElement(2,4, bobby);
    map.placeElement(6,6, schwert);

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
          missionAnnahme(x, y, 2, 4);
          koboldTreff(x, y, 6, 1);
          schwertAufnahme(x, y, 6, 6, map);
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
          missionAnnahme(x, y, 2, 4);
          koboldTreff(x, y, 6, 1);
          schwertAufnahme(x, y, 6, 6, map);
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
              missionAnnahme(x, y, 2, 4);
              koboldTreff(x, y, 6, 1);
              schwertAufnahme(x, y, 6, 6, map);
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
          missionAnnahme(x, y, 2, 4);
          koboldTreff(x, y, 6, 1);
          schwertAufnahme(x, y, 6, 6, map);
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
        
              if(duSpieler.getWaffe1() != null) {
              System.out.println("Du besitzt ein " + duSpieler.getWaffe1().getDisplayName() + ".");
              } else {
                System.out.println(
                  "Du bist noch am Anfang des Spiels, deshalb befindet sich in deinem Rucksack nur ein einziger Gegenstand; ein Knüppel.");
              }

              break;
        default:
          System.err.println("Mach keinen Unsinn! Du fällst noch hin..");

      }
    }
  }
}
